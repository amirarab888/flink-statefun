// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/protobuf/struct.proto

package org.apache.flink.com.google.protobuf;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.protobuf.Value)
    org.apache.flink.com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   */
  int getNullValueValue();
  /**
   * <pre>
   * Represents a null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null_value = 1;</code>
   */
  org.apache.flink.com.google.protobuf.NullValue getNullValue();

  /**
   * <pre>
   * Represents a double value.
   * </pre>
   *
   * <code>double number_value = 2;</code>
   */
  double getNumberValue();

  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * Represents a string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   */
  org.apache.flink.com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <pre>
   * Represents a boolean value.
   * </pre>
   *
   * <code>bool bool_value = 4;</code>
   */
  boolean getBoolValue();

  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 5;</code>
   */
  boolean hasStructValue();
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 5;</code>
   */
  org.apache.flink.com.google.protobuf.Struct getStructValue();
  /**
   * <pre>
   * Represents a structured value.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 5;</code>
   */
  org.apache.flink.com.google.protobuf.StructOrBuilder getStructValueOrBuilder();

  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue list_value = 6;</code>
   */
  boolean hasListValue();
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue list_value = 6;</code>
   */
  org.apache.flink.com.google.protobuf.ListValue getListValue();
  /**
   * <pre>
   * Represents a repeated `Value`.
   * </pre>
   *
   * <code>.google.protobuf.ListValue list_value = 6;</code>
   */
  org.apache.flink.com.google.protobuf.ListValueOrBuilder getListValueOrBuilder();

  public org.apache.flink.com.google.protobuf.Value.KindCase getKindCase();
}
