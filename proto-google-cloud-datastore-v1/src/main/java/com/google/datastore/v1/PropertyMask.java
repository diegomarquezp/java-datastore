/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/datastore/v1/datastore.proto

// Protobuf Java Version: 3.25.2
package com.google.datastore.v1;

/**
 *
 *
 * <pre>
 * The set of arbitrarily nested property paths used to restrict an operation to
 * only a subset of properties in an entity.
 * </pre>
 *
 * Protobuf type {@code google.datastore.v1.PropertyMask}
 */
public final class PropertyMask extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.datastore.v1.PropertyMask)
    PropertyMaskOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PropertyMask.newBuilder() to construct.
  private PropertyMask(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PropertyMask() {
    paths_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PropertyMask();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_PropertyMask_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.datastore.v1.DatastoreProto
        .internal_static_google_datastore_v1_PropertyMask_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.datastore.v1.PropertyMask.class,
            com.google.datastore.v1.PropertyMask.Builder.class);
  }

  public static final int PATHS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList paths_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The paths to the properties covered by this mask.
   *
   * A path is a list of property names separated by dots (`.`), for example
   * `foo.bar` means the property `bar` inside the entity property `foo` inside
   * the entity associated with this path.
   *
   * If a property name contains a dot `.` or a backslash `&#92;`, then that
   * name must be escaped.
   *
   * A path must not be empty, and may not reference a value inside an
   * [array value][google.datastore.v1.Value.array_value].
   * </pre>
   *
   * <code>repeated string paths = 1;</code>
   *
   * @return A list containing the paths.
   */
  public com.google.protobuf.ProtocolStringList getPathsList() {
    return paths_;
  }
  /**
   *
   *
   * <pre>
   * The paths to the properties covered by this mask.
   *
   * A path is a list of property names separated by dots (`.`), for example
   * `foo.bar` means the property `bar` inside the entity property `foo` inside
   * the entity associated with this path.
   *
   * If a property name contains a dot `.` or a backslash `&#92;`, then that
   * name must be escaped.
   *
   * A path must not be empty, and may not reference a value inside an
   * [array value][google.datastore.v1.Value.array_value].
   * </pre>
   *
   * <code>repeated string paths = 1;</code>
   *
   * @return The count of paths.
   */
  public int getPathsCount() {
    return paths_.size();
  }
  /**
   *
   *
   * <pre>
   * The paths to the properties covered by this mask.
   *
   * A path is a list of property names separated by dots (`.`), for example
   * `foo.bar` means the property `bar` inside the entity property `foo` inside
   * the entity associated with this path.
   *
   * If a property name contains a dot `.` or a backslash `&#92;`, then that
   * name must be escaped.
   *
   * A path must not be empty, and may not reference a value inside an
   * [array value][google.datastore.v1.Value.array_value].
   * </pre>
   *
   * <code>repeated string paths = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  public java.lang.String getPaths(int index) {
    return paths_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The paths to the properties covered by this mask.
   *
   * A path is a list of property names separated by dots (`.`), for example
   * `foo.bar` means the property `bar` inside the entity property `foo` inside
   * the entity associated with this path.
   *
   * If a property name contains a dot `.` or a backslash `&#92;`, then that
   * name must be escaped.
   *
   * A path must not be empty, and may not reference a value inside an
   * [array value][google.datastore.v1.Value.array_value].
   * </pre>
   *
   * <code>repeated string paths = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the paths at the given index.
   */
  public com.google.protobuf.ByteString getPathsBytes(int index) {
    return paths_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < paths_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, paths_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < paths_.size(); i++) {
        dataSize += computeStringSizeNoTag(paths_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPathsList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.datastore.v1.PropertyMask)) {
      return super.equals(obj);
    }
    com.google.datastore.v1.PropertyMask other = (com.google.datastore.v1.PropertyMask) obj;

    if (!getPathsList().equals(other.getPathsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPathsCount() > 0) {
      hash = (37 * hash) + PATHS_FIELD_NUMBER;
      hash = (53 * hash) + getPathsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.PropertyMask parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.PropertyMask parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.datastore.v1.PropertyMask parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.datastore.v1.PropertyMask prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The set of arbitrarily nested property paths used to restrict an operation to
   * only a subset of properties in an entity.
   * </pre>
   *
   * Protobuf type {@code google.datastore.v1.PropertyMask}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.datastore.v1.PropertyMask)
      com.google.datastore.v1.PropertyMaskOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_PropertyMask_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_PropertyMask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.datastore.v1.PropertyMask.class,
              com.google.datastore.v1.PropertyMask.Builder.class);
    }

    // Construct using com.google.datastore.v1.PropertyMask.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      paths_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.datastore.v1.DatastoreProto
          .internal_static_google_datastore_v1_PropertyMask_descriptor;
    }

    @java.lang.Override
    public com.google.datastore.v1.PropertyMask getDefaultInstanceForType() {
      return com.google.datastore.v1.PropertyMask.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.datastore.v1.PropertyMask build() {
      com.google.datastore.v1.PropertyMask result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.datastore.v1.PropertyMask buildPartial() {
      com.google.datastore.v1.PropertyMask result = new com.google.datastore.v1.PropertyMask(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.datastore.v1.PropertyMask result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        paths_.makeImmutable();
        result.paths_ = paths_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.datastore.v1.PropertyMask) {
        return mergeFrom((com.google.datastore.v1.PropertyMask) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.datastore.v1.PropertyMask other) {
      if (other == com.google.datastore.v1.PropertyMask.getDefaultInstance()) return this;
      if (!other.paths_.isEmpty()) {
        if (paths_.isEmpty()) {
          paths_ = other.paths_;
          bitField0_ |= 0x00000001;
        } else {
          ensurePathsIsMutable();
          paths_.addAll(other.paths_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensurePathsIsMutable();
                paths_.add(s);
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringArrayList paths_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensurePathsIsMutable() {
      if (!paths_.isModifiable()) {
        paths_ = new com.google.protobuf.LazyStringArrayList(paths_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @return A list containing the paths.
     */
    public com.google.protobuf.ProtocolStringList getPathsList() {
      paths_.makeImmutable();
      return paths_;
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @return The count of paths.
     */
    public int getPathsCount() {
      return paths_.size();
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The paths at the given index.
     */
    public java.lang.String getPaths(int index) {
      return paths_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the paths at the given index.
     */
    public com.google.protobuf.ByteString getPathsBytes(int index) {
      return paths_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The paths to set.
     * @return This builder for chaining.
     */
    public Builder setPaths(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePathsIsMutable();
      paths_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @param value The paths to add.
     * @return This builder for chaining.
     */
    public Builder addPaths(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensurePathsIsMutable();
      paths_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @param values The paths to add.
     * @return This builder for chaining.
     */
    public Builder addAllPaths(java.lang.Iterable<java.lang.String> values) {
      ensurePathsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, paths_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPaths() {
      paths_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The paths to the properties covered by this mask.
     *
     * A path is a list of property names separated by dots (`.`), for example
     * `foo.bar` means the property `bar` inside the entity property `foo` inside
     * the entity associated with this path.
     *
     * If a property name contains a dot `.` or a backslash `&#92;`, then that
     * name must be escaped.
     *
     * A path must not be empty, and may not reference a value inside an
     * [array value][google.datastore.v1.Value.array_value].
     * </pre>
     *
     * <code>repeated string paths = 1;</code>
     *
     * @param value The bytes of the paths to add.
     * @return This builder for chaining.
     */
    public Builder addPathsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensurePathsIsMutable();
      paths_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.datastore.v1.PropertyMask)
  }

  // @@protoc_insertion_point(class_scope:google.datastore.v1.PropertyMask)
  private static final com.google.datastore.v1.PropertyMask DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.datastore.v1.PropertyMask();
  }

  public static com.google.datastore.v1.PropertyMask getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PropertyMask> PARSER =
      new com.google.protobuf.AbstractParser<PropertyMask>() {
        @java.lang.Override
        public PropertyMask parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PropertyMask> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PropertyMask> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.datastore.v1.PropertyMask getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
