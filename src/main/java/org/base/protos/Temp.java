// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto

// Protobuf Java Version: 4.26.1
package org.base.protos;

/**
 * Protobuf enum {@code proto.Temp}
 */
public enum Temp
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>any = 0;</code>
   */
  any(0),
  /**
   * <code>hot = 1;</code>
   */
  hot(1),
  /**
   * <code>cold = 2;</code>
   */
  cold(2),
  /**
   * <code>frozen = 3;</code>
   */
  frozen(3),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Temp.class.getName());
  }
  /**
   * <code>any = 0;</code>
   */
  public static final int any_VALUE = 0;
  /**
   * <code>hot = 1;</code>
   */
  public static final int hot_VALUE = 1;
  /**
   * <code>cold = 2;</code>
   */
  public static final int cold_VALUE = 2;
  /**
   * <code>frozen = 3;</code>
   */
  public static final int frozen_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Temp valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Temp forNumber(int value) {
    switch (value) {
      case 0: return any;
      case 1: return hot;
      case 2: return cold;
      case 3: return frozen;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Temp>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Temp> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Temp>() {
          public Temp findValueByNumber(int number) {
            return Temp.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.base.protos.BaseProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Temp[] VALUES = values();

  public static Temp valueOf(
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

  private Temp(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:proto.Temp)
}

