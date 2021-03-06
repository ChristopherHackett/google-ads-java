package com.google.ads.googleads.v0.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Service to manage campaign criteria.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: google/ads/googleads/v0/services/campaign_criterion_service.proto")
public final class CampaignCriterionServiceGrpc {

  private CampaignCriterionServiceGrpc() {}

  public static final String SERVICE_NAME = "google.ads.googleads.v0.services.CampaignCriterionService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetCampaignCriterionMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignCriterionRequest,
      com.google.ads.googleads.v0.resources.CampaignCriterion> METHOD_GET_CAMPAIGN_CRITERION = getGetCampaignCriterionMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignCriterionRequest,
      com.google.ads.googleads.v0.resources.CampaignCriterion> getGetCampaignCriterionMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignCriterionRequest,
      com.google.ads.googleads.v0.resources.CampaignCriterion> getGetCampaignCriterionMethod() {
    return getGetCampaignCriterionMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignCriterionRequest,
      com.google.ads.googleads.v0.resources.CampaignCriterion> getGetCampaignCriterionMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.GetCampaignCriterionRequest, com.google.ads.googleads.v0.resources.CampaignCriterion> getGetCampaignCriterionMethod;
    if ((getGetCampaignCriterionMethod = CampaignCriterionServiceGrpc.getGetCampaignCriterionMethod) == null) {
      synchronized (CampaignCriterionServiceGrpc.class) {
        if ((getGetCampaignCriterionMethod = CampaignCriterionServiceGrpc.getGetCampaignCriterionMethod) == null) {
          CampaignCriterionServiceGrpc.getGetCampaignCriterionMethod = getGetCampaignCriterionMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.GetCampaignCriterionRequest, com.google.ads.googleads.v0.resources.CampaignCriterion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CampaignCriterionService", "GetCampaignCriterion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.GetCampaignCriterionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.resources.CampaignCriterion.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignCriterionServiceMethodDescriptorSupplier("GetCampaignCriterion"))
                  .build();
          }
        }
     }
     return getGetCampaignCriterionMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getMutateCampaignCriteriaMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest,
      com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> METHOD_MUTATE_CAMPAIGN_CRITERIA = getMutateCampaignCriteriaMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest,
      com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> getMutateCampaignCriteriaMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest,
      com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> getMutateCampaignCriteriaMethod() {
    return getMutateCampaignCriteriaMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest,
      com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> getMutateCampaignCriteriaMethodHelper() {
    io.grpc.MethodDescriptor<com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest, com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> getMutateCampaignCriteriaMethod;
    if ((getMutateCampaignCriteriaMethod = CampaignCriterionServiceGrpc.getMutateCampaignCriteriaMethod) == null) {
      synchronized (CampaignCriterionServiceGrpc.class) {
        if ((getMutateCampaignCriteriaMethod = CampaignCriterionServiceGrpc.getMutateCampaignCriteriaMethod) == null) {
          CampaignCriterionServiceGrpc.getMutateCampaignCriteriaMethod = getMutateCampaignCriteriaMethod = 
              io.grpc.MethodDescriptor.<com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest, com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "google.ads.googleads.v0.services.CampaignCriterionService", "MutateCampaignCriteria"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CampaignCriterionServiceMethodDescriptorSupplier("MutateCampaignCriteria"))
                  .build();
          }
        }
     }
     return getMutateCampaignCriteriaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CampaignCriterionServiceStub newStub(io.grpc.Channel channel) {
    return new CampaignCriterionServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CampaignCriterionServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CampaignCriterionServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CampaignCriterionServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CampaignCriterionServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static abstract class CampaignCriterionServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public void getCampaignCriterion(com.google.ads.googleads.v0.services.GetCampaignCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignCriterion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignCriterionMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignCriteria(com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMutateCampaignCriteriaMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCampaignCriterionMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.GetCampaignCriterionRequest,
                com.google.ads.googleads.v0.resources.CampaignCriterion>(
                  this, METHODID_GET_CAMPAIGN_CRITERION)))
          .addMethod(
            getMutateCampaignCriteriaMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest,
                com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse>(
                  this, METHODID_MUTATE_CAMPAIGN_CRITERIA)))
          .build();
    }
  }

  /**
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static final class CampaignCriterionServiceStub extends io.grpc.stub.AbstractStub<CampaignCriterionServiceStub> {
    private CampaignCriterionServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignCriterionServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignCriterionServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public void getCampaignCriterion(com.google.ads.googleads.v0.services.GetCampaignCriterionRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignCriterion> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignCriterionMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public void mutateCampaignCriteria(com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest request,
        io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMutateCampaignCriteriaMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static final class CampaignCriterionServiceBlockingStub extends io.grpc.stub.AbstractStub<CampaignCriterionServiceBlockingStub> {
    private CampaignCriterionServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignCriterionServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignCriterionServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public com.google.ads.googleads.v0.resources.CampaignCriterion getCampaignCriterion(com.google.ads.googleads.v0.services.GetCampaignCriterionRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignCriterionMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse mutateCampaignCriteria(com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest request) {
      return blockingUnaryCall(
          getChannel(), getMutateCampaignCriteriaMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service to manage campaign criteria.
   * </pre>
   */
  public static final class CampaignCriterionServiceFutureStub extends io.grpc.stub.AbstractStub<CampaignCriterionServiceFutureStub> {
    private CampaignCriterionServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CampaignCriterionServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CampaignCriterionServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CampaignCriterionServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns the requested criterion in full detail.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.resources.CampaignCriterion> getCampaignCriterion(
        com.google.ads.googleads.v0.services.GetCampaignCriterionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignCriterionMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates, updates, or removes criteria. Operation statuses are returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse> mutateCampaignCriteria(
        com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMutateCampaignCriteriaMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CAMPAIGN_CRITERION = 0;
  private static final int METHODID_MUTATE_CAMPAIGN_CRITERIA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CampaignCriterionServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CampaignCriterionServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CAMPAIGN_CRITERION:
          serviceImpl.getCampaignCriterion((com.google.ads.googleads.v0.services.GetCampaignCriterionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.resources.CampaignCriterion>) responseObserver);
          break;
        case METHODID_MUTATE_CAMPAIGN_CRITERIA:
          serviceImpl.mutateCampaignCriteria((com.google.ads.googleads.v0.services.MutateCampaignCriteriaRequest) request,
              (io.grpc.stub.StreamObserver<com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CampaignCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CampaignCriterionServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.ads.googleads.v0.services.CampaignCriterionServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CampaignCriterionService");
    }
  }

  private static final class CampaignCriterionServiceFileDescriptorSupplier
      extends CampaignCriterionServiceBaseDescriptorSupplier {
    CampaignCriterionServiceFileDescriptorSupplier() {}
  }

  private static final class CampaignCriterionServiceMethodDescriptorSupplier
      extends CampaignCriterionServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CampaignCriterionServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CampaignCriterionServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CampaignCriterionServiceFileDescriptorSupplier())
              .addMethod(getGetCampaignCriterionMethodHelper())
              .addMethod(getMutateCampaignCriteriaMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
