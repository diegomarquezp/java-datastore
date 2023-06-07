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

public interface FilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A composite filter.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
   *
   * @return Whether the compositeFilter field is set.
   */
  boolean hasCompositeFilter();
  /**
   *
   *
   * <pre>
   * A composite filter.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
   *
   * @return The compositeFilter.
   */
  com.google.datastore.v1.CompositeFilter getCompositeFilter();
  /**
   *
   *
   * <pre>
   * A composite filter.
   * </pre>
   *
   * <code>.google.datastore.v1.CompositeFilter composite_filter = 1;</code>
   */
  com.google.datastore.v1.CompositeFilterOrBuilder getCompositeFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter on a property.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
   *
   * @return Whether the propertyFilter field is set.
   */
  boolean hasPropertyFilter();
  /**
   *
   *
   * <pre>
   * A filter on a property.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
   *
   * @return The propertyFilter.
   */
  com.google.datastore.v1.PropertyFilter getPropertyFilter();
  /**
   *
   *
   * <pre>
   * A filter on a property.
   * </pre>
   *
   * <code>.google.datastore.v1.PropertyFilter property_filter = 2;</code>
   */
  com.google.datastore.v1.PropertyFilterOrBuilder getPropertyFilterOrBuilder();

  com.google.datastore.v1.Filter.FilterTypeCase getFilterTypeCase();
}
