/*
 * Copyright 2020 Google LLC
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
// source: google/datastore/v1/query.proto

package com.google.datastore.v1;

public interface QueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.Query)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The projection to return. Defaults to returning all properties.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Projection projection = 2;</code>
   */
  java.util.List<com.google.datastore.v1.Projection> getProjectionList();
  /**
   *
   *
   * <pre>
   * The projection to return. Defaults to returning all properties.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Projection projection = 2;</code>
   */
  com.google.datastore.v1.Projection getProjection(int index);
  /**
   *
   *
   * <pre>
   * The projection to return. Defaults to returning all properties.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Projection projection = 2;</code>
   */
  int getProjectionCount();
  /**
   *
   *
   * <pre>
   * The projection to return. Defaults to returning all properties.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Projection projection = 2;</code>
   */
  java.util.List<? extends com.google.datastore.v1.ProjectionOrBuilder>
      getProjectionOrBuilderList();
  /**
   *
   *
   * <pre>
   * The projection to return. Defaults to returning all properties.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Projection projection = 2;</code>
   */
  com.google.datastore.v1.ProjectionOrBuilder getProjectionOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The kinds to query (if empty, returns entities of all kinds).
   * Currently at most 1 kind may be specified.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.KindExpression kind = 3;</code>
   */
  java.util.List<com.google.datastore.v1.KindExpression> getKindList();
  /**
   *
   *
   * <pre>
   * The kinds to query (if empty, returns entities of all kinds).
   * Currently at most 1 kind may be specified.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.KindExpression kind = 3;</code>
   */
  com.google.datastore.v1.KindExpression getKind(int index);
  /**
   *
   *
   * <pre>
   * The kinds to query (if empty, returns entities of all kinds).
   * Currently at most 1 kind may be specified.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.KindExpression kind = 3;</code>
   */
  int getKindCount();
  /**
   *
   *
   * <pre>
   * The kinds to query (if empty, returns entities of all kinds).
   * Currently at most 1 kind may be specified.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.KindExpression kind = 3;</code>
   */
  java.util.List<? extends com.google.datastore.v1.KindExpressionOrBuilder> getKindOrBuilderList();
  /**
   *
   *
   * <pre>
   * The kinds to query (if empty, returns entities of all kinds).
   * Currently at most 1 kind may be specified.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.KindExpression kind = 3;</code>
   */
  com.google.datastore.v1.KindExpressionOrBuilder getKindOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The filter to apply.
   * </pre>
   *
   * <code>.google.datastore.v1.Filter filter = 4;</code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   *
   *
   * <pre>
   * The filter to apply.
   * </pre>
   *
   * <code>.google.datastore.v1.Filter filter = 4;</code>
   *
   * @return The filter.
   */
  com.google.datastore.v1.Filter getFilter();
  /**
   *
   *
   * <pre>
   * The filter to apply.
   * </pre>
   *
   * <code>.google.datastore.v1.Filter filter = 4;</code>
   */
  com.google.datastore.v1.FilterOrBuilder getFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * The order to apply to the query results (if empty, order is unspecified).
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyOrder order = 5;</code>
   */
  java.util.List<com.google.datastore.v1.PropertyOrder> getOrderList();
  /**
   *
   *
   * <pre>
   * The order to apply to the query results (if empty, order is unspecified).
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyOrder order = 5;</code>
   */
  com.google.datastore.v1.PropertyOrder getOrder(int index);
  /**
   *
   *
   * <pre>
   * The order to apply to the query results (if empty, order is unspecified).
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyOrder order = 5;</code>
   */
  int getOrderCount();
  /**
   *
   *
   * <pre>
   * The order to apply to the query results (if empty, order is unspecified).
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyOrder order = 5;</code>
   */
  java.util.List<? extends com.google.datastore.v1.PropertyOrderOrBuilder> getOrderOrBuilderList();
  /**
   *
   *
   * <pre>
   * The order to apply to the query results (if empty, order is unspecified).
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyOrder order = 5;</code>
   */
  com.google.datastore.v1.PropertyOrderOrBuilder getOrderOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The properties to make distinct. The query results will contain the first
   * result for each distinct combination of values for the given properties
   * (if empty, all results are returned).
   *
   * Requires:
   *
   * * If `order` is specified, the set of distinct on properties must appear
   * before the non-distinct on properties in `order`.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyReference distinct_on = 6;</code>
   */
  java.util.List<com.google.datastore.v1.PropertyReference> getDistinctOnList();
  /**
   *
   *
   * <pre>
   * The properties to make distinct. The query results will contain the first
   * result for each distinct combination of values for the given properties
   * (if empty, all results are returned).
   *
   * Requires:
   *
   * * If `order` is specified, the set of distinct on properties must appear
   * before the non-distinct on properties in `order`.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyReference distinct_on = 6;</code>
   */
  com.google.datastore.v1.PropertyReference getDistinctOn(int index);
  /**
   *
   *
   * <pre>
   * The properties to make distinct. The query results will contain the first
   * result for each distinct combination of values for the given properties
   * (if empty, all results are returned).
   *
   * Requires:
   *
   * * If `order` is specified, the set of distinct on properties must appear
   * before the non-distinct on properties in `order`.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyReference distinct_on = 6;</code>
   */
  int getDistinctOnCount();
  /**
   *
   *
   * <pre>
   * The properties to make distinct. The query results will contain the first
   * result for each distinct combination of values for the given properties
   * (if empty, all results are returned).
   *
   * Requires:
   *
   * * If `order` is specified, the set of distinct on properties must appear
   * before the non-distinct on properties in `order`.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyReference distinct_on = 6;</code>
   */
  java.util.List<? extends com.google.datastore.v1.PropertyReferenceOrBuilder>
      getDistinctOnOrBuilderList();
  /**
   *
   *
   * <pre>
   * The properties to make distinct. The query results will contain the first
   * result for each distinct combination of values for the given properties
   * (if empty, all results are returned).
   *
   * Requires:
   *
   * * If `order` is specified, the set of distinct on properties must appear
   * before the non-distinct on properties in `order`.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.PropertyReference distinct_on = 6;</code>
   */
  com.google.datastore.v1.PropertyReferenceOrBuilder getDistinctOnOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A starting point for the query results. Query cursors are
   * returned in query result batches and
   * [can only be used to continue the same
   * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
   * </pre>
   *
   * <code>bytes start_cursor = 7;</code>
   *
   * @return The startCursor.
   */
  com.google.protobuf.ByteString getStartCursor();

  /**
   *
   *
   * <pre>
   * An ending point for the query results. Query cursors are
   * returned in query result batches and
   * [can only be used to limit the same
   * query](https://cloud.google.com/datastore/docs/concepts/queries#cursors_limits_and_offsets).
   * </pre>
   *
   * <code>bytes end_cursor = 8;</code>
   *
   * @return The endCursor.
   */
  com.google.protobuf.ByteString getEndCursor();

  /**
   *
   *
   * <pre>
   * The number of results to skip. Applies before limit, but after all other
   * constraints. Optional. Must be &gt;= 0 if specified.
   * </pre>
   *
   * <code>int32 offset = 10;</code>
   *
   * @return The offset.
   */
  int getOffset();

  /**
   *
   *
   * <pre>
   * The maximum number of results to return. Applies after all other
   * constraints. Optional.
   * Unspecified is interpreted as no limit.
   * Must be &gt;= 0 if specified.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 12;</code>
   *
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   *
   *
   * <pre>
   * The maximum number of results to return. Applies after all other
   * constraints. Optional.
   * Unspecified is interpreted as no limit.
   * Must be &gt;= 0 if specified.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 12;</code>
   *
   * @return The limit.
   */
  com.google.protobuf.Int32Value getLimit();
  /**
   *
   *
   * <pre>
   * The maximum number of results to return. Applies after all other
   * constraints. Optional.
   * Unspecified is interpreted as no limit.
   * Must be &gt;= 0 if specified.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value limit = 12;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getLimitOrBuilder();
}
