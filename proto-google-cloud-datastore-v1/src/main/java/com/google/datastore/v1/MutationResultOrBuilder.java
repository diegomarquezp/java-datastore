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

package com.google.datastore.v1;

public interface MutationResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.MutationResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   *
   *
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   *
   * @return The key.
   */
  com.google.datastore.v1.Key getKey();
  /**
   *
   *
   * <pre>
   * The automatically allocated key.
   * Set only when the mutation allocated a key.
   * </pre>
   *
   * <code>.google.datastore.v1.Key key = 3;</code>
   */
  com.google.datastore.v1.KeyOrBuilder getKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The version of the entity on the server after processing the mutation. If
   * the mutation doesn't change anything on the server, then the version will
   * be the version of the current entity or, if no entity is present, a version
   * that is strictly greater than the version of any previous entity and less
   * than the version of any possible future entity.
   * </pre>
   *
   * <code>int64 version = 4;</code>
   *
   * @return The version.
   */
  long getVersion();

  /**
   *
   *
   * <pre>
   * The create time of the entity. This field will not be set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The create time of the entity. This field will not be set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The create time of the entity. This field will not be set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The update time of the entity on the server after processing the mutation.
   * If the mutation doesn't change anything on the server, then the timestamp
   * will be the update timestamp of the current entity. This field will not be
   * set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the entity on the server after processing the mutation.
   * If the mutation doesn't change anything on the server, then the timestamp
   * will be the update timestamp of the current entity. This field will not be
   * set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The update time of the entity on the server after processing the mutation.
   * If the mutation doesn't change anything on the server, then the timestamp
   * will be the update timestamp of the current entity. This field will not be
   * set after a 'delete'.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether a conflict was detected for this mutation. Always false when a
   * conflict detection strategy field is not set in the mutation.
   * </pre>
   *
   * <code>bool conflict_detected = 5;</code>
   *
   * @return The conflictDetected.
   */
  boolean getConflictDetected();
}
