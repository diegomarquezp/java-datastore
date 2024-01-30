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

public interface RunQueryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.RunQueryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A batch of query results (always present).
   * </pre>
   *
   * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
   *
   * @return Whether the batch field is set.
   */
  boolean hasBatch();
  /**
   *
   *
   * <pre>
   * A batch of query results (always present).
   * </pre>
   *
   * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
   *
   * @return The batch.
   */
  com.google.datastore.v1.QueryResultBatch getBatch();
  /**
   *
   *
   * <pre>
   * A batch of query results (always present).
   * </pre>
   *
   * <code>.google.datastore.v1.QueryResultBatch batch = 1;</code>
   */
  com.google.datastore.v1.QueryResultBatchOrBuilder getBatchOrBuilder();

  /**
   *
   *
   * <pre>
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * </pre>
   *
   * <code>.google.datastore.v1.Query query = 2;</code>
   *
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   *
   *
   * <pre>
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * </pre>
   *
   * <code>.google.datastore.v1.Query query = 2;</code>
   *
   * @return The query.
   */
  com.google.datastore.v1.Query getQuery();
  /**
   *
   *
   * <pre>
   * The parsed form of the `GqlQuery` from the request, if it was set.
   * </pre>
   *
   * <code>.google.datastore.v1.Query query = 2;</code>
   */
  com.google.datastore.v1.QueryOrBuilder getQueryOrBuilder();

  /**
   *
   *
   * <pre>
   * The identifier of the transaction that was started as part of this
   * RunQuery request.
   *
   * Set only when
   * [ReadOptions.new_transaction][google.datastore.v1.ReadOptions.new_transaction]
   * was set in
   * [RunQueryRequest.read_options][google.datastore.v1.RunQueryRequest.read_options].
   * </pre>
   *
   * <code>bytes transaction = 5;</code>
   *
   * @return The transaction.
   */
  com.google.protobuf.ByteString getTransaction();
}
