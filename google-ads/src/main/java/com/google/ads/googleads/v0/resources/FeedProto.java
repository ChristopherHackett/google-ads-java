// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/feed.proto

package com.google.ads.googleads.v0.resources;

public final class FeedProto {
  private FeedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_Feed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_Feed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_Feed_AffiliateLocationFeedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedAttribute_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_FeedAttributeOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_FeedAttributeOperation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/ads/googleads/v0/resources/feed" +
      ".proto\022!google.ads.googleads.v0.resource" +
      "s\032Mgoogle/ads/googleads/v0/enums/affilia" +
      "te_location_feed_relationship_type.proto" +
      "\0327google/ads/googleads/v0/enums/feed_att" +
      "ribute_type.proto\032/google/ads/googleads/" +
      "v0/enums/feed_origin.proto\032/google/ads/g" +
      "oogleads/v0/enums/feed_status.proto\032\036goo" +
      "gle/protobuf/wrappers.proto\"\272\013\n\004Feed\022\025\n\r" +
      "resource_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.google" +
      ".protobuf.Int64Value\022*\n\004name\030\003 \001(\0132\034.goo" +
      "gle.protobuf.StringValue\022D\n\nattributes\030\004" +
      " \003(\01320.google.ads.googleads.v0.resources" +
      ".FeedAttribute\022W\n\024attribute_operations\030\t" +
      " \003(\01329.google.ads.googleads.v0.resources" +
      ".FeedAttributeOperation\022H\n\006origin\030\005 \001(\0162" +
      "8.google.ads.googleads.v0.enums.FeedOrig" +
      "inEnum.FeedOrigin\022H\n\006status\030\010 \001(\01628.goog" +
      "le.ads.googleads.v0.enums.FeedStatusEnum" +
      ".FeedStatus\022c\n\031places_location_feed_data" +
      "\030\006 \001(\0132>.google.ads.googleads.v0.resourc" +
      "es.Feed.PlacesLocationFeedDataH\000\022i\n\034affi" +
      "liate_location_feed_data\030\007 \001(\0132A.google." +
      "ads.googleads.v0.resources.Feed.Affiliat" +
      "eLocationFeedDataH\000\032\311\004\n\026PlacesLocationFe" +
      "edData\022\\\n\noauth_info\030\001 \001(\0132H.google.ads." +
      "googleads.v0.resources.Feed.PlacesLocati" +
      "onFeedData.OAuthInfo\0223\n\remail_address\030\002 " +
      "\001(\0132\034.google.protobuf.StringValue\0229\n\023bus" +
      "iness_account_id\030\n \001(\0132\034.google.protobuf" +
      ".StringValue\022:\n\024business_name_filter\030\004 \001" +
      "(\0132\034.google.protobuf.StringValue\0226\n\020cate" +
      "gory_filters\030\005 \003(\0132\034.google.protobuf.Str" +
      "ingValue\0223\n\rlabel_filters\030\006 \003(\0132\034.google" +
      ".protobuf.StringValue\032\267\001\n\tOAuthInfo\0221\n\013h" +
      "ttp_method\030\001 \001(\0132\034.google.protobuf.Strin" +
      "gValue\0226\n\020http_request_url\030\002 \001(\0132\034.googl" +
      "e.protobuf.StringValue\022?\n\031http_authoriza" +
      "tion_header\030\003 \001(\0132\034.google.protobuf.Stri" +
      "ngValue\032\327\001\n\031AffiliateLocationFeedData\022.\n" +
      "\tchain_ids\030\001 \003(\0132\033.google.protobuf.Int64" +
      "Value\022\211\001\n\021relationship_type\030\002 \001(\0162n.goog" +
      "le.ads.googleads.v0.enums.AffiliateLocat" +
      "ionFeedRelationshipTypeEnum.AffiliateLoc" +
      "ationFeedRelationshipTypeB\035\n\033system_feed" +
      "_generation_data\"\356\001\n\rFeedAttribute\022\'\n\002id" +
      "\030\001 \001(\0132\033.google.protobuf.Int64Value\022*\n\004n" +
      "ame\030\002 \001(\0132\034.google.protobuf.StringValue\022" +
      "T\n\004type\030\003 \001(\0162F.google.ads.googleads.v0." +
      "enums.FeedAttributeTypeEnum.FeedAttribut" +
      "eType\0222\n\016is_part_of_key\030\004 \001(\0132\032.google.p" +
      "rotobuf.BoolValue\"\342\001\n\026FeedAttributeOpera" +
      "tion\022T\n\010operator\030\001 \001(\0162B.google.ads.goog" +
      "leads.v0.resources.FeedAttributeOperatio" +
      "n.Operator\022?\n\005value\030\002 \001(\01320.google.ads.g" +
      "oogleads.v0.resources.FeedAttribute\"1\n\010O" +
      "perator\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\007\n" +
      "\003ADD\020\002B\366\001\n%com.google.ads.googleads.v0.r" +
      "esourcesB\tFeedProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v0/re" +
      "sources;resources\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V0.Resources\312\002!Google\\Ads\\GoogleA" +
      "ds\\V0\\Resources\352\002%Google::Ads::GoogleAds" +
      "::V0::Resourcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v0.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedAttributeTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedOriginProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.FeedStatusProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_Feed_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_Feed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_Feed_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Attributes", "AttributeOperations", "Origin", "Status", "PlacesLocationFeedData", "AffiliateLocationFeedData", "SystemFeedGenerationData", });
    internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v0_resources_Feed_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_descriptor,
        new java.lang.String[] { "OauthInfo", "EmailAddress", "BusinessAccountId", "BusinessNameFilter", "CategoryFilters", "LabelFilters", });
    internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor =
      internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_OAuthInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_Feed_PlacesLocationFeedData_OAuthInfo_descriptor,
        new java.lang.String[] { "HttpMethod", "HttpRequestUrl", "HttpAuthorizationHeader", });
    internal_static_google_ads_googleads_v0_resources_Feed_AffiliateLocationFeedData_descriptor =
      internal_static_google_ads_googleads_v0_resources_Feed_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v0_resources_Feed_AffiliateLocationFeedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_Feed_AffiliateLocationFeedData_descriptor,
        new java.lang.String[] { "ChainIds", "RelationshipType", });
    internal_static_google_ads_googleads_v0_resources_FeedAttribute_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_resources_FeedAttribute_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedAttribute_descriptor,
        new java.lang.String[] { "Id", "Name", "Type", "IsPartOfKey", });
    internal_static_google_ads_googleads_v0_resources_FeedAttributeOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_resources_FeedAttributeOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_FeedAttributeOperation_descriptor,
        new java.lang.String[] { "Operator", "Value", });
    com.google.ads.googleads.v0.enums.AffiliateLocationFeedRelationshipTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedAttributeTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedOriginProto.getDescriptor();
    com.google.ads.googleads.v0.enums.FeedStatusProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
