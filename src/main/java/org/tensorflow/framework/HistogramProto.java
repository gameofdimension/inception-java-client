// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: summary.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Serialization format for histogram module in
 * core/lib/histogram/histogram.h
 * </pre>
 *
 * Protobuf type {@code tensorflow.HistogramProto}
 */
public  final class HistogramProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.HistogramProto)
    HistogramProtoOrBuilder {
  // Use HistogramProto.newBuilder() to construct.
  private HistogramProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistogramProto() {
    min_ = 0D;
    max_ = 0D;
    num_ = 0D;
    sum_ = 0D;
    sumSquares_ = 0D;
    bucketLimit_ = java.util.Collections.emptyList();
    bucket_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private HistogramProto(
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
          case 9: {

            min_ = input.readDouble();
            break;
          }
          case 17: {

            max_ = input.readDouble();
            break;
          }
          case 25: {

            num_ = input.readDouble();
            break;
          }
          case 33: {

            sum_ = input.readDouble();
            break;
          }
          case 41: {

            sumSquares_ = input.readDouble();
            break;
          }
          case 49: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              bucketLimit_ = new java.util.ArrayList<java.lang.Double>();
              mutable_bitField0_ |= 0x00000020;
            }
            bucketLimit_.add(input.readDouble());
            break;
          }
          case 50: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
              bucketLimit_ = new java.util.ArrayList<java.lang.Double>();
              mutable_bitField0_ |= 0x00000020;
            }
            while (input.getBytesUntilLimit() > 0) {
              bucketLimit_.add(input.readDouble());
            }
            input.popLimit(limit);
            break;
          }
          case 57: {
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              bucket_ = new java.util.ArrayList<java.lang.Double>();
              mutable_bitField0_ |= 0x00000040;
            }
            bucket_.add(input.readDouble());
            break;
          }
          case 58: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040) && input.getBytesUntilLimit() > 0) {
              bucket_ = new java.util.ArrayList<java.lang.Double>();
              mutable_bitField0_ |= 0x00000040;
            }
            while (input.getBytesUntilLimit() > 0) {
              bucket_.add(input.readDouble());
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
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        bucketLimit_ = java.util.Collections.unmodifiableList(bucketLimit_);
      }
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        bucket_ = java.util.Collections.unmodifiableList(bucket_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.HistogramProto.class, org.tensorflow.framework.HistogramProto.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_FIELD_NUMBER = 1;
  private double min_;
  /**
   * <code>double min = 1;</code>
   */
  public double getMin() {
    return min_;
  }

  public static final int MAX_FIELD_NUMBER = 2;
  private double max_;
  /**
   * <code>double max = 2;</code>
   */
  public double getMax() {
    return max_;
  }

  public static final int NUM_FIELD_NUMBER = 3;
  private double num_;
  /**
   * <code>double num = 3;</code>
   */
  public double getNum() {
    return num_;
  }

  public static final int SUM_FIELD_NUMBER = 4;
  private double sum_;
  /**
   * <code>double sum = 4;</code>
   */
  public double getSum() {
    return sum_;
  }

  public static final int SUM_SQUARES_FIELD_NUMBER = 5;
  private double sumSquares_;
  /**
   * <code>double sum_squares = 5;</code>
   */
  public double getSumSquares() {
    return sumSquares_;
  }

  public static final int BUCKET_LIMIT_FIELD_NUMBER = 6;
  private java.util.List<java.lang.Double> bucketLimit_;
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   */
  public java.util.List<java.lang.Double>
      getBucketLimitList() {
    return bucketLimit_;
  }
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   */
  public int getBucketLimitCount() {
    return bucketLimit_.size();
  }
  /**
   * <pre>
   * Parallel arrays encoding the bucket boundaries and the bucket values.
   * bucket(i) is the count for the bucket i.  The range for
   * a bucket is:
   *   i == 0:  -DBL_MAX .. bucket_limit(0)
   *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
   * </pre>
   *
   * <code>repeated double bucket_limit = 6 [packed = true];</code>
   */
  public double getBucketLimit(int index) {
    return bucketLimit_.get(index);
  }
  private int bucketLimitMemoizedSerializedSize = -1;

  public static final int BUCKET_FIELD_NUMBER = 7;
  private java.util.List<java.lang.Double> bucket_;
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   */
  public java.util.List<java.lang.Double>
      getBucketList() {
    return bucket_;
  }
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   */
  public int getBucketCount() {
    return bucket_.size();
  }
  /**
   * <code>repeated double bucket = 7 [packed = true];</code>
   */
  public double getBucket(int index) {
    return bucket_.get(index);
  }
  private int bucketMemoizedSerializedSize = -1;

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
    if (min_ != 0D) {
      output.writeDouble(1, min_);
    }
    if (max_ != 0D) {
      output.writeDouble(2, max_);
    }
    if (num_ != 0D) {
      output.writeDouble(3, num_);
    }
    if (sum_ != 0D) {
      output.writeDouble(4, sum_);
    }
    if (sumSquares_ != 0D) {
      output.writeDouble(5, sumSquares_);
    }
    if (getBucketLimitList().size() > 0) {
      output.writeUInt32NoTag(50);
      output.writeUInt32NoTag(bucketLimitMemoizedSerializedSize);
    }
    for (int i = 0; i < bucketLimit_.size(); i++) {
      output.writeDoubleNoTag(bucketLimit_.get(i));
    }
    if (getBucketList().size() > 0) {
      output.writeUInt32NoTag(58);
      output.writeUInt32NoTag(bucketMemoizedSerializedSize);
    }
    for (int i = 0; i < bucket_.size(); i++) {
      output.writeDoubleNoTag(bucket_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (min_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, min_);
    }
    if (max_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, max_);
    }
    if (num_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, num_);
    }
    if (sum_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, sum_);
    }
    if (sumSquares_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, sumSquares_);
    }
    {
      int dataSize = 0;
      dataSize = 8 * getBucketLimitList().size();
      size += dataSize;
      if (!getBucketLimitList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bucketLimitMemoizedSerializedSize = dataSize;
    }
    {
      int dataSize = 0;
      dataSize = 8 * getBucketList().size();
      size += dataSize;
      if (!getBucketList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bucketMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof org.tensorflow.framework.HistogramProto)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.HistogramProto other = (org.tensorflow.framework.HistogramProto) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getMin())
        == java.lang.Double.doubleToLongBits(
            other.getMin()));
    result = result && (
        java.lang.Double.doubleToLongBits(getMax())
        == java.lang.Double.doubleToLongBits(
            other.getMax()));
    result = result && (
        java.lang.Double.doubleToLongBits(getNum())
        == java.lang.Double.doubleToLongBits(
            other.getNum()));
    result = result && (
        java.lang.Double.doubleToLongBits(getSum())
        == java.lang.Double.doubleToLongBits(
            other.getSum()));
    result = result && (
        java.lang.Double.doubleToLongBits(getSumSquares())
        == java.lang.Double.doubleToLongBits(
            other.getSumSquares()));
    result = result && getBucketLimitList()
        .equals(other.getBucketLimitList());
    result = result && getBucketList()
        .equals(other.getBucketList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + MIN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMin()));
    hash = (37 * hash) + MAX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMax()));
    hash = (37 * hash) + NUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getNum()));
    hash = (37 * hash) + SUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSum()));
    hash = (37 * hash) + SUM_SQUARES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSumSquares()));
    if (getBucketLimitCount() > 0) {
      hash = (37 * hash) + BUCKET_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + getBucketLimitList().hashCode();
    }
    if (getBucketCount() > 0) {
      hash = (37 * hash) + BUCKET_FIELD_NUMBER;
      hash = (53 * hash) + getBucketList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.HistogramProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.HistogramProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.HistogramProto parseFrom(
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
  public static Builder newBuilder(org.tensorflow.framework.HistogramProto prototype) {
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
   * <pre>
   * Serialization format for histogram module in
   * core/lib/histogram/histogram.h
   * </pre>
   *
   * Protobuf type {@code tensorflow.HistogramProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.HistogramProto)
      org.tensorflow.framework.HistogramProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.HistogramProto.class, org.tensorflow.framework.HistogramProto.Builder.class);
    }

    // Construct using org.tensorflow.framework.HistogramProto.newBuilder()
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
      min_ = 0D;

      max_ = 0D;

      num_ = 0D;

      sum_ = 0D;

      sumSquares_ = 0D;

      bucketLimit_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
      bucket_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000040);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.SummaryProtos.internal_static_tensorflow_HistogramProto_descriptor;
    }

    public org.tensorflow.framework.HistogramProto getDefaultInstanceForType() {
      return org.tensorflow.framework.HistogramProto.getDefaultInstance();
    }

    public org.tensorflow.framework.HistogramProto build() {
      org.tensorflow.framework.HistogramProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.tensorflow.framework.HistogramProto buildPartial() {
      org.tensorflow.framework.HistogramProto result = new org.tensorflow.framework.HistogramProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.min_ = min_;
      result.max_ = max_;
      result.num_ = num_;
      result.sum_ = sum_;
      result.sumSquares_ = sumSquares_;
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        bucketLimit_ = java.util.Collections.unmodifiableList(bucketLimit_);
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.bucketLimit_ = bucketLimit_;
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        bucket_ = java.util.Collections.unmodifiableList(bucket_);
        bitField0_ = (bitField0_ & ~0x00000040);
      }
      result.bucket_ = bucket_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.tensorflow.framework.HistogramProto) {
        return mergeFrom((org.tensorflow.framework.HistogramProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.HistogramProto other) {
      if (other == org.tensorflow.framework.HistogramProto.getDefaultInstance()) return this;
      if (other.getMin() != 0D) {
        setMin(other.getMin());
      }
      if (other.getMax() != 0D) {
        setMax(other.getMax());
      }
      if (other.getNum() != 0D) {
        setNum(other.getNum());
      }
      if (other.getSum() != 0D) {
        setSum(other.getSum());
      }
      if (other.getSumSquares() != 0D) {
        setSumSquares(other.getSumSquares());
      }
      if (!other.bucketLimit_.isEmpty()) {
        if (bucketLimit_.isEmpty()) {
          bucketLimit_ = other.bucketLimit_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureBucketLimitIsMutable();
          bucketLimit_.addAll(other.bucketLimit_);
        }
        onChanged();
      }
      if (!other.bucket_.isEmpty()) {
        if (bucket_.isEmpty()) {
          bucket_ = other.bucket_;
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          ensureBucketIsMutable();
          bucket_.addAll(other.bucket_);
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
      org.tensorflow.framework.HistogramProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.HistogramProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private double min_ ;
    /**
     * <code>double min = 1;</code>
     */
    public double getMin() {
      return min_;
    }
    /**
     * <code>double min = 1;</code>
     */
    public Builder setMin(double value) {
      
      min_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double min = 1;</code>
     */
    public Builder clearMin() {
      
      min_ = 0D;
      onChanged();
      return this;
    }

    private double max_ ;
    /**
     * <code>double max = 2;</code>
     */
    public double getMax() {
      return max_;
    }
    /**
     * <code>double max = 2;</code>
     */
    public Builder setMax(double value) {
      
      max_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double max = 2;</code>
     */
    public Builder clearMax() {
      
      max_ = 0D;
      onChanged();
      return this;
    }

    private double num_ ;
    /**
     * <code>double num = 3;</code>
     */
    public double getNum() {
      return num_;
    }
    /**
     * <code>double num = 3;</code>
     */
    public Builder setNum(double value) {
      
      num_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double num = 3;</code>
     */
    public Builder clearNum() {
      
      num_ = 0D;
      onChanged();
      return this;
    }

    private double sum_ ;
    /**
     * <code>double sum = 4;</code>
     */
    public double getSum() {
      return sum_;
    }
    /**
     * <code>double sum = 4;</code>
     */
    public Builder setSum(double value) {
      
      sum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double sum = 4;</code>
     */
    public Builder clearSum() {
      
      sum_ = 0D;
      onChanged();
      return this;
    }

    private double sumSquares_ ;
    /**
     * <code>double sum_squares = 5;</code>
     */
    public double getSumSquares() {
      return sumSquares_;
    }
    /**
     * <code>double sum_squares = 5;</code>
     */
    public Builder setSumSquares(double value) {
      
      sumSquares_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double sum_squares = 5;</code>
     */
    public Builder clearSumSquares() {
      
      sumSquares_ = 0D;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Double> bucketLimit_ = java.util.Collections.emptyList();
    private void ensureBucketLimitIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        bucketLimit_ = new java.util.ArrayList<java.lang.Double>(bucketLimit_);
        bitField0_ |= 0x00000020;
       }
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     */
    public java.util.List<java.lang.Double>
        getBucketLimitList() {
      return java.util.Collections.unmodifiableList(bucketLimit_);
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     */
    public int getBucketLimitCount() {
      return bucketLimit_.size();
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     */
    public double getBucketLimit(int index) {
      return bucketLimit_.get(index);
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     */
    public Builder setBucketLimit(
        int index, double value) {
      ensureBucketLimitIsMutable();
      bucketLimit_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     */
    public Builder addBucketLimit(double value) {
      ensureBucketLimitIsMutable();
      bucketLimit_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     */
    public Builder addAllBucketLimit(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureBucketLimitIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bucketLimit_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Parallel arrays encoding the bucket boundaries and the bucket values.
     * bucket(i) is the count for the bucket i.  The range for
     * a bucket is:
     *   i == 0:  -DBL_MAX .. bucket_limit(0)
     *   i != 0:  bucket_limit(i-1) .. bucket_limit(i)
     * </pre>
     *
     * <code>repeated double bucket_limit = 6 [packed = true];</code>
     */
    public Builder clearBucketLimit() {
      bucketLimit_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Double> bucket_ = java.util.Collections.emptyList();
    private void ensureBucketIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        bucket_ = new java.util.ArrayList<java.lang.Double>(bucket_);
        bitField0_ |= 0x00000040;
       }
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     */
    public java.util.List<java.lang.Double>
        getBucketList() {
      return java.util.Collections.unmodifiableList(bucket_);
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     */
    public int getBucketCount() {
      return bucket_.size();
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     */
    public double getBucket(int index) {
      return bucket_.get(index);
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     */
    public Builder setBucket(
        int index, double value) {
      ensureBucketIsMutable();
      bucket_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     */
    public Builder addBucket(double value) {
      ensureBucketIsMutable();
      bucket_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     */
    public Builder addAllBucket(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureBucketIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, bucket_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated double bucket = 7 [packed = true];</code>
     */
    public Builder clearBucket() {
      bucket_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000040);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.HistogramProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.HistogramProto)
  private static final org.tensorflow.framework.HistogramProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.HistogramProto();
  }

  public static org.tensorflow.framework.HistogramProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistogramProto>
      PARSER = new com.google.protobuf.AbstractParser<HistogramProto>() {
    public HistogramProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new HistogramProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HistogramProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistogramProto> getParserForType() {
    return PARSER;
  }

  public org.tensorflow.framework.HistogramProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

