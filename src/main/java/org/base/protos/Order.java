// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto

// Protobuf Java Version: 4.26.1
package org.base.protos;

/**
 * Protobuf type {@code proto.Order}
 */
public final class Order extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:proto.Order)
    OrderOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Order.class.getName());
  }
  // Use Order.newBuilder() to construct.
  private Order(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Order() {
    id_ = "";
    name_ = "";
    temp_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.base.protos.BaseProto.internal_static_proto_Order_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.base.protos.BaseProto.internal_static_proto_Order_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.base.protos.Order.class, org.base.protos.Order.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEMP_FIELD_NUMBER = 3;
  private int temp_ = 0;
  /**
   * <code>.proto.Temp temp = 3;</code>
   * @return The enum numeric value on the wire for temp.
   */
  @java.lang.Override public int getTempValue() {
    return temp_;
  }
  /**
   * <code>.proto.Temp temp = 3;</code>
   * @return The temp.
   */
  @java.lang.Override public org.base.protos.Temp getTemp() {
    org.base.protos.Temp result = org.base.protos.Temp.forNumber(temp_);
    return result == null ? org.base.protos.Temp.UNRECOGNIZED : result;
  }

  public static final int SHELFLIFE_FIELD_NUMBER = 4;
  private int shelfLife_ = 0;
  /**
   * <code>int32 shelfLife = 4;</code>
   * @return The shelfLife.
   */
  @java.lang.Override
  public int getShelfLife() {
    return shelfLife_;
  }

  public static final int DECAYRATE_FIELD_NUMBER = 5;
  private double decayRate_ = 0D;
  /**
   * <code>double decayRate = 5;</code>
   * @return The decayRate.
   */
  @java.lang.Override
  public double getDecayRate() {
    return decayRate_;
  }

  public static final int PICKUPTIME_FIELD_NUMBER = 6;
  private long pickupTime_ = 0L;
  /**
   * <code>int64 pickupTime = 6;</code>
   * @return The pickupTime.
   */
  @java.lang.Override
  public long getPickupTime() {
    return pickupTime_;
  }

  public static final int ORDERINSERTTIME_FIELD_NUMBER = 7;
  private long orderInsertTime_ = 0L;
  /**
   * <code>int64 orderInsertTime = 7;</code>
   * @return The orderInsertTime.
   */
  @java.lang.Override
  public long getOrderInsertTime() {
    return orderInsertTime_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
    }
    if (temp_ != org.base.protos.Temp.any.getNumber()) {
      output.writeEnum(3, temp_);
    }
    if (shelfLife_ != 0) {
      output.writeInt32(4, shelfLife_);
    }
    if (java.lang.Double.doubleToRawLongBits(decayRate_) != 0) {
      output.writeDouble(5, decayRate_);
    }
    if (pickupTime_ != 0L) {
      output.writeInt64(6, pickupTime_);
    }
    if (orderInsertTime_ != 0L) {
      output.writeInt64(7, orderInsertTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
    }
    if (temp_ != org.base.protos.Temp.any.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, temp_);
    }
    if (shelfLife_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, shelfLife_);
    }
    if (java.lang.Double.doubleToRawLongBits(decayRate_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, decayRate_);
    }
    if (pickupTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, pickupTime_);
    }
    if (orderInsertTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, orderInsertTime_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.base.protos.Order)) {
      return super.equals(obj);
    }
    org.base.protos.Order other = (org.base.protos.Order) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (temp_ != other.temp_) return false;
    if (getShelfLife()
        != other.getShelfLife()) return false;
    if (java.lang.Double.doubleToLongBits(getDecayRate())
        != java.lang.Double.doubleToLongBits(
            other.getDecayRate())) return false;
    if (getPickupTime()
        != other.getPickupTime()) return false;
    if (getOrderInsertTime()
        != other.getOrderInsertTime()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TEMP_FIELD_NUMBER;
    hash = (53 * hash) + temp_;
    hash = (37 * hash) + SHELFLIFE_FIELD_NUMBER;
    hash = (53 * hash) + getShelfLife();
    hash = (37 * hash) + DECAYRATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getDecayRate()));
    hash = (37 * hash) + PICKUPTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPickupTime());
    hash = (37 * hash) + ORDERINSERTTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOrderInsertTime());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.base.protos.Order parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.base.protos.Order parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.base.protos.Order parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.base.protos.Order parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.base.protos.Order parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.base.protos.Order parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.base.protos.Order parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.base.protos.Order parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.base.protos.Order parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.base.protos.Order parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.base.protos.Order parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.base.protos.Order parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.base.protos.Order prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code proto.Order}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:proto.Order)
      org.base.protos.OrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.base.protos.BaseProto.internal_static_proto_Order_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.base.protos.BaseProto.internal_static_proto_Order_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.base.protos.Order.class, org.base.protos.Order.Builder.class);
    }

    // Construct using org.base.protos.Order.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      name_ = "";
      temp_ = 0;
      shelfLife_ = 0;
      decayRate_ = 0D;
      pickupTime_ = 0L;
      orderInsertTime_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.base.protos.BaseProto.internal_static_proto_Order_descriptor;
    }

    @java.lang.Override
    public org.base.protos.Order getDefaultInstanceForType() {
      return org.base.protos.Order.getDefaultInstance();
    }

    @java.lang.Override
    public org.base.protos.Order build() {
      org.base.protos.Order result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.base.protos.Order buildPartial() {
      org.base.protos.Order result = new org.base.protos.Order(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.base.protos.Order result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.temp_ = temp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.shelfLife_ = shelfLife_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.decayRate_ = decayRate_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.pickupTime_ = pickupTime_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.orderInsertTime_ = orderInsertTime_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.base.protos.Order) {
        return mergeFrom((org.base.protos.Order)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.base.protos.Order other) {
      if (other == org.base.protos.Order.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.temp_ != 0) {
        setTempValue(other.getTempValue());
      }
      if (other.getShelfLife() != 0) {
        setShelfLife(other.getShelfLife());
      }
      if (other.getDecayRate() != 0D) {
        setDecayRate(other.getDecayRate());
      }
      if (other.getPickupTime() != 0L) {
        setPickupTime(other.getPickupTime());
      }
      if (other.getOrderInsertTime() != 0L) {
        setOrderInsertTime(other.getOrderInsertTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              temp_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              shelfLife_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 41: {
              decayRate_ = input.readDouble();
              bitField0_ |= 0x00000010;
              break;
            } // case 41
            case 48: {
              pickupTime_ = input.readInt64();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              orderInsertTime_ = input.readInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int temp_ = 0;
    /**
     * <code>.proto.Temp temp = 3;</code>
     * @return The enum numeric value on the wire for temp.
     */
    @java.lang.Override public int getTempValue() {
      return temp_;
    }
    /**
     * <code>.proto.Temp temp = 3;</code>
     * @param value The enum numeric value on the wire for temp to set.
     * @return This builder for chaining.
     */
    public Builder setTempValue(int value) {
      temp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.proto.Temp temp = 3;</code>
     * @return The temp.
     */
    @java.lang.Override
    public org.base.protos.Temp getTemp() {
      org.base.protos.Temp result = org.base.protos.Temp.forNumber(temp_);
      return result == null ? org.base.protos.Temp.UNRECOGNIZED : result;
    }
    /**
     * <code>.proto.Temp temp = 3;</code>
     * @param value The temp to set.
     * @return This builder for chaining.
     */
    public Builder setTemp(org.base.protos.Temp value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      temp_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.proto.Temp temp = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemp() {
      bitField0_ = (bitField0_ & ~0x00000004);
      temp_ = 0;
      onChanged();
      return this;
    }

    private int shelfLife_ ;
    /**
     * <code>int32 shelfLife = 4;</code>
     * @return The shelfLife.
     */
    @java.lang.Override
    public int getShelfLife() {
      return shelfLife_;
    }
    /**
     * <code>int32 shelfLife = 4;</code>
     * @param value The shelfLife to set.
     * @return This builder for chaining.
     */
    public Builder setShelfLife(int value) {

      shelfLife_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 shelfLife = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearShelfLife() {
      bitField0_ = (bitField0_ & ~0x00000008);
      shelfLife_ = 0;
      onChanged();
      return this;
    }

    private double decayRate_ ;
    /**
     * <code>double decayRate = 5;</code>
     * @return The decayRate.
     */
    @java.lang.Override
    public double getDecayRate() {
      return decayRate_;
    }
    /**
     * <code>double decayRate = 5;</code>
     * @param value The decayRate to set.
     * @return This builder for chaining.
     */
    public Builder setDecayRate(double value) {

      decayRate_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>double decayRate = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDecayRate() {
      bitField0_ = (bitField0_ & ~0x00000010);
      decayRate_ = 0D;
      onChanged();
      return this;
    }

    private long pickupTime_ ;
    /**
     * <code>int64 pickupTime = 6;</code>
     * @return The pickupTime.
     */
    @java.lang.Override
    public long getPickupTime() {
      return pickupTime_;
    }
    /**
     * <code>int64 pickupTime = 6;</code>
     * @param value The pickupTime to set.
     * @return This builder for chaining.
     */
    public Builder setPickupTime(long value) {

      pickupTime_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int64 pickupTime = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPickupTime() {
      bitField0_ = (bitField0_ & ~0x00000020);
      pickupTime_ = 0L;
      onChanged();
      return this;
    }

    private long orderInsertTime_ ;
    /**
     * <code>int64 orderInsertTime = 7;</code>
     * @return The orderInsertTime.
     */
    @java.lang.Override
    public long getOrderInsertTime() {
      return orderInsertTime_;
    }
    /**
     * <code>int64 orderInsertTime = 7;</code>
     * @param value The orderInsertTime to set.
     * @return This builder for chaining.
     */
    public Builder setOrderInsertTime(long value) {

      orderInsertTime_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>int64 orderInsertTime = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearOrderInsertTime() {
      bitField0_ = (bitField0_ & ~0x00000040);
      orderInsertTime_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:proto.Order)
  }

  // @@protoc_insertion_point(class_scope:proto.Order)
  private static final org.base.protos.Order DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.base.protos.Order();
  }

  public static org.base.protos.Order getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Order>
      PARSER = new com.google.protobuf.AbstractParser<Order>() {
    @java.lang.Override
    public Order parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Order> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Order> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.base.protos.Order getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
