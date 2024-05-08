// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/wrappers.proto

package org.apache.flink.com.google.protobuf;

/**
 * <pre>
 * Wrapper message for `int32`.
 * The JSON representation for `Int32Value` is JSON number.
 * </pre>
 *
 * Protobuf type {@code google.protobuf.Int32Value}
 */
@javax.annotation.Generated("proto") public  final class Int32Value extends
    org.apache.flink.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.protobuf.Int32Value)
    Int32ValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Int32Value.newBuilder() to construct.
  private Int32Value(org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int32Value() {
  }

  @java.lang.Override
  public final org.apache.flink.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Int32Value(
      org.apache.flink.com.google.protobuf.CodedInputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
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
          case 8: {

            value_ = input.readInt32();
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
    return org.apache.flink.com.google.protobuf.WrappersProto.internal_static_google_protobuf_Int32Value_descriptor;
  }

  @java.lang.Override
  protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.flink.com.google.protobuf.WrappersProto.internal_static_google_protobuf_Int32Value_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.flink.com.google.protobuf.Int32Value.class, org.apache.flink.com.google.protobuf.Int32Value.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private int value_;
  /**
   * <pre>
   * The int32 value.
   * </pre>
   *
   * <code>int32 value = 1;</code>
   */
  public int getValue() {
    return value_;
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
  public void writeTo(org.apache.flink.com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (value_ != 0) {
      output.writeInt32(1, value_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (value_ != 0) {
      size += org.apache.flink.com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, value_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.flink.com.google.protobuf.Int32Value)) {
      return super.equals(obj);
    }
    org.apache.flink.com.google.protobuf.Int32Value other = (org.apache.flink.com.google.protobuf.Int32Value) obj;

    if (getValue()
        != other.getValue()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      java.nio.ByteBuffer data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(byte[] data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      byte[] data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      org.apache.flink.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.com.google.protobuf.Int32Value parseFrom(
      org.apache.flink.com.google.protobuf.CodedInputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.flink.com.google.protobuf.Int32Value prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Wrapper message for `int32`.
   * The JSON representation for `Int32Value` is JSON number.
   * </pre>
   *
   * Protobuf type {@code google.protobuf.Int32Value}
   */
  @javax.annotation.Generated("proto") public static final class Builder extends
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.protobuf.Int32Value)
      org.apache.flink.com.google.protobuf.Int32ValueOrBuilder {
    public static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.flink.com.google.protobuf.WrappersProto.internal_static_google_protobuf_Int32Value_descriptor;
    }

    @java.lang.Override
    protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.flink.com.google.protobuf.WrappersProto.internal_static_google_protobuf_Int32Value_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.flink.com.google.protobuf.Int32Value.class, org.apache.flink.com.google.protobuf.Int32Value.Builder.class);
    }

    // Construct using org.apache.flink.com.google.protobuf.Int32Value.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      value_ = 0;

      return this;
    }

    @java.lang.Override
    public org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.flink.com.google.protobuf.WrappersProto.internal_static_google_protobuf_Int32Value_descriptor;
    }

    @java.lang.Override
    public org.apache.flink.com.google.protobuf.Int32Value getDefaultInstanceForType() {
      return org.apache.flink.com.google.protobuf.Int32Value.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.flink.com.google.protobuf.Int32Value build() {
      org.apache.flink.com.google.protobuf.Int32Value result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.flink.com.google.protobuf.Int32Value buildPartial() {
      org.apache.flink.com.google.protobuf.Int32Value result = new org.apache.flink.com.google.protobuf.Int32Value(this);
      result.value_ = value_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        org.apache.flink.com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        org.apache.flink.com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(org.apache.flink.com.google.protobuf.Message other) {
      if (other instanceof org.apache.flink.com.google.protobuf.Int32Value) {
        return mergeFrom((org.apache.flink.com.google.protobuf.Int32Value)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.flink.com.google.protobuf.Int32Value other) {
      if (other == org.apache.flink.com.google.protobuf.Int32Value.getDefaultInstance()) return this;
      if (other.getValue() != 0) {
        setValue(other.getValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        org.apache.flink.com.google.protobuf.CodedInputStream input,
        org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.apache.flink.com.google.protobuf.Int32Value parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.flink.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.flink.com.google.protobuf.Int32Value) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int value_ ;
    /**
     * <pre>
     * The int32 value.
     * </pre>
     *
     * <code>int32 value = 1;</code>
     */
    public int getValue() {
      return value_;
    }
    /**
     * <pre>
     * The int32 value.
     * </pre>
     *
     * <code>int32 value = 1;</code>
     */
    public Builder setValue(int value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The int32 value.
     * </pre>
     *
     * <code>int32 value = 1;</code>
     */
    public Builder clearValue() {
      
      value_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final org.apache.flink.com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final org.apache.flink.com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.protobuf.Int32Value)
  }

  // @@protoc_insertion_point(class_scope:google.protobuf.Int32Value)
  private static final org.apache.flink.com.google.protobuf.Int32Value DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.flink.com.google.protobuf.Int32Value();
  }

  public static org.apache.flink.com.google.protobuf.Int32Value getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  public static org.apache.flink.com.google.protobuf.Int32Value of(int value) {
    return newBuilder().setValue(value).build();
  }

  private static final org.apache.flink.com.google.protobuf.Parser<Int32Value>
      PARSER = new org.apache.flink.com.google.protobuf.AbstractParser<Int32Value>() {
    @java.lang.Override
    public Int32Value parsePartialFrom(
        org.apache.flink.com.google.protobuf.CodedInputStream input,
        org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
      return new Int32Value(input, extensionRegistry);
    }
  };

  public static org.apache.flink.com.google.protobuf.Parser<Int32Value> parser() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.flink.com.google.protobuf.Parser<Int32Value> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.flink.com.google.protobuf.Int32Value getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

