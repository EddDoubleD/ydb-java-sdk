// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_coordination.proto

package tech.ydb.coordination;

public interface DescribeNodeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.Coordination.DescribeNodeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   * @return The operation.
   */
  tech.ydb.OperationProtos.Operation getOperation();
  /**
   * <code>.Ydb.Operations.Operation operation = 1;</code>
   */
  tech.ydb.OperationProtos.OperationOrBuilder getOperationOrBuilder();
}
