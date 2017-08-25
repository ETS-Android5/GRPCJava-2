// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/grpc/reflection/testing/dynamic_reflection_test_depth_two.proto

package io.grpc.reflection.testing;

/**
 * Protobuf type {@code grpc.reflection.testing.TypeWithExtensions}
 */
public  final class TypeWithExtensions extends
    com.google.protobuf.GeneratedMessageV3.ExtendableMessage<
      TypeWithExtensions> implements
    // @@protoc_insertion_point(message_implements:grpc.reflection.testing.TypeWithExtensions)
    TypeWithExtensionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TypeWithExtensions.newBuilder() to construct.
  private TypeWithExtensions(com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<io.grpc.reflection.testing.TypeWithExtensions, ?> builder) {
    super(builder);
  }
  private TypeWithExtensions() {
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TypeWithExtensions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            message_ = bs;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grpc.reflection.testing.DynamicReflectionTestDepthTwoProto.internal_static_grpc_reflection_testing_TypeWithExtensions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.reflection.testing.DynamicReflectionTestDepthTwoProto.internal_static_grpc_reflection_testing_TypeWithExtensions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.reflection.testing.TypeWithExtensions.class, io.grpc.reflection.testing.TypeWithExtensions.Builder.class);
  }

  private int bitField0_;
  public static final int MESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object message_;
  /**
   * <code>optional string message = 1;</code>
   */
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string message = 1;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        message_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string message = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!extensionsAreInitialized()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .ExtendableMessage<io.grpc.reflection.testing.TypeWithExtensions>.ExtensionWriter
        extensionWriter = newExtensionWriter();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_);
    }
    extensionWriter.writeUntil(300, output);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, message_);
    }
    size += extensionsSerializedSize();
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grpc.reflection.testing.TypeWithExtensions)) {
      return super.equals(obj);
    }
    io.grpc.reflection.testing.TypeWithExtensions other = (io.grpc.reflection.testing.TypeWithExtensions) obj;

    boolean result = true;
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && unknownFields.equals(other.unknownFields);
    result = result &&
        getExtensionFields().equals(other.getExtensionFields());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = hashFields(hash, getExtensionFields());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grpc.reflection.testing.TypeWithExtensions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.reflection.testing.TypeWithExtensions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.reflection.testing.TypeWithExtensions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.ExtendableBuilder<
        io.grpc.reflection.testing.TypeWithExtensions, Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.reflection.testing.TypeWithExtensions)
      io.grpc.reflection.testing.TypeWithExtensionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.reflection.testing.DynamicReflectionTestDepthTwoProto.internal_static_grpc_reflection_testing_TypeWithExtensions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.reflection.testing.DynamicReflectionTestDepthTwoProto.internal_static_grpc_reflection_testing_TypeWithExtensions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.reflection.testing.TypeWithExtensions.class, io.grpc.reflection.testing.TypeWithExtensions.Builder.class);
    }

    // Construct using io.grpc.reflection.testing.TypeWithExtensions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      message_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.reflection.testing.DynamicReflectionTestDepthTwoProto.internal_static_grpc_reflection_testing_TypeWithExtensions_descriptor;
    }

    public io.grpc.reflection.testing.TypeWithExtensions getDefaultInstanceForType() {
      return io.grpc.reflection.testing.TypeWithExtensions.getDefaultInstance();
    }

    public io.grpc.reflection.testing.TypeWithExtensions build() {
      io.grpc.reflection.testing.TypeWithExtensions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.reflection.testing.TypeWithExtensions buildPartial() {
      io.grpc.reflection.testing.TypeWithExtensions result = new io.grpc.reflection.testing.TypeWithExtensions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.message_ = message_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public <Type> Builder setExtension(
        com.google.protobuf.GeneratedMessage.GeneratedExtension<
            io.grpc.reflection.testing.TypeWithExtensions, Type> extension,
        Type value) {
      return (Builder) super.setExtension(extension, value);
    }
    public <Type> Builder setExtension(
        com.google.protobuf.GeneratedMessage.GeneratedExtension<
            io.grpc.reflection.testing.TypeWithExtensions, java.util.List<Type>> extension,
        int index, Type value) {
      return (Builder) super.setExtension(extension, index, value);
    }
    public <Type> Builder addExtension(
        com.google.protobuf.GeneratedMessage.GeneratedExtension<
            io.grpc.reflection.testing.TypeWithExtensions, java.util.List<Type>> extension,
        Type value) {
      return (Builder) super.addExtension(extension, value);
    }
    public <Type> Builder clearExtension(
        com.google.protobuf.GeneratedMessage.GeneratedExtension<
            io.grpc.reflection.testing.TypeWithExtensions, ?> extension) {
      return (Builder) super.clearExtension(extension);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.reflection.testing.TypeWithExtensions) {
        return mergeFrom((io.grpc.reflection.testing.TypeWithExtensions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.reflection.testing.TypeWithExtensions other) {
      if (other == io.grpc.reflection.testing.TypeWithExtensions.getDefaultInstance()) return this;
      if (other.hasMessage()) {
        bitField0_ |= 0x00000001;
        message_ = other.message_;
        onChanged();
      }
      this.mergeExtensionFields(other);
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!extensionsAreInitialized()) {
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grpc.reflection.testing.TypeWithExtensions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.reflection.testing.TypeWithExtensions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object message_ = "";
    /**
     * <code>optional string message = 1;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000001);
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 1;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      message_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.reflection.testing.TypeWithExtensions)
  }

  // @@protoc_insertion_point(class_scope:grpc.reflection.testing.TypeWithExtensions)
  private static final io.grpc.reflection.testing.TypeWithExtensions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.reflection.testing.TypeWithExtensions();
  }

  public static io.grpc.reflection.testing.TypeWithExtensions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TypeWithExtensions>
      PARSER = new com.google.protobuf.AbstractParser<TypeWithExtensions>() {
    public TypeWithExtensions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TypeWithExtensions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TypeWithExtensions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TypeWithExtensions> getParserForType() {
    return PARSER;
  }

  public io.grpc.reflection.testing.TypeWithExtensions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

