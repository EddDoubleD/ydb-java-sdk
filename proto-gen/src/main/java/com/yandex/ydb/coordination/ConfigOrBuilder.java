// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/ydb_coordination.proto

package tech.ydb.coordination;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Ydb.Coordination.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Initialized on creation, cannot be set
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * Initialized on creation, cannot be set
   * </pre>
   *
   * <code>string path = 1;</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * Period in milliseconds for self-checks (default 1 second)
   * </pre>
   *
   * <code>uint32 self_check_period_millis = 2;</code>
   * @return The selfCheckPeriodMillis.
   */
  int getSelfCheckPeriodMillis();

  /**
   * <pre>
   * Grace period for sessions on master change (default 10 seconds)
   * </pre>
   *
   * <code>uint32 session_grace_period_millis = 3;</code>
   * @return The sessionGracePeriodMillis.
   */
  int getSessionGracePeriodMillis();

  /**
   * <pre>
   * Concistency mode for read operations
   * </pre>
   *
   * <code>.Ydb.Coordination.ConsistencyMode read_consistency_mode = 4;</code>
   * @return The enum numeric value on the wire for readConsistencyMode.
   */
  int getReadConsistencyModeValue();
  /**
   * <pre>
   * Concistency mode for read operations
   * </pre>
   *
   * <code>.Ydb.Coordination.ConsistencyMode read_consistency_mode = 4;</code>
   * @return The readConsistencyMode.
   */
  tech.ydb.coordination.ConsistencyMode getReadConsistencyMode();

  /**
   * <pre>
   * Consistency mode for attach operations
   * </pre>
   *
   * <code>.Ydb.Coordination.ConsistencyMode attach_consistency_mode = 5;</code>
   * @return The enum numeric value on the wire for attachConsistencyMode.
   */
  int getAttachConsistencyModeValue();
  /**
   * <pre>
   * Consistency mode for attach operations
   * </pre>
   *
   * <code>.Ydb.Coordination.ConsistencyMode attach_consistency_mode = 5;</code>
   * @return The attachConsistencyMode.
   */
  tech.ydb.coordination.ConsistencyMode getAttachConsistencyMode();

  /**
   * <pre>
   * Rate limiter counters mode
   * </pre>
   *
   * <code>.Ydb.Coordination.RateLimiterCountersMode rate_limiter_counters_mode = 6;</code>
   * @return The enum numeric value on the wire for rateLimiterCountersMode.
   */
  int getRateLimiterCountersModeValue();
  /**
   * <pre>
   * Rate limiter counters mode
   * </pre>
   *
   * <code>.Ydb.Coordination.RateLimiterCountersMode rate_limiter_counters_mode = 6;</code>
   * @return The rateLimiterCountersMode.
   */
  tech.ydb.coordination.RateLimiterCountersMode getRateLimiterCountersMode();
}
