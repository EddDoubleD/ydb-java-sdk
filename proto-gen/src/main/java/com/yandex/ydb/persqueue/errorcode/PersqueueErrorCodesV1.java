// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kikimr/public/api/protos/persqueue_error_codes_v1.proto

package tech.ydb.persqueue.errorcode;

public final class PersqueueErrorCodesV1 {
  private PersqueueErrorCodesV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   *500000..500999
   * </pre>
   *
   * Protobuf enum {@code Ydb.PersQueue.ErrorCode.ErrorCode}
   */
  public enum ErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>OK = 0;</code>
     */
    OK(0),
    /**
     * <code>INITIALIZING = 500001;</code>
     */
    INITIALIZING(500001),
    /**
     * <code>OVERLOAD = 500002;</code>
     */
    OVERLOAD(500002),
    /**
     * <code>BAD_REQUEST = 500003;</code>
     */
    BAD_REQUEST(500003),
    /**
     * <code>WRONG_COOKIE = 500004;</code>
     */
    WRONG_COOKIE(500004),
    /**
     * <code>SOURCEID_DELETED = 500024;</code>
     */
    SOURCEID_DELETED(500024),
    /**
     * <code>WRITE_ERROR_PARTITION_IS_FULL = 500005;</code>
     */
    WRITE_ERROR_PARTITION_IS_FULL(500005),
    /**
     * <code>WRITE_ERROR_DISK_IS_FULL = 500015;</code>
     */
    WRITE_ERROR_DISK_IS_FULL(500015),
    /**
     * <code>WRITE_ERROR_BAD_OFFSET = 500019;</code>
     */
    WRITE_ERROR_BAD_OFFSET(500019),
    /**
     * <code>CREATE_SESSION_ALREADY_LOCKED = 500006;</code>
     */
    CREATE_SESSION_ALREADY_LOCKED(500006),
    /**
     * <code>DELETE_SESSION_NO_SESSION = 500007;</code>
     */
    DELETE_SESSION_NO_SESSION(500007),
    /**
     * <code>READ_ERROR_IN_PROGRESS = 500008;</code>
     */
    READ_ERROR_IN_PROGRESS(500008),
    /**
     * <code>READ_ERROR_NO_SESSION = 500009;</code>
     */
    READ_ERROR_NO_SESSION(500009),
    /**
     * <code>READ_ERROR_TOO_SMALL_OFFSET = 500011;</code>
     */
    READ_ERROR_TOO_SMALL_OFFSET(500011),
    /**
     * <code>READ_ERROR_TOO_BIG_OFFSET = 500012;</code>
     */
    READ_ERROR_TOO_BIG_OFFSET(500012),
    /**
     * <code>SET_OFFSET_ERROR_COMMIT_TO_FUTURE = 500013;</code>
     */
    SET_OFFSET_ERROR_COMMIT_TO_FUTURE(500013),
    /**
     * <code>TABLET_IS_DROPPED = 500014;</code>
     */
    TABLET_IS_DROPPED(500014),
    /**
     * <code>READ_NOT_DONE = 500016;</code>
     */
    READ_NOT_DONE(500016),
    /**
     * <code>UNKNOWN_TOPIC = 500017;</code>
     */
    UNKNOWN_TOPIC(500017),
    /**
     * <code>ACCESS_DENIED = 500018;</code>
     */
    ACCESS_DENIED(500018),
    /**
     * <code>CLUSTER_DISABLED = 500020;</code>
     */
    CLUSTER_DISABLED(500020),
    /**
     * <code>WRONG_PARTITION_NUMBER = 500021;</code>
     */
    WRONG_PARTITION_NUMBER(500021),
    /**
     * <code>PREFERRED_CLUSTER_MISMATCHED = 500022;</code>
     */
    PREFERRED_CLUSTER_MISMATCHED(500022),
    /**
     * <code>ERROR = 500100;</code>
     */
    ERROR(500100),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>OK = 0;</code>
     */
    public static final int OK_VALUE = 0;
    /**
     * <code>INITIALIZING = 500001;</code>
     */
    public static final int INITIALIZING_VALUE = 500001;
    /**
     * <code>OVERLOAD = 500002;</code>
     */
    public static final int OVERLOAD_VALUE = 500002;
    /**
     * <code>BAD_REQUEST = 500003;</code>
     */
    public static final int BAD_REQUEST_VALUE = 500003;
    /**
     * <code>WRONG_COOKIE = 500004;</code>
     */
    public static final int WRONG_COOKIE_VALUE = 500004;
    /**
     * <code>SOURCEID_DELETED = 500024;</code>
     */
    public static final int SOURCEID_DELETED_VALUE = 500024;
    /**
     * <code>WRITE_ERROR_PARTITION_IS_FULL = 500005;</code>
     */
    public static final int WRITE_ERROR_PARTITION_IS_FULL_VALUE = 500005;
    /**
     * <code>WRITE_ERROR_DISK_IS_FULL = 500015;</code>
     */
    public static final int WRITE_ERROR_DISK_IS_FULL_VALUE = 500015;
    /**
     * <code>WRITE_ERROR_BAD_OFFSET = 500019;</code>
     */
    public static final int WRITE_ERROR_BAD_OFFSET_VALUE = 500019;
    /**
     * <code>CREATE_SESSION_ALREADY_LOCKED = 500006;</code>
     */
    public static final int CREATE_SESSION_ALREADY_LOCKED_VALUE = 500006;
    /**
     * <code>DELETE_SESSION_NO_SESSION = 500007;</code>
     */
    public static final int DELETE_SESSION_NO_SESSION_VALUE = 500007;
    /**
     * <code>READ_ERROR_IN_PROGRESS = 500008;</code>
     */
    public static final int READ_ERROR_IN_PROGRESS_VALUE = 500008;
    /**
     * <code>READ_ERROR_NO_SESSION = 500009;</code>
     */
    public static final int READ_ERROR_NO_SESSION_VALUE = 500009;
    /**
     * <code>READ_ERROR_TOO_SMALL_OFFSET = 500011;</code>
     */
    public static final int READ_ERROR_TOO_SMALL_OFFSET_VALUE = 500011;
    /**
     * <code>READ_ERROR_TOO_BIG_OFFSET = 500012;</code>
     */
    public static final int READ_ERROR_TOO_BIG_OFFSET_VALUE = 500012;
    /**
     * <code>SET_OFFSET_ERROR_COMMIT_TO_FUTURE = 500013;</code>
     */
    public static final int SET_OFFSET_ERROR_COMMIT_TO_FUTURE_VALUE = 500013;
    /**
     * <code>TABLET_IS_DROPPED = 500014;</code>
     */
    public static final int TABLET_IS_DROPPED_VALUE = 500014;
    /**
     * <code>READ_NOT_DONE = 500016;</code>
     */
    public static final int READ_NOT_DONE_VALUE = 500016;
    /**
     * <code>UNKNOWN_TOPIC = 500017;</code>
     */
    public static final int UNKNOWN_TOPIC_VALUE = 500017;
    /**
     * <code>ACCESS_DENIED = 500018;</code>
     */
    public static final int ACCESS_DENIED_VALUE = 500018;
    /**
     * <code>CLUSTER_DISABLED = 500020;</code>
     */
    public static final int CLUSTER_DISABLED_VALUE = 500020;
    /**
     * <code>WRONG_PARTITION_NUMBER = 500021;</code>
     */
    public static final int WRONG_PARTITION_NUMBER_VALUE = 500021;
    /**
     * <code>PREFERRED_CLUSTER_MISMATCHED = 500022;</code>
     */
    public static final int PREFERRED_CLUSTER_MISMATCHED_VALUE = 500022;
    /**
     * <code>ERROR = 500100;</code>
     */
    public static final int ERROR_VALUE = 500100;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ErrorCode valueOf(int value) {
      return forNumber(value);
    }

