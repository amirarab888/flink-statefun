// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kinesis-egress.proto

package org.apache.flink.egress.generated;

public final class KinesisEgress {
  private KinesisEgress() {}
  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.flink.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_io_statefun_sdk_egress_KinesisEgressRecord_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_statefun_sdk_egress_KinesisEgressRecord_fieldAccessorTable;

  public static org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024kinesis-egress.proto\022\026io.statefun.sdk." +
      "egress\"l\n\023KinesisEgressRecord\022\025\n\rpartiti" +
      "on_key\030\001 \001(\t\022\023\n\013value_bytes\030\002 \001(\014\022\016\n\006str" +
      "eam\030\003 \001(\t\022\031\n\021explicit_hash_key\030\004 \001(\tB>\n." +
      "org.apache.flink.statefun.sdk.egress.gen" +
      "eratedP\001Z\n.;protocolb\006proto3"
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
    internal_static_io_statefun_sdk_egress_KinesisEgressRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_statefun_sdk_egress_KinesisEgressRecord_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_statefun_sdk_egress_KinesisEgressRecord_descriptor,
        new String[] { "PartitionKey", "ValueBytes", "Stream", "ExplicitHashKey", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
