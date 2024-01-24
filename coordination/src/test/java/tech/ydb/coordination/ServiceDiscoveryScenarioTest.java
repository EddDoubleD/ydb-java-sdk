package tech.ydb.coordination;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import tech.ydb.coordination.description.SemaphoreDescription;
import tech.ydb.coordination.scenario.service_discovery.Subscriber;
import tech.ydb.coordination.scenario.service_discovery.Worker;
import tech.ydb.coordination.settings.CoordinationNodeSettings;
import tech.ydb.coordination.settings.DescribeSemaphoreMode;
import tech.ydb.coordination.settings.DropCoordinationNodeSettings;
import tech.ydb.core.Status;
import tech.ydb.test.junit4.GrpcTransportRule;

public class ServiceDiscoveryScenarioTest {
    @ClassRule
    public static final GrpcTransportRule YDB_TRANSPORT = new GrpcTransportRule();
    private final String path = YDB_TRANSPORT.getDatabase() + "/coordination-node";
    private final Duration timeout = Duration.ofSeconds(60);
    private final CoordinationClient client = CoordinationClient.newClient(YDB_TRANSPORT);

    @Before
    public void createNode() {
        CompletableFuture<Status> result = client.createNode(
                path,
                CoordinationNodeSettings.newBuilder()
                        .build()
        );

        Assert.assertTrue(result.join().isSuccess());
    }

    @Test(timeout = 60_000)
    public void serviceDiscoveryTest() {
        try (CoordinationSession checkSession = client.createSession(path)) {
            checkSession.start().join();
            Status create = checkSession.createSemaphore(Worker.SEMAPHORE_NAME, 100).join();
            Assert.assertTrue(create.isSuccess());

            final Worker worker1 = Worker.newWorker(client, path, "endpoint-1", timeout);

            final SemaphoreDescription oneWorkerDescription = checkSession
                    .describeSemaphore(Worker.SEMAPHORE_NAME, DescribeSemaphoreMode.WITH_OWNERS)
                    .join()
                    .getValue();

            Assert.assertEquals("endpoint-1", new String(oneWorkerDescription.getOwnersList().get(0).getData()));
            Assert.assertEquals(1, oneWorkerDescription.getOwnersList().size());

            final Worker worker2 = Worker.newWorker(client, path, "endpoint-2", timeout);

            /* The First knows about The Second */
            try (Subscriber subscriber1 = Subscriber.newSubscriber(client, path)) {
                SemaphoreDescription subscriberOneDescription = subscriber1.getDescription();
                Assert.assertTrue(subscriberOneDescription
                        .getOwnersList()
                        .stream()
                        .anyMatch(semaphoreSession -> "endpoint-2".equals(new String(semaphoreSession.getData())))
                );
                Assert.assertEquals(2, subscriberOneDescription.getOwnersList().size());

                /* The Second knows about The First */
                try (Subscriber subscriber2 = Subscriber.newSubscriber(client, path)) {
                    subscriberOneDescription = subscriber2.getDescription();
                    Assert.assertTrue(subscriberOneDescription
                            .getOwnersList()
                            .stream()
                            .anyMatch(semaphoreSession -> "endpoint-1".equals(new String(semaphoreSession.getData())))
                    );
                    Assert.assertEquals(2, subscriberOneDescription.getOwnersList().size());

                    /* Remove The First worker */
                    final CountDownLatch stopFirstWorkerLatch = new CountDownLatch(1);
                    subscriber2.setUpdateWaiter(stopFirstWorkerLatch::countDown);

                    worker1.stop();

                    Assert.assertTrue(stopFirstWorkerLatch.await(60, TimeUnit.SECONDS));
                    final SemaphoreDescription removeDescription = subscriber2.getDescription();
                    Assert.assertEquals(1, removeDescription.getOwnersList().size());
                    Assert.assertEquals("endpoint-2", new String(removeDescription.getOwnersList().get(0).getData()));
                    Assert.assertEquals(removeDescription,
                            checkSession.describeSemaphore(Worker.SEMAPHORE_NAME, DescribeSemaphoreMode.WITH_OWNERS)
                                    .join()
                                    .getValue());

                    worker2.stop();

                    Status remove = checkSession.deleteSemaphore(Worker.SEMAPHORE_NAME, true).join();
                    Assert.assertTrue(remove.isSuccess());
                }
            }
        } catch (Exception e) {
            Assert.fail("There shouldn't be an exception.");
        }
    }

    @After
    public void deleteNode() {
        CompletableFuture<Status> result = client.dropNode(
                path,
                DropCoordinationNodeSettings.newBuilder()
                        .build()
        );
        Assert.assertTrue(result.join().isSuccess());
    }
}
