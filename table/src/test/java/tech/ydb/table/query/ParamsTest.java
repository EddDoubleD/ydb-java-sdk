package tech.ydb.table.query;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.truth.extensions.proto.ProtoTruth;
import tech.ydb.ValueProtos;
import tech.ydb.table.values.PrimitiveType;
import tech.ydb.table.values.PrimitiveValue;
import tech.ydb.table.values.Type;
import tech.ydb.table.values.proto.ProtoType;
import tech.ydb.table.values.proto.ProtoValue;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;


/**
 * @author Sergey Polovko
 */
public class ParamsTest {

    @Test
    public void empty() {
        Params params = Params.empty();

        assertThat(params.isEmpty())
            .isTrue();

        assertThat(params.toPb())
            .isEmpty();
    }

    @Test
    public void unknownTypes() {
        Params params = Params.withUnknownTypes()
            .put("name", PrimitiveType.utf8(), PrimitiveValue.utf8("Jamel"))
            .put("age", PrimitiveType.uint8(), PrimitiveValue.uint8((byte) 99));

        assertThat(params.isEmpty())
            .isFalse();

        Map<String, ValueProtos.TypedValue> pb = params.toPb();
        assertThat(pb).isNotEmpty();

        ProtoTruth.assertThat(pb.get("name"))
            .isEqualTo(ValueProtos.TypedValue.newBuilder()
                .setType(ProtoType.utf8())
                .setValue(ProtoValue.utf8("Jamel"))
                .build());

        ProtoTruth.assertThat(pb.get("age"))
            .isEqualTo(ValueProtos.TypedValue.newBuilder()
                .setType(ProtoType.uint8())
                .setValue(ProtoValue.uint8((byte) 99))
                .build());
    }

    @Test
    public void knownTypes() {
        ImmutableMap<String, Type> types = ImmutableMap.of(
            "name", PrimitiveType.utf8(),
            "age", PrimitiveType.uint8());

        Params params = Params.withKnownTypes(types)
            .put("name", PrimitiveValue.utf8("Jamel"))
            .put("age", PrimitiveValue.uint8((byte) 99));

        assertThat(params.isEmpty())
            .isFalse();

        Map<String, ValueProtos.TypedValue> pb = params.toPb();
        assertThat(pb).isNotEmpty();

        ProtoTruth.assertThat(pb.get("name"))
            .isEqualTo(ValueProtos.TypedValue.newBuilder()
                .setType(ProtoType.utf8())
                .setValue(ProtoValue.utf8("Jamel"))
                .build());

        ProtoTruth.assertThat(pb.get("age"))
            .isEqualTo(ValueProtos.TypedValue.newBuilder()
                .setType(ProtoType.uint8())
                .setValue(ProtoValue.uint8((byte) 99))
                .build());
    }
}
