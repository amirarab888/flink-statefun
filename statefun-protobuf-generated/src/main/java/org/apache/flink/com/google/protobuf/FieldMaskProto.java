// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/field_mask.proto

package org.apache.flink.com.google.protobuf;

@javax.annotation.Generated("proto") public final class FieldMaskProto {
  private FieldMaskProto() {}
  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.flink.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_FieldMask_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_FieldMask_fieldAccessorTable;

  public static org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n google/protobuf/field_mask.proto\022\017goog" +
      "le.protobuf\"\032\n\tFieldMask\022\r\n\005paths\030\001 \003(\tB" +
      "\214\001\n\023org.apache.flink.statefun.sdk.shaded.com.google.protobufB\016FieldMaskProtoP" +
      "\001Z9google.golang.org/genproto/protobuf/f" +
      "ield_mask;field_mask\370\001\001\242\002\003GPB\252\002\036Google.P" +
      "rotobuf.WellKnownTypesb\006proto3"
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
    internal_static_google_protobuf_FieldMask_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_FieldMask_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_FieldMask_descriptor,
        new java.lang.String[] { "Paths", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}