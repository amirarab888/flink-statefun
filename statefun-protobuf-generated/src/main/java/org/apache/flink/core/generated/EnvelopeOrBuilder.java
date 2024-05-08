// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stateful-functions.proto

package org.apache.flink.core.generated;

public interface EnvelopeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.apache.flink.statefun.flink.core.Envelope)
    org.apache.flink.com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.org.apache.flink.statefun.flink.core.EnvelopeAddress source = 1;</code>
   */
  boolean hasSource();
  /**
   * <code>.org.apache.flink.statefun.flink.core.EnvelopeAddress source = 1;</code>
   */
  org.apache.flink.core.generated.EnvelopeAddress getSource();
  /**
   * <code>.org.apache.flink.statefun.flink.core.EnvelopeAddress source = 1;</code>
   */
  org.apache.flink.core.generated.EnvelopeAddressOrBuilder getSourceOrBuilder();

  /**
   * <code>.org.apache.flink.statefun.flink.core.EnvelopeAddress target = 2;</code>
   */
  boolean hasTarget();
  /**
   * <code>.org.apache.flink.statefun.flink.core.EnvelopeAddress target = 2;</code>
   */
  org.apache.flink.core.generated.EnvelopeAddress getTarget();
  /**
   * <code>.org.apache.flink.statefun.flink.core.EnvelopeAddress target = 2;</code>
   */
  org.apache.flink.core.generated.EnvelopeAddressOrBuilder getTargetOrBuilder();

  /**
   * <pre>
   * an optional token that can be used track delayed message cancellation.
   * </pre>
   *
   * <code>string cancellation_token = 10;</code>
   */
  String getCancellationToken();
  /**
   * <pre>
   * an optional token that can be used track delayed message cancellation.
   * </pre>
   *
   * <code>string cancellation_token = 10;</code>
   */
  org.apache.flink.com.google.protobuf.ByteString
      getCancellationTokenBytes();

  /**
   * <code>.org.apache.flink.statefun.flink.core.Checkpoint checkpoint = 4;</code>
   */
  boolean hasCheckpoint();
  /**
   * <code>.org.apache.flink.statefun.flink.core.Checkpoint checkpoint = 4;</code>
   */
  org.apache.flink.core.generated.Checkpoint getCheckpoint();
  /**
   * <code>.org.apache.flink.statefun.flink.core.Checkpoint checkpoint = 4;</code>
   */
  org.apache.flink.core.generated.CheckpointOrBuilder getCheckpointOrBuilder();

  /**
   * <code>.org.apache.flink.statefun.flink.core.Payload payload = 3;</code>
   */
  boolean hasPayload();
  /**
   * <code>.org.apache.flink.statefun.flink.core.Payload payload = 3;</code>
   */
  org.apache.flink.core.generated.Payload getPayload();
  /**
   * <code>.org.apache.flink.statefun.flink.core.Payload payload = 3;</code>
   */
  org.apache.flink.core.generated.PayloadOrBuilder getPayloadOrBuilder();

  public org.apache.flink.core.generated.Envelope.BodyCase getBodyCase();
}
