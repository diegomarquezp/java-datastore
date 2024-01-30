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
// source: google/datastore/admin/v1/datastore_admin.proto

package com.google.datastore.admin.v1;

public interface GetIndexRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.admin.v1.GetIndexRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Project ID against which to make the request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project ID against which to make the request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The resource ID of the index to get.
   * </pre>
   *
   * <code>string index_id = 3;</code>
   *
   * @return The indexId.
   */
  java.lang.String getIndexId();
  /**
   *
   *
   * <pre>
   * The resource ID of the index to get.
   * </pre>
   *
   * <code>string index_id = 3;</code>
   *
   * @return The bytes for indexId.
   */
  com.google.protobuf.ByteString getIndexIdBytes();
}
