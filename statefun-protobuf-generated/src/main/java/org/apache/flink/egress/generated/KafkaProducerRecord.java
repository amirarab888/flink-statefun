// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kafka-egress.proto

package org.apache.flink.egress.generated;

/**
 * Protobuf type {@code io.statefun.sdk.egress.KafkaProducerRecord}
 */
public  final class KafkaProducerRecord extends
    org.apache.flink.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.statefun.sdk.egress.KafkaProducerRecord)
    KafkaProducerRecordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KafkaProducerRecord.newBuilder() to construct.
  private KafkaProducerRecord(org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KafkaProducerRecord() {
    key_ = "";
    valueBytes_ = org.apache.flink.com.google.protobuf.ByteString.EMPTY;
    topic_ = "";
  }

  @Override
  public final org.apache.flink.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KafkaProducerRecord(
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
          case 10: {
            String s = input.readStringRequireUtf8();

            key_ = s;
            break;
          }
          case 18: {

            valueBytes_ = input.readBytes();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            topic_ = s;
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
    return org.apache.flink.egress.generated.KafkaEgress.internal_static_io_statefun_sdk_egress_KafkaProducerRecord_descriptor;
  }

  @Override
  protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.flink.egress.generated.KafkaEgress.internal_static_io_statefun_sdk_egress_KafkaProducerRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.flink.egress.generated.KafkaProducerRecord.class, org.apache.flink.egress.generated.KafkaProducerRecord.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private volatile Object key_;
  /**
   * <code>string key = 1;</code>
   */
  public String getKey() {
    Object ref = key_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      org.apache.flink.com.google.protobuf.ByteString bs = 
          (org.apache.flink.com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   * <code>string key = 1;</code>
   */
  public org.apache.flink.com.google.protobuf.ByteString
      getKeyBytes() {
    Object ref = key_;
    if (ref instanceof String) {
      org.apache.flink.com.google.protobuf.ByteString b = 
          org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      key_ = b;
      return b;
    } else {
      return (org.apache.flink.com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_BYTES_FIELD_NUMBER = 2;
  private org.apache.flink.com.google.protobuf.ByteString valueBytes_;
  /**
   * <code>bytes value_bytes = 2;</code>
   */
  public org.apache.flink.com.google.protobuf.ByteString getValueBytes() {
    return valueBytes_;
  }

  public static final int TOPIC_FIELD_NUMBER = 3;
  private volatile Object topic_;
  /**
   * <code>string topic = 3;</code>
   */
  public String getTopic() {
    Object ref = topic_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      org.apache.flink.com.google.protobuf.ByteString bs = 
          (org.apache.flink.com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>string topic = 3;</code>
   */
  public org.apache.flink.com.google.protobuf.ByteString
      getTopicBytes() {
    Object ref = topic_;
    if (ref instanceof String) {
      org.apache.flink.com.google.protobuf.ByteString b = 
          org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      topic_ = b;
      return b;
    } else {
      return (org.apache.flink.com.google.protobuf.ByteString) ref;
    }
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
    if (!getKeyBytes().isEmpty()) {
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    if (!valueBytes_.isEmpty()) {
      output.writeBytes(2, valueBytes_);
    }
    if (!getTopicBytes().isEmpty()) {
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.writeString(output, 3, topic_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKeyBytes().isEmpty()) {
      size += org.apache.flink.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    if (!valueBytes_.isEmpty()) {
      size += org.apache.flink.com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, valueBytes_);
    }
    if (!getTopicBytes().isEmpty()) {
      size += org.apache.flink.com.google.protobuf.GeneratedMessageV3.computeStringSize(3, topic_);
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
    if (!(obj instanceof org.apache.flink.egress.generated.KafkaProducerRecord)) {
      return super.equals(obj);
    }
    org.apache.flink.egress.generated.KafkaProducerRecord other = (org.apache.flink.egress.generated.KafkaProducerRecord) obj;

    if (!getKey()
        .equals(other.getKey())) return false;
    if (!getValueBytes()
        .equals(other.getValueBytes())) return false;
    if (!getTopic()
        .equals(other.getTopic())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    hash = (37 * hash) + VALUE_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getValueBytes().hashCode();
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
      java.nio.ByteBuffer data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(byte[] data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
      byte[] data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
      org.apache.flink.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.egress.generated.KafkaProducerRecord parseFrom(
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
  public static Builder newBuilder(org.apache.flink.egress.generated.KafkaProducerRecord prototype) {
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
   * Protobuf type {@code io.statefun.sdk.egress.KafkaProducerRecord}
   */
  public static final class Builder extends
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.statefun.sdk.egress.KafkaProducerRecord)
      org.apache.flink.egress.generated.KafkaProducerRecordOrBuilder {
    public static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.flink.egress.generated.KafkaEgress.internal_static_io_statefun_sdk_egress_KafkaProducerRecord_descriptor;
    }

    @Override
    protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.flink.egress.generated.KafkaEgress.internal_static_io_statefun_sdk_egress_KafkaProducerRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.flink.egress.generated.KafkaProducerRecord.class, org.apache.flink.egress.generated.KafkaProducerRecord.Builder.class);
    }

    // Construct using org.apache.flink.egress.generated.KafkaProducerRecord.newBuilder()
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
      key_ = "";

      valueBytes_ = org.apache.flink.com.google.protobuf.ByteString.EMPTY;

      topic_ = "";

      return this;
    }

    @Override
    public org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.flink.egress.generated.KafkaEgress.internal_static_io_statefun_sdk_egress_KafkaProducerRecord_descriptor;
    }

    @Override
    public org.apache.flink.egress.generated.KafkaProducerRecord getDefaultInstanceForType() {
      return org.apache.flink.egress.generated.KafkaProducerRecord.getDefaultInstance();
    }

    @Override
    public org.apache.flink.egress.generated.KafkaProducerRecord build() {
      org.apache.flink.egress.generated.KafkaProducerRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public org.apache.flink.egress.generated.KafkaProducerRecord buildPartial() {
      org.apache.flink.egress.generated.KafkaProducerRecord result = new org.apache.flink.egress.generated.KafkaProducerRecord(this);
      result.key_ = key_;
      result.valueBytes_ = valueBytes_;
      result.topic_ = topic_;
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
      if (other instanceof org.apache.flink.egress.generated.KafkaProducerRecord) {
        return mergeFrom((org.apache.flink.egress.generated.KafkaProducerRecord)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.flink.egress.generated.KafkaProducerRecord other) {
      if (other == org.apache.flink.egress.generated.KafkaProducerRecord.getDefaultInstance()) return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        onChanged();
      }
      if (other.getValueBytes() != org.apache.flink.com.google.protobuf.ByteString.EMPTY) {
        setValueBytes(other.getValueBytes());
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
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
      org.apache.flink.egress.generated.KafkaProducerRecord parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.flink.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.flink.egress.generated.KafkaProducerRecord) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object key_ = "";
    /**
     * <code>string key = 1;</code>
     */
    public String getKey() {
      Object ref = key_;
      if (!(ref instanceof String)) {
        org.apache.flink.com.google.protobuf.ByteString bs =
            (org.apache.flink.com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     */
    public org.apache.flink.com.google.protobuf.ByteString
        getKeyBytes() {
      Object ref = key_;
      if (ref instanceof String) {
        org.apache.flink.com.google.protobuf.ByteString b = 
            org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        key_ = b;
        return b;
      } else {
        return (org.apache.flink.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key = 1;</code>
     */
    public Builder setKey(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      key_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     */
    public Builder clearKey() {
      
      key_ = getDefaultInstance().getKey();
      onChanged();
      return this;
    }
    /**
     * <code>string key = 1;</code>
     */
    public Builder setKeyBytes(
        org.apache.flink.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      key_ = value;
      onChanged();
      return this;
    }

    private org.apache.flink.com.google.protobuf.ByteString valueBytes_ = org.apache.flink.com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes value_bytes = 2;</code>
     */
    public org.apache.flink.com.google.protobuf.ByteString getValueBytes() {
      return valueBytes_;
    }
    /**
     * <code>bytes value_bytes = 2;</code>
     */
    public Builder setValueBytes(org.apache.flink.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valueBytes_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes value_bytes = 2;</code>
     */
    public Builder clearValueBytes() {
      
      valueBytes_ = getDefaultInstance().getValueBytes();
      onChanged();
      return this;
    }

    private Object topic_ = "";
    /**
     * <code>string topic = 3;</code>
     */
    public String getTopic() {
      Object ref = topic_;
      if (!(ref instanceof String)) {
        org.apache.flink.com.google.protobuf.ByteString bs =
            (org.apache.flink.com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string topic = 3;</code>
     */
    public org.apache.flink.com.google.protobuf.ByteString
        getTopicBytes() {
      Object ref = topic_;
      if (ref instanceof String) {
        org.apache.flink.com.google.protobuf.ByteString b = 
            org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        topic_ = b;
        return b;
      } else {
        return (org.apache.flink.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string topic = 3;</code>
     */
    public Builder setTopic(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 3;</code>
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <code>string topic = 3;</code>
     */
    public Builder setTopicBytes(
        org.apache.flink.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
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


    // @@protoc_insertion_point(builder_scope:io.statefun.sdk.egress.KafkaProducerRecord)
  }

  // @@protoc_insertion_point(class_scope:io.statefun.sdk.egress.KafkaProducerRecord)
  private static final org.apache.flink.egress.generated.KafkaProducerRecord DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.flink.egress.generated.KafkaProducerRecord();
  }

  public static org.apache.flink.egress.generated.KafkaProducerRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.flink.com.google.protobuf.Parser<KafkaProducerRecord>
      PARSER = new org.apache.flink.com.google.protobuf.AbstractParser<KafkaProducerRecord>() {
    @Override
    public KafkaProducerRecord parsePartialFrom(
        org.apache.flink.com.google.protobuf.CodedInputStream input,
        org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
      return new KafkaProducerRecord(input, extensionRegistry);
    }
  };

  public static org.apache.flink.com.google.protobuf.Parser<KafkaProducerRecord> parser() {
    return PARSER;
  }

  @Override
  public org.apache.flink.com.google.protobuf.Parser<KafkaProducerRecord> getParserForType() {
    return PARSER;
  }

  @Override
  public org.apache.flink.egress.generated.KafkaProducerRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

