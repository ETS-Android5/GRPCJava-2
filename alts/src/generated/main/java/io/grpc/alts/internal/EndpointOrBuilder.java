// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/gcp/handshaker.proto

package io.grpc.alts.internal;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gcp.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
   * "192.168.0.1" or "2001:db8::1".
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   */
  java.lang.String getIpAddress();
  /**
   * <pre>
   * IP address. It should contain an IPv4 or IPv6 string literal, e.g.
   * "192.168.0.1" or "2001:db8::1".
   * </pre>
   *
   * <code>string ip_address = 1;</code>
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <pre>
   * Port number.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   */
  int getPort();

  /**
   * <pre>
   * Network protocol (e.g., TCP, UDP) associated with this endpoint.
   * </pre>
   *
   * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
   */
  int getProtocolValue();
  /**
   * <pre>
   * Network protocol (e.g., TCP, UDP) associated with this endpoint.
   * </pre>
   *
   * <code>.grpc.gcp.NetworkProtocol protocol = 3;</code>
   */
  io.grpc.alts.internal.NetworkProtocol getProtocol();
}
