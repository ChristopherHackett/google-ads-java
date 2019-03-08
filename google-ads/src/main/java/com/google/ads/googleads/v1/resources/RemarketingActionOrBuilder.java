// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/remarketing_action.proto

package com.google.ads.googleads.v1.resources;

public interface RemarketingActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.RemarketingAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the remarketing action.
   * Remarketing action resource names have the form:
   * `customers/{customer_id}/remarketingActions/{remarketing_action_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the remarketing action.
   * Remarketing action resource names have the form:
   * `customers/{customer_id}/remarketingActions/{remarketing_action_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Id of the remarketing action.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * Id of the remarketing action.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Id of the remarketing action.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The name of the remarketing action.
   * This field is required and should not be empty when creating new
   * remarketing actions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the remarketing action.
   * This field is required and should not be empty when creating new
   * remarketing actions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The name of the remarketing action.
   * This field is required and should not be empty when creating new
   * remarketing actions.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.TagSnippet tag_snippets = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v1.common.TagSnippet> 
      getTagSnippetsList();
  /**
   * <pre>
   * The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.TagSnippet tag_snippets = 4;</code>
   */
  com.google.ads.googleads.v1.common.TagSnippet getTagSnippets(int index);
  /**
   * <pre>
   * The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.TagSnippet tag_snippets = 4;</code>
   */
  int getTagSnippetsCount();
  /**
   * <pre>
   * The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.TagSnippet tag_snippets = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v1.common.TagSnippetOrBuilder> 
      getTagSnippetsOrBuilderList();
  /**
   * <pre>
   * The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.TagSnippet tag_snippets = 4;</code>
   */
  com.google.ads.googleads.v1.common.TagSnippetOrBuilder getTagSnippetsOrBuilder(
      int index);
}