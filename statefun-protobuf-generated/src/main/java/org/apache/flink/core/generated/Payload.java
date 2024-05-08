// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stateful-functions.proto

package org.apache.flink.core.generated;

/**
 * Protobuf type {@code org.apache.flink.statefun.flink.core.Payload}
 */
public  final class Payload extends
    org.apache.flink.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.apache.flink.statefun.flink.core.Payload)
    PayloadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Payload.newBuilder() to construct.
  private Payload(org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Payload() {
    className_ = "";
    payloadBytes_ = org.apache.flink.com.google.protobuf.ByteString.EMPTY;
  }

  @Override
  public final org.apache.flink.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Payload(
      org.apache.flink.com.google.protobuf.CodedInputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
    }
    int mutable_bitField0_ = 0;
    org.apache.flink.com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        org.apache.flink.com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18: {
            String s = input.readStringRequireUtf8();

            className_ = s;
            break;
          }
          case 26: {

            payloadBytes_ = input.readBytes();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (org.apache.flink.com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.apache.flink.com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.flink.core.generated.StatefulFunctions.internal_static_org_apache_flink_statefun_flink_core_Payload_descriptor;
  }

  @Override
  protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.flink.core.generated.StatefulFunctions.internal_static_org_apache_flink_statefun_flink_core_Payload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.flink.core.generated.Payload.class, org.apache.flink.core.generated.Payload.Builder.class);
  }

  public static final int CLASS_NAME_FIELD_NUMBER = 2;
  private volatile Object className_;
  /**
   * <code>string class_name = 2;</code>
   */
  public String getClassName() {
    Object ref = className_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      org.apache.flink.com.google.protobuf.ByteString bs = 
          (org.apache.flink.com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      className_ = s;
      return s;
    }
  }
  /**
   * <code>string class_name = 2;</code>
   */
  public org.apache.flink.com.google.protobuf.ByteString
      getClassNameBytes() {
    Object ref = className_;
    if (ref instanceof String) {
      org.apache.flink.com.google.protobuf.ByteString b = 
          org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      className_ = b;
      return b;
    } else {
      return (org.apache.flink.com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_BYTES_FIELD_NUMBER = 3;
  private org.apache.flink.com.google.protobuf.ByteString payloadBytes_;
  /**
   * <code>bytes payload_bytes = 3;</code>
   */
  public org.apache.flink.com.google.protobuf.ByteString getPayloadBytes() {
    return payloadBytes_;
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(org.apache.flink.com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getClassNameBytes().isEmpty()) {
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.writeString(output, 2, className_);
    }
    if (!payloadBytes_.isEmpty()) {
      output.writeBytes(3, payloadBytes_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClassNameBytes().isEmpty()) {
      size += org.apache.flink.com.google.protobuf.GeneratedMessageV3.computeStringSize(2, className_);
    }
    if (!payloadBytes_.isEmpty()) {
      size += org.apache.flink.com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, payloadBytes_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.flink.core.generated.Payload)) {
      return super.equals(obj);
    }
    org.apache.flink.core.generated.Payload other = (org.apache.flink.core.generated.Payload) obj;

    if (!getClassName()
        .equals(other.getClassName())) return false;
    if (!getPayloadBytes()
        .equals(other.getPayloadBytes())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLASS_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getClassName().hashCode();
    hash = (37 * hash) + PAYLOAD_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getPayloadBytes().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.flink.core.generated.Payload parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(
      java.nio.ByteBuffer data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(byte[] data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(
      byte[] data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.core.generated.Payload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.flink.core.generated.Payload parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(
      org.apache.flink.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.core.generated.Payload parseFrom(
      org.apache.flink.com.google.protobuf.CodedInputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.flink.core.generated.Payload prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.apache.flink.statefun.flink.core.Payload}
   */
  public static final class Builder extends
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.apache.flink.statefun.flink.core.Payload)
      org.apache.flink.core.generated.PayloadOrBuilder {
    public static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.flink.core.generated.StatefulFunctions.internal_static_org_apache_flink_statefun_flink_core_Payload_descriptor;
    }

    @Override
    protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.flink.core.generated.StatefulFunctions.internal_static_org_apache_flink_statefun_flink_core_Payload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.flink.core.generated.Payload.class, org.apache.flink.core.generated.Payload.Builder.class);
    }

    // Construct using org.apache.flink.core.generated.Payload.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        org.apache.flink.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (org.apache.flink.com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      className_ = "";

      payloadBytes_ = org.apache.flink.com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @Override
    public org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.flink.core.generated.StatefulFunctions.internal_static_org_apache_flink_statefun_flink_core_Payload_descriptor;
    }

    @Override
    public org.apache.flink.core.generated.Payload getDefaultInstanceForType() {
      return org.apache.flink.core.generated.Payload.getDefaultInstance();
    }

    @Override
    public org.apache.flink.core.generated.Payload build() {
      org.apache.flink.core.generated.Payload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public org.apache.flink.core.generated.Payload buildPartial() {
      org.apache.flink.core.generated.Payload result = new org.apache.flink.core.generated.Payload(this);
      result.className_ = className_;
      result.payloadBytes_ = payloadBytes_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        org.apache.flink.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(org.apache.flink.com.google.protobuf.Message other) {
      if (other instanceof org.apache.flink.core.generated.Payload) {
        return mergeFrom((org.apache.flink.core.generated.Payload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.flink.core.generated.Payload other) {
      if (other == org.apache.flink.core.generated.Payload.getDefaultInstance()) return this;
      if (!other.getClassName().isEmpty()) {
        className_ = other.className_;
        onChanged();
      }
      if (other.getPayloadBytes() != org.apache.flink.com.google.protobuf.ByteString.EMPTY) {
        setPayloadBytes(other.getPayloadBytes());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        org.apache.flink.com.google.protobuf.CodedInputStream input,
        org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.flink.core.generated.Payload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.flink.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.flink.core.generated.Payload) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object className_ = "";
    /**
     * <code>string class_name = 2;</code>
     */
    public String getClassName() {
      Object ref = className_;
      if (!(ref instanceof String)) {
        org.apache.flink.com.google.protobuf.ByteString bs =
            (org.apache.flink.com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        className_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string class_name = 2;</code>
     */
    public org.apache.flink.com.google.protobuf.ByteString
        getClassNameBytes() {
      Object ref = className_;
      if (ref instanceof String) {
        org.apache.flink.com.google.protobuf.ByteString b = 
            org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        className_ = b;
        return b;
      } else {
        return (org.apache.flink.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string class_name = 2;</code>
     */
    public Builder setClassName(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      className_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string class_name = 2;</code>
     */
    public Builder clearClassName() {
      
      className_ = getDefaultInstance().getClassName();
      onChanged();
      return this;
    }
    /**
     * <code>string class_name = 2;</code>
     */
    public Builder setClassNameBytes(
        org.apache.flink.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      className_ = value;
      onChanged();
      return this;
    }

    private org.apache.flink.com.google.protobuf.ByteString payloadBytes_ = org.apache.flink.com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload_bytes = 3;</code>
     */
    public org.apache.flink.com.google.protobuf.ByteString getPayloadBytes() {
      return payloadBytes_;
    }
    /**
     * <code>bytes payload_bytes = 3;</code>
     */
    public Builder setPayloadBytes(org.apache.flink.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payloadBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload_bytes = 3;</code>
     */
    public Builder clearPayloadBytes() {
      
      payloadBytes_ = getDefaultInstance().getPayloadBytes();
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final org.apache.flink.com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final org.apache.flink.com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.apache.flink.statefun.flink.core.Payload)
  }

  // @@protoc_insertion_point(class_scope:org.apache.flink.statefun.flink.core.Payload)
  private static final org.apache.flink.core.generated.Payload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.flink.core.generated.Payload();
  }

  public static org.apache.flink.core.generated.Payload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.flink.com.google.protobuf.Parser<Payload>
      PARSER = new org.apache.flink.com.google.protobuf.AbstractParser<Payload>() {
    @Override
    public Payload parsePartialFrom(
        org.apache.flink.com.google.protobuf.CodedInputStream input,
        org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
      return new Payload(input, extensionRegistry);
    }
  };

  public static org.apache.flink.com.google.protobuf.Parser<Payload> parser() {
    return PARSER;
  }

  @Override
  public org.apache.flink.com.google.protobuf.Parser<Payload> getParserForType() {
    return PARSER;
  }

  @Override
  public org.apache.flink.core.generated.Payload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