    public static ErrorCode forNumber(int value) {
      switch (value) {
        case 0: return OK;
        case 500001: return INITIALIZING;
        case 500002: return OVERLOAD;
        case 500003: return BAD_REQUEST;
        case 500004: return WRONG_COOKIE;
        case 500024: return SOURCEID_DELETED;
        case 500005: return WRITE_ERROR_PARTITION_IS_FULL;
        case 500015: return WRITE_ERROR_DISK_IS_FULL;
        case 500019: return WRITE_ERROR_BAD_OFFSET;
        case 500006: return CREATE_SESSION_ALREADY_LOCKED;
        case 500007: return DELETE_SESSION_NO_SESSION;
        case 500008: return READ_ERROR_IN_PROGRESS;
        case 500009: return READ_ERROR_NO_SESSION;
        case 500011: return READ_ERROR_TOO_SMALL_OFFSET;
        case 500012: return READ_ERROR_TOO_BIG_OFFSET;
        case 500013: return SET_OFFSET_ERROR_COMMIT_TO_FUTURE;
        case 500014: return TABLET_IS_DROPPED;
        case 500016: return READ_NOT_DONE;
        case 500017: return UNKNOWN_TOPIC;
        case 500018: return ACCESS_DENIED;
        case 500020: return CLUSTER_DISABLED;
        case 500021: return WRONG_PARTITION_NUMBER;
        case 500022: return PREFERRED_CLUSTER_MISMATCHED;
        case 500100: return ERROR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ErrorCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ErrorCode>() {
            public ErrorCode findValueByNumber(int number) {
              return ErrorCode.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return tech.ydb.persqueue.errorcode.PersqueueErrorCodesV1.getDescriptor().getEnumTypes().get(0);
    }

    private static final ErrorCode[] VALUES = values();

    public static ErrorCode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ErrorCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:Ydb.PersQueue.ErrorCode.ErrorCode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7kikimr/public/api/protos/persqueue_err" +
      "or_codes_v1.proto\022\027Ydb.PersQueue.ErrorCo" +
      "de*\206\005\n\tErrorCode\022\006\n\002OK\020\000\022\022\n\014INITIALIZING" +
      "\020\241\302\036\022\016\n\010OVERLOAD\020\242\302\036\022\021\n\013BAD_REQUEST\020\243\302\036\022" +
      "\022\n\014WRONG_COOKIE\020\244\302\036\022\026\n\020SOURCEID_DELETED\020" +
      "\270\302\036\022#\n\035WRITE_ERROR_PARTITION_IS_FULL\020\245\302\036" +
      "\022\036\n\030WRITE_ERROR_DISK_IS_FULL\020\257\302\036\022\034\n\026WRIT" +
      "E_ERROR_BAD_OFFSET\020\263\302\036\022#\n\035CREATE_SESSION" +
      "_ALREADY_LOCKED\020\246\302\036\022\037\n\031DELETE_SESSION_NO" +
      "_SESSION\020\247\302\036\022\034\n\026READ_ERROR_IN_PROGRESS\020\250",
      "\302\036\022\033\n\025READ_ERROR_NO_SESSION\020\251\302\036\022!\n\033READ_" +
      "ERROR_TOO_SMALL_OFFSET\020\253\302\036\022\037\n\031READ_ERROR" +
      "_TOO_BIG_OFFSET\020\254\302\036\022\'\n!SET_OFFSET_ERROR_" +
      "COMMIT_TO_FUTURE\020\255\302\036\022\027\n\021TABLET_IS_DROPPE" +
      "D\020\256\302\036\022\023\n\rREAD_NOT_DONE\020\260\302\036\022\023\n\rUNKNOWN_TO" +
      "PIC\020\261\302\036\022\023\n\rACCESS_DENIED\020\262\302\036\022\026\n\020CLUSTER_" +
      "DISABLED\020\264\302\036\022\034\n\026WRONG_PARTITION_NUMBER\020\265" +
      "\302\036\022\"\n\034PREFERRED_CLUSTER_MISMATCHED\020\266\302\036\022\013" +
      "\n\005ERROR\020\204\303\036B$\n\"tech.ydb.persqueue." +
      "errorcodeb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
