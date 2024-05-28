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

// Protobuf Java Version: 3.25.2
package com.google.datastore.admin.v1;

public interface ExportEntitiesMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.admin.v1.ExportEntitiesMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Metadata common to all Datastore Admin operations.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
   *
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   *
   *
   * <pre>
   * Metadata common to all Datastore Admin operations.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
   *
   * @return The common.
   */
  com.google.datastore.admin.v1.CommonMetadata getCommon();
  /**
   *
   *
   * <pre>
   * Metadata common to all Datastore Admin operations.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.CommonMetadata common = 1;</code>
   */
  com.google.datastore.admin.v1.CommonMetadataOrBuilder getCommonOrBuilder();

  /**
   *
   *
   * <pre>
   * An estimate of the number of entities processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
   *
   * @return Whether the progressEntities field is set.
   */
  boolean hasProgressEntities();
  /**
   *
   *
   * <pre>
   * An estimate of the number of entities processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
   *
   * @return The progressEntities.
   */
  com.google.datastore.admin.v1.Progress getProgressEntities();
  /**
   *
   *
   * <pre>
   * An estimate of the number of entities processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_entities = 2;</code>
   */
  com.google.datastore.admin.v1.ProgressOrBuilder getProgressEntitiesOrBuilder();

  /**
   *
   *
   * <pre>
   * An estimate of the number of bytes processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_bytes = 3;</code>
   *
   * @return Whether the progressBytes field is set.
   */
  boolean hasProgressBytes();
  /**
   *
   *
   * <pre>
   * An estimate of the number of bytes processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_bytes = 3;</code>
   *
   * @return The progressBytes.
   */
  com.google.datastore.admin.v1.Progress getProgressBytes();
  /**
   *
   *
   * <pre>
   * An estimate of the number of bytes processed.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.Progress progress_bytes = 3;</code>
   */
  com.google.datastore.admin.v1.ProgressOrBuilder getProgressBytesOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of which entities are being exported.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.EntityFilter entity_filter = 4;</code>
   *
   * @return Whether the entityFilter field is set.
   */
  boolean hasEntityFilter();
  /**
   *
   *
   * <pre>
   * Description of which entities are being exported.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.EntityFilter entity_filter = 4;</code>
   *
   * @return The entityFilter.
   */
  com.google.datastore.admin.v1.EntityFilter getEntityFilter();
  /**
   *
   *
   * <pre>
   * Description of which entities are being exported.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.EntityFilter entity_filter = 4;</code>
   */
  com.google.datastore.admin.v1.EntityFilterOrBuilder getEntityFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Location for the export metadata and data files. This will be the same
   * value as the
   * [google.datastore.admin.v1.ExportEntitiesRequest.output_url_prefix][google.datastore.admin.v1.ExportEntitiesRequest.output_url_prefix]
   * field. The final output location is provided in
   * [google.datastore.admin.v1.ExportEntitiesResponse.output_url][google.datastore.admin.v1.ExportEntitiesResponse.output_url].
   * </pre>
   *
   * <code>string output_url_prefix = 5;</code>
   *
   * @return The outputUrlPrefix.
   */
  java.lang.String getOutputUrlPrefix();
  /**
   *
   *
   * <pre>
   * Location for the export metadata and data files. This will be the same
   * value as the
   * [google.datastore.admin.v1.ExportEntitiesRequest.output_url_prefix][google.datastore.admin.v1.ExportEntitiesRequest.output_url_prefix]
   * field. The final output location is provided in
   * [google.datastore.admin.v1.ExportEntitiesResponse.output_url][google.datastore.admin.v1.ExportEntitiesResponse.output_url].
   * </pre>
   *
   * <code>string output_url_prefix = 5;</code>
   *
   * @return The bytes for outputUrlPrefix.
   */
  com.google.protobuf.ByteString getOutputUrlPrefixBytes();
}
