// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/gcp/handshaker.proto

package io.grpc.alts.internal;

public interface HandshakerReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.gcp.HandshakerReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The start client handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.StartClientHandshakeReq client_start = 1;</code>
   */
  boolean hasClientStart();
  /**
   * <pre>
   * The start client handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.StartClientHandshakeReq client_start = 1;</code>
   */
  io.grpc.alts.internal.StartClientHandshakeReq getClientStart();
  /**
   * <pre>
   * The start client handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.StartClientHandshakeReq client_start = 1;</code>
   */
  io.grpc.alts.internal.StartClientHandshakeReqOrBuilder getClientStartOrBuilder();

  /**
   * <pre>
   * The start server handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.StartServerHandshakeReq server_start = 2;</code>
   */
  boolean hasServerStart();
  /**
   * <pre>
   * The start server handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.StartServerHandshakeReq server_start = 2;</code>
   */
  io.grpc.alts.internal.StartServerHandshakeReq getServerStart();
  /**
   * <pre>
   * The start server handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.StartServerHandshakeReq server_start = 2;</code>
   */
  io.grpc.alts.internal.StartServerHandshakeReqOrBuilder getServerStartOrBuilder();

  /**
   * <pre>
   * The next handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.NextHandshakeMessageReq next = 3;</code>
   */
  boolean hasNext();
  /**
   * <pre>
   * The next handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.NextHandshakeMessageReq next = 3;</code>
   */
  io.grpc.alts.internal.NextHandshakeMessageReq getNext();
  /**
   * <pre>
   * The next handshake request message.
   * </pre>
   *
   * <code>.grpc.gcp.NextHandshakeMessageReq next = 3;</code>
   */
  io.grpc.alts.internal.NextHandshakeMessageReqOrBuilder getNextOrBuilder();

  public io.grpc.alts.internal.HandshakerReq.ReqOneofCase getReqOneofCase();
}
