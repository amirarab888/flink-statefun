// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: routable.proto

package org.apache.flink.io.generated;

/**
 * Protobuf type {@code org.apache.flink.statefun.flink.io.TargetFunctionType}
 */
public  final class TargetFunctionType extends
    org.apache.flink.com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.apache.flink.statefun.flink.io.TargetFunctionType)
        TargetFunctionTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TargetFunctionType.newBuilder() to construct.
  private TargetFunctionType(org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TargetFunctionType() {
    namespace_ = "";
    type_ = "";
  }

  @Override
  public final org.apache.flink.com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TargetFunctionType(
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

            namespace_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            type_ = s;
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
    return org.apache.flink.io.generated.Routable.internal_static_org_apache_flink_statefun_flink_io_TargetFunctionType_descriptor;
  }

  @Override
  protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.flink.io.generated.Routable.internal_static_org_apache_flink_statefun_flink_io_TargetFunctionType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.flink.io.generated.TargetFunctionType.class, org.apache.flink.io.generated.TargetFunctionType.Builder.class);
  }

  public static final int NAMESPACE_FIELD_NUMBER = 1;
  private volatile Object namespace_;
  /**
   * <code>string namespace = 1;</code>
   */
  public String getNamespace() {
    Object ref = namespace_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      org.apache.flink.com.google.protobuf.ByteString bs = 
          (org.apache.flink.com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      namespace_ = s;
      return s;
    }
  }
  /**
   * <code>string namespace = 1;</code>
   */
  public org.apache.flink.com.google.protobuf.ByteString
      getNamespaceBytes() {
    Object ref = namespace_;
    if (ref instanceof String) {
      org.apache.flink.com.google.protobuf.ByteString b = 
          org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      namespace_ = b;
      return b;
    } else {
      return (org.apache.flink.com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private volatile Object type_;
  /**
   * <code>string type = 2;</code>
   */
  public String getType() {
    Object ref = type_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      org.apache.flink.com.google.protobuf.ByteString bs = 
          (org.apache.flink.com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 2;</code>
   */
  public org.apache.flink.com.google.protobuf.ByteString
      getTypeBytes() {
    Object ref = type_;
    if (ref instanceof String) {
      org.apache.flink.com.google.protobuf.ByteString b = 
          org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      type_ = b;
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
    if (!getNamespaceBytes().isEmpty()) {
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.writeString(output, 1, namespace_);
    }
    if (!getTypeBytes().isEmpty()) {
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNamespaceBytes().isEmpty()) {
      size += org.apache.flink.com.google.protobuf.GeneratedMessageV3.computeStringSize(1, namespace_);
    }
    if (!getTypeBytes().isEmpty()) {
      size += org.apache.flink.com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
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
    if (!(obj instanceof org.apache.flink.io.generated.TargetFunctionType)) {
      return super.equals(obj);
    }
    org.apache.flink.io.generated.TargetFunctionType other = (org.apache.flink.io.generated.TargetFunctionType) obj;

    if (!getNamespace()
        .equals(other.getNamespace())) return false;
    if (!getType()
        .equals(other.getType())) return false;
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
    hash = (37 * hash) + NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getNamespace().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
      java.nio.ByteBuffer data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
      java.nio.ByteBuffer data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
      org.apache.flink.com.google.protobuf.ByteString data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(byte[] data)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
      byte[] data,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseDelimitedFrom(
      java.io.InputStream input,
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
      org.apache.flink.com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return org.apache.flink.com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.flink.io.generated.TargetFunctionType parseFrom(
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
  public static Builder newBuilder(org.apache.flink.io.generated.TargetFunctionType prototype) {
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
   * Protobuf type {@code org.apache.flink.statefun.flink.io.TargetFunctionType}
   */
  public static final class Builder extends
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.apache.flink.statefun.flink.io.TargetFunctionType)
      TargetFunctionTypeOrBuilder {
    public static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.flink.io.generated.Routable.internal_static_org_apache_flink_statefun_flink_io_TargetFunctionType_descriptor;
    }

    @Override
    protected org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.flink.io.generated.Routable.internal_static_org_apache_flink_statefun_flink_io_TargetFunctionType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.flink.io.generated.TargetFunctionType.class, org.apache.flink.io.generated.TargetFunctionType.Builder.class);
    }

    // Construct using org.apache.flink.io.generated.TargetFunctionType.newBuilder()
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
      namespace_ = "";

      type_ = "";

      return this;
    }

    @Override
    public org.apache.flink.com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.flink.io.generated.Routable.internal_static_org_apache_flink_statefun_flink_io_TargetFunctionType_descriptor;
    }

    @Override
    public org.apache.flink.io.generated.TargetFunctionType getDefaultInstanceForType() {
      return org.apache.flink.io.generated.TargetFunctionType.getDefaultInstance();
    }

    @Override
    public org.apache.flink.io.generated.TargetFunctionType build() {
      org.apache.flink.io.generated.TargetFunctionType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public org.apache.flink.io.generated.TargetFunctionType buildPartial() {
      org.apache.flink.io.generated.TargetFunctionType result = new org.apache.flink.io.generated.TargetFunctionType(this);
      result.namespace_ = namespace_;
      result.type_ = type_;
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
      if (other instanceof org.apache.flink.io.generated.TargetFunctionType) {
        return mergeFrom((org.apache.flink.io.generated.TargetFunctionType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.flink.io.generated.TargetFunctionType other) {
      if (other == org.apache.flink.io.generated.TargetFunctionType.getDefaultInstance()) return this;
      if (!other.getNamespace().isEmpty()) {
        namespace_ = other.namespace_;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
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
      org.apache.flink.io.generated.TargetFunctionType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.apache.flink.com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.apache.flink.io.generated.TargetFunctionType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object namespace_ = "";
    /**
     * <code>string namespace = 1;</code>
     */
    public String getNamespace() {
      Object ref = namespace_;
      if (!(ref instanceof String)) {
        org.apache.flink.com.google.protobuf.ByteString bs =
            (org.apache.flink.com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        namespace_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public org.apache.flink.com.google.protobuf.ByteString
        getNamespaceBytes() {
      Object ref = namespace_;
      if (ref instanceof String) {
        org.apache.flink.com.google.protobuf.ByteString b = 
            org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        namespace_ = b;
        return b;
      } else {
        return (org.apache.flink.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public Builder setNamespace(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      namespace_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public Builder clearNamespace() {
      
      namespace_ = getDefaultInstance().getNamespace();
      onChanged();
      return this;
    }
    /**
     * <code>string namespace = 1;</code>
     */
    public Builder setNamespaceBytes(
        org.apache.flink.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      namespace_ = value;
      onChanged();
      return this;
    }

    private Object type_ = "";
    /**
     * <code>string type = 2;</code>
     */
    public String getType() {
      Object ref = type_;
      if (!(ref instanceof String)) {
        org.apache.flink.com.google.protobuf.ByteString bs =
            (org.apache.flink.com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public org.apache.flink.com.google.protobuf.ByteString
        getTypeBytes() {
      Object ref = type_;
      if (ref instanceof String) {
        org.apache.flink.com.google.protobuf.ByteString b = 
            org.apache.flink.com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        type_ = b;
        return b;
      } else {
        return (org.apache.flink.com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <code>string type = 2;</code>
     */
    public Builder setTypeBytes(
        org.apache.flink.com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
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


    // @@protoc_insertion_point(builder_scope:org.apache.flink.statefun.flink.io.TargetFunctionType)
  }

  // @@protoc_insertion_point(class_scope:org.apache.flink.statefun.flink.io.TargetFunctionType)
  private static final org.apache.flink.io.generated.TargetFunctionType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.flink.io.generated.TargetFunctionType();
  }

  public static org.apache.flink.io.generated.TargetFunctionType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final org.apache.flink.com.google.protobuf.Parser<TargetFunctionType>
      PARSER = new org.apache.flink.com.google.protobuf.AbstractParser<TargetFunctionType>() {
    @Override
    public TargetFunctionType parsePartialFrom(
        org.apache.flink.com.google.protobuf.CodedInputStream input,
        org.apache.flink.com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.apache.flink.com.google.protobuf.InvalidProtocolBufferException {
      return new TargetFunctionType(input, extensionRegistry);
    }
  };

  public static org.apache.flink.com.google.protobuf.Parser<TargetFunctionType> parser() {
    return PARSER;
  }

  @Override
  public org.apache.flink.com.google.protobuf.Parser<TargetFunctionType> getParserForType() {
    return PARSER;
  }

  @Override
  public org.apache.flink.io.generated.TargetFunctionType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

