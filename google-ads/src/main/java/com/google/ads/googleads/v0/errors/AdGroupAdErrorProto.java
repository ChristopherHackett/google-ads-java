// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/ad_group_ad_error.proto

package com.google.ads.googleads.v0.errors;

public final class AdGroupAdErrorProto {
  private AdGroupAdErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_AdGroupAdErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_AdGroupAdErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v0/errors/ad_grou" +
      "p_ad_error.proto\022\036google.ads.googleads.v" +
      "0.errors\"\314\002\n\022AdGroupAdErrorEnum\"\265\002\n\016AdGr" +
      "oupAdError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001" +
      "\022$\n AD_GROUP_AD_LABEL_DOES_NOT_EXIST\020\002\022$" +
      "\n AD_GROUP_AD_LABEL_ALREADY_EXISTS\020\003\022\030\n\024" +
      "AD_NOT_UNDER_ADGROUP\020\004\022\'\n#CANNOT_OPERATE" +
      "_ON_REMOVED_ADGROUPAD\020\005\022 \n\034CANNOT_CREATE" +
      "_DEPRECATED_ADS\020\006\022\032\n\026CANNOT_CREATE_TEXT_" +
      "ADS\020\007\022\017\n\013EMPTY_FIELD\020\010\022\'\n#RESOURCE_REFER" +
      "ENCED_IN_MULTIPLE_OPS\020\tB\356\001\n\"com.google.a" +
      "ds.googleads.v0.errorsB\023AdGroupAdErrorPr" +
      "otoP\001ZDgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v0/errors;errors\242\002\003GA" +
      "A\252\002\036Google.Ads.GoogleAds.V0.Errors\312\002\036Goo" +
      "gle\\Ads\\GoogleAds\\V0\\Errors\352\002\"Google::Ad" +
      "s::GoogleAds::V0::Errorsb\006proto3"
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
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_AdGroupAdErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_AdGroupAdErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_AdGroupAdErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
