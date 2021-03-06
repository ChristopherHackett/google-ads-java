// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/policy.proto

package com.google.ads.googleads.v0.common;

public interface PolicyTopicEvidenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.common.PolicyTopicEvidence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * HTTP code returned when the final URL was crawled.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value http_code = 2;</code>
   */
  boolean hasHttpCode();
  /**
   * <pre>
   * HTTP code returned when the final URL was crawled.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value http_code = 2;</code>
   */
  com.google.protobuf.Int32Value getHttpCode();
  /**
   * <pre>
   * HTTP code returned when the final URL was crawled.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value http_code = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getHttpCodeOrBuilder();

  /**
   * <pre>
   * List of websites linked with this resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.WebsiteList website_list = 3;</code>
   */
  boolean hasWebsiteList();
  /**
   * <pre>
   * List of websites linked with this resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.WebsiteList website_list = 3;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.WebsiteList getWebsiteList();
  /**
   * <pre>
   * List of websites linked with this resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.WebsiteList website_list = 3;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.WebsiteListOrBuilder getWebsiteListOrBuilder();

  /**
   * <pre>
   * List of evidence found in the text of a resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.TextList text_list = 4;</code>
   */
  boolean hasTextList();
  /**
   * <pre>
   * List of evidence found in the text of a resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.TextList text_list = 4;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.TextList getTextList();
  /**
   * <pre>
   * List of evidence found in the text of a resource.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.TextList text_list = 4;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.TextListOrBuilder getTextListOrBuilder();

  /**
   * <pre>
   * The language the resource was detected to be written in.
   * This is an IETF language tag such as "en-US".
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 5;</code>
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * The language the resource was detected to be written in.
   * This is an IETF language tag such as "en-US".
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 5;</code>
   */
  com.google.protobuf.StringValue getLanguageCode();
  /**
   * <pre>
   * The language the resource was detected to be written in.
   * This is an IETF language tag such as "en-US".
   * </pre>
   *
   * <code>.google.protobuf.StringValue language_code = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getLanguageCodeOrBuilder();

  /**
   * <pre>
   * The text in the destination of the resource that is causing a policy
   * finding.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationTextList destination_text_list = 6;</code>
   */
  boolean hasDestinationTextList();
  /**
   * <pre>
   * The text in the destination of the resource that is causing a policy
   * finding.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationTextList destination_text_list = 6;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationTextList getDestinationTextList();
  /**
   * <pre>
   * The text in the destination of the resource that is causing a policy
   * finding.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationTextList destination_text_list = 6;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationTextListOrBuilder getDestinationTextListOrBuilder();

  /**
   * <pre>
   * Mismatch between the destinations of a resource's URLs.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationMismatch destination_mismatch = 7;</code>
   */
  boolean hasDestinationMismatch();
  /**
   * <pre>
   * Mismatch between the destinations of a resource's URLs.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationMismatch destination_mismatch = 7;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationMismatch getDestinationMismatch();
  /**
   * <pre>
   * Mismatch between the destinations of a resource's URLs.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationMismatch destination_mismatch = 7;</code>
   */
  com.google.ads.googleads.v0.common.PolicyTopicEvidence.DestinationMismatchOrBuilder getDestinationMismatchOrBuilder();

  public com.google.ads.googleads.v0.common.PolicyTopicEvidence.ValueCase getValueCase();
}
