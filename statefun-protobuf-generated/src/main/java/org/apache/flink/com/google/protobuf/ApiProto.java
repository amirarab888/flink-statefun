// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/api.proto

package org.apache.flink.com.google.protobuf;

@javax.annotation.Generated("proto") public final class ApiProto {
  private ApiProto() {}
  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      org.apache.flink.com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (org.apache.flink.com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Api_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Api_fieldAccessorTable;
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Method_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Method_fieldAccessorTable;
  static final org.apache.flink.com.google.protobuf.Descriptors.Descriptor
    internal_static_google_protobuf_Mixin_descriptor;
  static final 
    org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_protobuf_Mixin_fieldAccessorTable;

  public static org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  org.apache.flink.com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031google/protobuf/api.proto\022\017google.prot" +
      "obuf\032$google/protobuf/source_context.pro" +
      "to\032\032google/protobuf/type.proto\"\201\002\n\003Api\022\014" +
      "\n\004name\030\001 \001(\t\022(\n\007methods\030\002 \003(\0132\027.google.p" +
      "rotobuf.Method\022(\n\007options\030\003 \003(\0132\027.google" +
      ".protobuf.Option\022\017\n\007version\030\004 \001(\t\0226\n\016sou" +
      "rce_context\030\005 \001(\0132\036.google.protobuf.Sour" +
      "ceContext\022&\n\006mixins\030\006 \003(\0132\026.google.proto" +
      "buf.Mixin\022\'\n\006syntax\030\007 \001(\0162\027.google.proto" +
      "buf.Syntax\"\325\001\n\006Method\022\014\n\004name\030\001 \001(\t\022\030\n\020r" +
      "equest_type_url\030\002 \001(\t\022\031\n\021request_streami" +
      "ng\030\003 \001(\010\022\031\n\021response_type_url\030\004 \001(\t\022\032\n\022r" +
      "esponse_streaming\030\005 \001(\010\022(\n\007options\030\006 \003(\013" +
      "2\027.google.protobuf.Option\022\'\n\006syntax\030\007 \001(" +
      "\0162\027.google.protobuf.Syntax\"#\n\005Mixin\022\014\n\004n" +
      "ame\030\001 \001(\t\022\014\n\004root\030\002 \001(\tBu\n\023com.google.pr" +
      "otobufB\010ApiProtoP\001Z+google.golang.org/ge" +
      "nproto/protobuf/api;api\242\002\003GPB\252\002\036Google.P" +
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
          org.apache.flink.com.google.protobuf.SourceContextProto.getDescriptor(),
          org.apache.flink.com.google.protobuf.TypeProto.getDescriptor(),
        }, assigner);
    internal_static_google_protobuf_Api_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_protobuf_Api_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Api_descriptor,
        new java.lang.String[] { "Name", "Methods", "Options", "Version", "SourceContext", "Mixins", "Syntax", });
    internal_static_google_protobuf_Method_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_protobuf_Method_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Method_descriptor,
        new java.lang.String[] { "Name", "RequestTypeUrl", "RequestStreaming", "ResponseTypeUrl", "ResponseStreaming", "Options", "Syntax", });
    internal_static_google_protobuf_Mixin_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_protobuf_Mixin_fieldAccessorTable = new
      org.apache.flink.com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_protobuf_Mixin_descriptor,
        new java.lang.String[] { "Name", "Root", });
    org.apache.flink.com.google.protobuf.SourceContextProto.getDescriptor();
    org.apache.flink.com.google.protobuf.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
