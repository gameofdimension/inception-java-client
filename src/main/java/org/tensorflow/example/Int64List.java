// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: feature.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.Int64List}
 */
public  final class Int64List extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.Int64List)
    Int64ListOrBuilder {
  // Use Int64List.newBuilder() to construct.
  private Int64List(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Int64List() {
    value_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Int64List(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              value_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000001;
            }
            value_.add(input.readInt64());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              value_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              value_.add(input.readInt64());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        value_ = java.util.Collections.unmodifiableList(value_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Int64List_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Int64List_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.Int64List.class, org.tensorflow.example.Int64List.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Long> value_;
  /**
   * <code>repeated int64 value = 1 [packed = true];</code>
   */
  public java.util.List<java.lang.Long>
      getValueList() {
    return value_;
  }
  /**
   * <code>repeated int64 value = 1 [packed = true];</code>
   */
  public int getValueCount() {
    return value_.size();
  }
  /**
   * <code>repeated int64 value = 1 [packed = true];</code>
   */
  public long getValue(int index) {
    return value_.get(index);
  }
  private int valueMemoizedSerializedSize = -1;

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (getValueList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(valueMemoizedSerializedSize);
    }
    for (int i = 0; i < value_.size(); i++) {
      output.writeInt64NoTag(value_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < value_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(value_.get(i));
      }
      size += dataSize;
      if (!getValueList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      valueMemoizedSerializedSize = dataSize;
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.example.Int64List)) {
      return super.equals(obj);
    }
    org.tensorflow.example.Int64List other = (org.tensorflow.example.Int64List) obj;

    boolean result = true;
    result = result && getValueList()
        .equals(other.getValueList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getValueCount() > 0) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValueList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.Int64List parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Int64List parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Int64List parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Int64List parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Int64List parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.Int64List parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.Int64List parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Int64List parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.Int64List parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Int64List parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.Int64List parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.Int64List parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.Int64List prototype) {
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
   * Protobuf type {@code tensorflow.Int64List}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.Int64List)
      org.tensorflow.example.Int64ListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Int64List_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Int64List_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.Int64List.class, org.tensorflow.example.Int64List.Builder.class);
    }

    // Construct using org.tensorflow.example.Int64List.newBuilder()
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
      value_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Int64List_descriptor;
    }

    public org.tensorflow.example.Int64List getDefaultInstanceForType() {
      return org.tensorflow.example.Int64List.getDefaultInstance();
    }

    public org.tensorflow.example.Int64List build() {
      org.tensorflow.example.Int64List result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.example.Int64List buildPartial() {
      org.tensorflow.example.Int64List result = new org.tensorflow.example.Int64List(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        value_ = java.util.Collections.unmodifiableList(value_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.value_ = value_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
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
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.example.Int64List) {
        return mergeFrom((org.tensorflow.example.Int64List)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.Int64List other) {
      if (other == org.tensorflow.example.Int64List.getDefaultInstance()) return this;
      if (!other.value_.isEmpty()) {
        if (value_.isEmpty()) {
          value_ = other.value_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureValueIsMutable();
          value_.addAll(other.value_);
        }
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.example.Int64List parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.example.Int64List) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Long> value_ = java.util.Collections.emptyList();
    private void ensureValueIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        value_ = new java.util.ArrayList<java.lang.Long>(value_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int64 value = 1 [packed = true];</code>
     */
    public java.util.List<java.lang.Long>
        getValueList() {
      return java.util.Collections.unmodifiableList(value_);
    }
    /**
     * <code>repeated int64 value = 1 [packed = true];</code>
     */
    public int getValueCount() {
      return value_.size();
    }
    /**
     * <code>repeated int64 value = 1 [packed = true];</code>
     */
    public long getValue(int index) {
      return value_.get(index);
    }
    /**
     * <code>repeated int64 value = 1 [packed = true];</code>
     */
    public Builder setValue(
        int index, long value) {
      ensureValueIsMutable();
      value_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 value = 1 [packed = true];</code>
     */
    public Builder addValue(long value) {
      ensureValueIsMutable();
      value_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 value = 1 [packed = true];</code>
     */
    public Builder addAllValue(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureValueIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, value_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int64 value = 1 [packed = true];</code>
     */
    public Builder clearValue() {
      value_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.Int64List)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.Int64List)
  private static final org.tensorflow.example.Int64List DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.Int64List();
  }

  public static org.tensorflow.example.Int64List getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Int64List>
      PARSER = new com.google.protobuf.AbstractParser<Int64List>() {
    public Int64List parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Int64List(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Int64List> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Int64List> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.example.Int64List getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

