// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_coordination.proto

package tech.ydb.coordination;

public interface SessionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.Coordination.SessionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Ydb.Coordination.SessionRequest.PingPong ping = 1;</code>
   * @return Whether the ping field is set.
   */
  boolean hasPing();
  /**
   * <code>.Ydb.Coordination.SessionRequest.PingPong ping = 1;</code>
   * @return The ping.
   */
  tech.ydb.coordination.SessionRequest.PingPong getPing();
  /**
   * <code>.Ydb.Coordination.SessionRequest.PingPong ping = 1;</code>
   */
  tech.ydb.coordination.SessionRequest.PingPongOrBuilder getPingOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.PingPong pong = 2;</code>
   * @return Whether the pong field is set.
   */
  boolean hasPong();
  /**
   * <code>.Ydb.Coordination.SessionRequest.PingPong pong = 2;</code>
   * @return The pong.
   */
  tech.ydb.coordination.SessionRequest.PingPong getPong();
  /**
   * <code>.Ydb.Coordination.SessionRequest.PingPong pong = 2;</code>
   */
  tech.ydb.coordination.SessionRequest.PingPongOrBuilder getPongOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.SessionStart session_start = 3;</code>
   * @return Whether the sessionStart field is set.
   */
  boolean hasSessionStart();
  /**
   * <code>.Ydb.Coordination.SessionRequest.SessionStart session_start = 3;</code>
   * @return The sessionStart.
   */
  tech.ydb.coordination.SessionRequest.SessionStart getSessionStart();
  /**
   * <code>.Ydb.Coordination.SessionRequest.SessionStart session_start = 3;</code>
   */
  tech.ydb.coordination.SessionRequest.SessionStartOrBuilder getSessionStartOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.SessionStop session_stop = 4;</code>
   * @return Whether the sessionStop field is set.
   */
  boolean hasSessionStop();
  /**
   * <code>.Ydb.Coordination.SessionRequest.SessionStop session_stop = 4;</code>
   * @return The sessionStop.
   */
  tech.ydb.coordination.SessionRequest.SessionStop getSessionStop();
  /**
   * <code>.Ydb.Coordination.SessionRequest.SessionStop session_stop = 4;</code>
   */
  tech.ydb.coordination.SessionRequest.SessionStopOrBuilder getSessionStopOrBuilder();

  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_5 = 5;</code>
   * @return Whether the unsupported5 field is set.
   */
  boolean hasUnsupported5();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_5 = 5;</code>
   * @return The unsupported5.
   */
  tech.ydb.coordination.Unsupported getUnsupported5();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_5 = 5;</code>
   */
  tech.ydb.coordination.UnsupportedOrBuilder getUnsupported5OrBuilder();

  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_6 = 6;</code>
   * @return Whether the unsupported6 field is set.
   */
  boolean hasUnsupported6();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_6 = 6;</code>
   * @return The unsupported6.
   */
  tech.ydb.coordination.Unsupported getUnsupported6();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_6 = 6;</code>
   */
  tech.ydb.coordination.UnsupportedOrBuilder getUnsupported6OrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.AcquireSemaphore acquire_semaphore = 7;</code>
   * @return Whether the acquireSemaphore field is set.
   */
  boolean hasAcquireSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.AcquireSemaphore acquire_semaphore = 7;</code>
   * @return The acquireSemaphore.
   */
  tech.ydb.coordination.SessionRequest.AcquireSemaphore getAcquireSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.AcquireSemaphore acquire_semaphore = 7;</code>
   */
  tech.ydb.coordination.SessionRequest.AcquireSemaphoreOrBuilder getAcquireSemaphoreOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.ReleaseSemaphore release_semaphore = 8;</code>
   * @return Whether the releaseSemaphore field is set.
   */
  boolean hasReleaseSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.ReleaseSemaphore release_semaphore = 8;</code>
   * @return The releaseSemaphore.
   */
  tech.ydb.coordination.SessionRequest.ReleaseSemaphore getReleaseSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.ReleaseSemaphore release_semaphore = 8;</code>
   */
  tech.ydb.coordination.SessionRequest.ReleaseSemaphoreOrBuilder getReleaseSemaphoreOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.DescribeSemaphore describe_semaphore = 9;</code>
   * @return Whether the describeSemaphore field is set.
   */
  boolean hasDescribeSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.DescribeSemaphore describe_semaphore = 9;</code>
   * @return The describeSemaphore.
   */
  tech.ydb.coordination.SessionRequest.DescribeSemaphore getDescribeSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.DescribeSemaphore describe_semaphore = 9;</code>
   */
  tech.ydb.coordination.SessionRequest.DescribeSemaphoreOrBuilder getDescribeSemaphoreOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.CreateSemaphore create_semaphore = 10;</code>
   * @return Whether the createSemaphore field is set.
   */
  boolean hasCreateSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.CreateSemaphore create_semaphore = 10;</code>
   * @return The createSemaphore.
   */
  tech.ydb.coordination.SessionRequest.CreateSemaphore getCreateSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.CreateSemaphore create_semaphore = 10;</code>
   */
  tech.ydb.coordination.SessionRequest.CreateSemaphoreOrBuilder getCreateSemaphoreOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.UpdateSemaphore update_semaphore = 11;</code>
   * @return Whether the updateSemaphore field is set.
   */
  boolean hasUpdateSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.UpdateSemaphore update_semaphore = 11;</code>
   * @return The updateSemaphore.
   */
  tech.ydb.coordination.SessionRequest.UpdateSemaphore getUpdateSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.UpdateSemaphore update_semaphore = 11;</code>
   */
  tech.ydb.coordination.SessionRequest.UpdateSemaphoreOrBuilder getUpdateSemaphoreOrBuilder();

  /**
   * <code>.Ydb.Coordination.SessionRequest.DeleteSemaphore delete_semaphore = 12;</code>
   * @return Whether the deleteSemaphore field is set.
   */
  boolean hasDeleteSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.DeleteSemaphore delete_semaphore = 12;</code>
   * @return The deleteSemaphore.
   */
  tech.ydb.coordination.SessionRequest.DeleteSemaphore getDeleteSemaphore();
  /**
   * <code>.Ydb.Coordination.SessionRequest.DeleteSemaphore delete_semaphore = 12;</code>
   */
  tech.ydb.coordination.SessionRequest.DeleteSemaphoreOrBuilder getDeleteSemaphoreOrBuilder();

  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_13 = 13;</code>
   * @return Whether the unsupported13 field is set.
   */
  boolean hasUnsupported13();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_13 = 13;</code>
   * @return The unsupported13.
   */
  tech.ydb.coordination.Unsupported getUnsupported13();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_13 = 13;</code>
   */
  tech.ydb.coordination.UnsupportedOrBuilder getUnsupported13OrBuilder();

  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_14 = 14;</code>
   * @return Whether the unsupported14 field is set.
   */
  boolean hasUnsupported14();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_14 = 14;</code>
   * @return The unsupported14.
   */
  tech.ydb.coordination.Unsupported getUnsupported14();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_14 = 14;</code>
   */
  tech.ydb.coordination.UnsupportedOrBuilder getUnsupported14OrBuilder();

  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_15 = 15;</code>
   * @return Whether the unsupported15 field is set.
   */
  boolean hasUnsupported15();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_15 = 15;</code>
   * @return The unsupported15.
   */
  tech.ydb.coordination.Unsupported getUnsupported15();
  /**
   * <code>.Ydb.Coordination.Unsupported unsupported_15 = 15;</code>
   */
  tech.ydb.coordination.UnsupportedOrBuilder getUnsupported15OrBuilder();

  public tech.ydb.coordination.SessionRequest.RequestCase getRequestCase();
}
