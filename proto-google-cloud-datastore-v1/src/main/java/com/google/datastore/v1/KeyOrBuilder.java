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
// source: google/datastore/v1/entity.proto

package com.google.datastore.v1;

public interface KeyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.datastore.v1.Key)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Entities are partitioned into subsets, currently identified by a project
   * ID and namespace ID.
   * Queries are scoped to a single partition.
   * </pre>
   *
   * <code>.google.datastore.v1.PartitionId partition_id = 1;</code>
   *
   * @return Whether the partitionId field is set.
   */
  boolean hasPartitionId();
  /**
   *
   *
   * <pre>
   * Entities are partitioned into subsets, currently identified by a project
   * ID and namespace ID.
   * Queries are scoped to a single partition.
   * </pre>
   *
   * <code>.google.datastore.v1.PartitionId partition_id = 1;</code>
   *
   * @return The partitionId.
   */
  com.google.datastore.v1.PartitionId getPartitionId();
  /**
   *
   *
   * <pre>
   * Entities are partitioned into subsets, currently identified by a project
   * ID and namespace ID.
   * Queries are scoped to a single partition.
   * </pre>
   *
   * <code>.google.datastore.v1.PartitionId partition_id = 1;</code>
   */
  com.google.datastore.v1.PartitionIdOrBuilder getPartitionIdOrBuilder();

  /**
   *
   *
   * <pre>
   * The entity path.
   * An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first
   * element identifies a _root entity_, the second element identifies
   * a _child_ of the root entity, the third element identifies a child of the
   * second entity, and so forth. The entities identified by all prefixes of
   * the path are called the element's _ancestors_.
   *
   * An entity path is always fully complete: *all* of the entity's ancestors
   * are required to be in the path along with the entity identifier itself.
   * The only exception is that in some documented cases, the identifier in the
   * last path element (for the entity) itself may be omitted. For example,
   * the last path element of the key of `Mutation.insert` may have no
   * identifier.
   *
   * A path can never be empty, and a path can have at most 100 elements.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key.PathElement path = 2;</code>
   */
  java.util.List<com.google.datastore.v1.Key.PathElement> getPathList();
  /**
   *
   *
   * <pre>
   * The entity path.
   * An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first
   * element identifies a _root entity_, the second element identifies
   * a _child_ of the root entity, the third element identifies a child of the
   * second entity, and so forth. The entities identified by all prefixes of
   * the path are called the element's _ancestors_.
   *
   * An entity path is always fully complete: *all* of the entity's ancestors
   * are required to be in the path along with the entity identifier itself.
   * The only exception is that in some documented cases, the identifier in the
   * last path element (for the entity) itself may be omitted. For example,
   * the last path element of the key of `Mutation.insert` may have no
   * identifier.
   *
   * A path can never be empty, and a path can have at most 100 elements.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key.PathElement path = 2;</code>
   */
  com.google.datastore.v1.Key.PathElement getPath(int index);
  /**
   *
   *
   * <pre>
   * The entity path.
   * An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first
   * element identifies a _root entity_, the second element identifies
   * a _child_ of the root entity, the third element identifies a child of the
   * second entity, and so forth. The entities identified by all prefixes of
   * the path are called the element's _ancestors_.
   *
   * An entity path is always fully complete: *all* of the entity's ancestors
   * are required to be in the path along with the entity identifier itself.
   * The only exception is that in some documented cases, the identifier in the
   * last path element (for the entity) itself may be omitted. For example,
   * the last path element of the key of `Mutation.insert` may have no
   * identifier.
   *
   * A path can never be empty, and a path can have at most 100 elements.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key.PathElement path = 2;</code>
   */
  int getPathCount();
  /**
   *
   *
   * <pre>
   * The entity path.
   * An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first
   * element identifies a _root entity_, the second element identifies
   * a _child_ of the root entity, the third element identifies a child of the
   * second entity, and so forth. The entities identified by all prefixes of
   * the path are called the element's _ancestors_.
   *
   * An entity path is always fully complete: *all* of the entity's ancestors
   * are required to be in the path along with the entity identifier itself.
   * The only exception is that in some documented cases, the identifier in the
   * last path element (for the entity) itself may be omitted. For example,
   * the last path element of the key of `Mutation.insert` may have no
   * identifier.
   *
   * A path can never be empty, and a path can have at most 100 elements.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key.PathElement path = 2;</code>
   */
  java.util.List<? extends com.google.datastore.v1.Key.PathElementOrBuilder> getPathOrBuilderList();
  /**
   *
   *
   * <pre>
   * The entity path.
   * An entity path consists of one or more elements composed of a kind and a
   * string or numerical identifier, which identify entities. The first
   * element identifies a _root entity_, the second element identifies
   * a _child_ of the root entity, the third element identifies a child of the
   * second entity, and so forth. The entities identified by all prefixes of
   * the path are called the element's _ancestors_.
   *
   * An entity path is always fully complete: *all* of the entity's ancestors
   * are required to be in the path along with the entity identifier itself.
   * The only exception is that in some documented cases, the identifier in the
   * last path element (for the entity) itself may be omitted. For example,
   * the last path element of the key of `Mutation.insert` may have no
   * identifier.
   *
   * A path can never be empty, and a path can have at most 100 elements.
   * </pre>
   *
   * <code>repeated .google.datastore.v1.Key.PathElement path = 2;</code>
   */
  com.google.datastore.v1.Key.PathElementOrBuilder getPathOrBuilder(int index);
}
