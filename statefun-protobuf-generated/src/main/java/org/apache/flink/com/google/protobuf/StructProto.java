// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package org.apache.flink.com.google.protobuf;

@javax.annotation.Generated("proto") public final class StructProto {
  private StructProto() {}
  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.flink.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Struct_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Struct_fieldAccessorTable;
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Struct_FieldsEntry_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Struct_FieldsEntry_fieldAccessorTable;
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Value_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Value_fieldAccessorTable;
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_ListValue_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_ListValue_fieldAccessorTable;

  public static org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034google/protobuf/struct.proto\022\017google.p" +
      "rotobuf\"\204\001\n\006Struct\0223\n\006fields\030\001 \003(\0132#.goo" +
      "gle.protobuf.Struct.FieldsEntry\032E\n\013Field" +
      "sEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.goo" +
      "gle.protobuf.Value:\0028\001\"\352\001\n\005Value\0220\n\nnull" +
      "_value\030\001 \001(\0162\032.google.protobuf.NullValue" +
      "H\000\022\026\n\014number_value\030\002 \001(\001H\000\022\026\n\014string_val" +
      "ue\030\003 \001(\tH\000\022\024\n\nbool_value\030\004 \001(\010H\000\022/\n\014stru" +
      "ct_value\030\005 \001(\0132\027.google.protobuf.StructH" +
      "\000\0220\n\nlist_value\030\006 \001(\0132\032.google.protobuf." +
      "ListValueH\000B\006\n\004kind\"3\n\tListValue\022&\n\006valu" +
      "es\030\001 \003(\0132\026.google.protobuf.Value*\033\n\tNull" +
      "Value\022\016\n\nNULL_VALUE\020\000B\201\001\n\023com.google.pro" +
      "tobufB\013StructProtoP\001Z1github.com/golang/" +
      "protobuf/ptypes/struct;structpb\370\001\001\242\002\003GPB" +
      "\252\002\036Google.Protobuf.WellKnownTypesb\006proto" +
      "3"
    };
    org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public org.apache.flink.com.google.protobuf.ExtensionRegistry assignDescriptors(
              org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_google_protobuf_Struct_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_Struct_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Struct_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_google_protobuf_Struct_FieldsEntry_descriptor =
      internal_static_google_protobuf_Struct_descriptor.getNestedTypes().get(0);
    internal_static_google_protobuf_Struct_FieldsEntry_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Struct_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_protobuf_Value_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_protobuf_Value_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Value_descriptor,
        new java.lang.String[] { "NullValue", "NumberValue", "StringValue", "BoolValue", "StructValue", "ListValue", "Kind", });
    internal_static_google_protobuf_ListValue_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_protobuf_ListValue_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_ListValue_descriptor,
        new java.lang.String[] { "Values", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
