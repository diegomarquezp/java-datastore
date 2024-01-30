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

public interface ImportEntitiesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.admin.v1.ImportEntitiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Project ID against which to make the request.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Required. Project ID against which to make the request.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Client-assigned labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Required. The full resource URL of the external storage location.
   * Currently, only Google Cloud Storage is supported. So input_url should be
   * of the form:
   * `gs://BUCKET_NAME[/NAMESPACE_PATH]/OVERALL_EXPORT_METADATA_FILE`, where
   * `BUCKET_NAME` is the name of the Cloud Storage bucket, `NAMESPACE_PATH` is
   * an optional Cloud Storage namespace path (this is not a Cloud Datastore
   * namespace), and `OVERALL_EXPORT_METADATA_FILE` is the metadata file written
   * by the ExportEntities operation. For more information about Cloud Storage
   * namespace paths, see
   * [Object name
   * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
   *
   * For more information, see
   * [google.datastore.admin.v1.ExportEntitiesResponse.output_url][google.datastore.admin.v1.ExportEntitiesResponse.output_url].
   * </pre>
   *
   * <code>string input_url = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The inputUrl.
   */
  java.lang.String getInputUrl();
  /**
   *
   *
   * <pre>
   * Required. The full resource URL of the external storage location.
   * Currently, only Google Cloud Storage is supported. So input_url should be
   * of the form:
   * `gs://BUCKET_NAME[/NAMESPACE_PATH]/OVERALL_EXPORT_METADATA_FILE`, where
   * `BUCKET_NAME` is the name of the Cloud Storage bucket, `NAMESPACE_PATH` is
   * an optional Cloud Storage namespace path (this is not a Cloud Datastore
   * namespace), and `OVERALL_EXPORT_METADATA_FILE` is the metadata file written
   * by the ExportEntities operation. For more information about Cloud Storage
   * namespace paths, see
   * [Object name
   * considerations](https://cloud.google.com/storage/docs/naming#object-considerations).
   *
   * For more information, see
   * [google.datastore.admin.v1.ExportEntitiesResponse.output_url][google.datastore.admin.v1.ExportEntitiesResponse.output_url].
   * </pre>
   *
   * <code>string input_url = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for inputUrl.
   */
  com.google.protobuf.ByteString getInputUrlBytes();

  /**
   *
   *
   * <pre>
   * Optionally specify which kinds/namespaces are to be imported. If provided,
   * the list must be a subset of the EntityFilter used in creating the export,
   * otherwise a FAILED_PRECONDITION error will be returned. If no filter is
   * specified then all entities from the export are imported.
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
   * Optionally specify which kinds/namespaces are to be imported. If provided,
   * the list must be a subset of the EntityFilter used in creating the export,
   * otherwise a FAILED_PRECONDITION error will be returned. If no filter is
   * specified then all entities from the export are imported.
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
   * Optionally specify which kinds/namespaces are to be imported. If provided,
   * the list must be a subset of the EntityFilter used in creating the export,
   * otherwise a FAILED_PRECONDITION error will be returned. If no filter is
   * specified then all entities from the export are imported.
   * </pre>
   *
   * <code>.google.datastore.admin.v1.EntityFilter entity_filter = 4;</code>
   */
  com.google.datastore.admin.v1.EntityFilterOrBuilder getEntityFilterOrBuilder();
}
