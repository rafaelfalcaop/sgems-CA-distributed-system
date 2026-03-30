package org.sgems.leadership;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: LeadershipRepresentationService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LeadershipRepresentationServiceGrpc {

  private LeadershipRepresentationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "LeadershipRepresentationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sgems.leadership.RepresentationRequest,
      org.sgems.leadership.RepresentationResponse> getGetRepresentationStatsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRepresentationStats",
      requestType = org.sgems.leadership.RepresentationRequest.class,
      responseType = org.sgems.leadership.RepresentationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sgems.leadership.RepresentationRequest,
      org.sgems.leadership.RepresentationResponse> getGetRepresentationStatsMethod() {
    io.grpc.MethodDescriptor<org.sgems.leadership.RepresentationRequest, org.sgems.leadership.RepresentationResponse> getGetRepresentationStatsMethod;
    if ((getGetRepresentationStatsMethod = LeadershipRepresentationServiceGrpc.getGetRepresentationStatsMethod) == null) {
      synchronized (LeadershipRepresentationServiceGrpc.class) {
        if ((getGetRepresentationStatsMethod = LeadershipRepresentationServiceGrpc.getGetRepresentationStatsMethod) == null) {
          LeadershipRepresentationServiceGrpc.getGetRepresentationStatsMethod = getGetRepresentationStatsMethod =
              io.grpc.MethodDescriptor.<org.sgems.leadership.RepresentationRequest, org.sgems.leadership.RepresentationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRepresentationStats"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.leadership.RepresentationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.leadership.RepresentationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeadershipRepresentationServiceMethodDescriptorSupplier("GetRepresentationStats"))
              .build();
        }
      }
    }
    return getGetRepresentationStatsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sgems.leadership.LeaderData,
      org.sgems.leadership.UploadResponse> getUploadLeadershipDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadLeadershipData",
      requestType = org.sgems.leadership.LeaderData.class,
      responseType = org.sgems.leadership.UploadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.sgems.leadership.LeaderData,
      org.sgems.leadership.UploadResponse> getUploadLeadershipDataMethod() {
    io.grpc.MethodDescriptor<org.sgems.leadership.LeaderData, org.sgems.leadership.UploadResponse> getUploadLeadershipDataMethod;
    if ((getUploadLeadershipDataMethod = LeadershipRepresentationServiceGrpc.getUploadLeadershipDataMethod) == null) {
      synchronized (LeadershipRepresentationServiceGrpc.class) {
        if ((getUploadLeadershipDataMethod = LeadershipRepresentationServiceGrpc.getUploadLeadershipDataMethod) == null) {
          LeadershipRepresentationServiceGrpc.getUploadLeadershipDataMethod = getUploadLeadershipDataMethod =
              io.grpc.MethodDescriptor.<org.sgems.leadership.LeaderData, org.sgems.leadership.UploadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadLeadershipData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.leadership.LeaderData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.leadership.UploadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LeadershipRepresentationServiceMethodDescriptorSupplier("UploadLeadershipData"))
              .build();
        }
      }
    }
    return getUploadLeadershipDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sgems.leadership.RepresentationRequest,
      org.sgems.leadership.RepresentationChange> getStreamRepresentationChangesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamRepresentationChanges",
      requestType = org.sgems.leadership.RepresentationRequest.class,
      responseType = org.sgems.leadership.RepresentationChange.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.sgems.leadership.RepresentationRequest,
      org.sgems.leadership.RepresentationChange> getStreamRepresentationChangesMethod() {
    io.grpc.MethodDescriptor<org.sgems.leadership.RepresentationRequest, org.sgems.leadership.RepresentationChange> getStreamRepresentationChangesMethod;
    if ((getStreamRepresentationChangesMethod = LeadershipRepresentationServiceGrpc.getStreamRepresentationChangesMethod) == null) {
      synchronized (LeadershipRepresentationServiceGrpc.class) {
        if ((getStreamRepresentationChangesMethod = LeadershipRepresentationServiceGrpc.getStreamRepresentationChangesMethod) == null) {
          LeadershipRepresentationServiceGrpc.getStreamRepresentationChangesMethod = getStreamRepresentationChangesMethod =
              io.grpc.MethodDescriptor.<org.sgems.leadership.RepresentationRequest, org.sgems.leadership.RepresentationChange>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamRepresentationChanges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.leadership.RepresentationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.leadership.RepresentationChange.getDefaultInstance()))
              .setSchemaDescriptor(new LeadershipRepresentationServiceMethodDescriptorSupplier("StreamRepresentationChanges"))
              .build();
        }
      }
    }
    return getStreamRepresentationChangesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LeadershipRepresentationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeadershipRepresentationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeadershipRepresentationServiceStub>() {
        @java.lang.Override
        public LeadershipRepresentationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeadershipRepresentationServiceStub(channel, callOptions);
        }
      };
    return LeadershipRepresentationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LeadershipRepresentationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeadershipRepresentationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeadershipRepresentationServiceBlockingStub>() {
        @java.lang.Override
        public LeadershipRepresentationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeadershipRepresentationServiceBlockingStub(channel, callOptions);
        }
      };
    return LeadershipRepresentationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LeadershipRepresentationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LeadershipRepresentationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LeadershipRepresentationServiceFutureStub>() {
        @java.lang.Override
        public LeadershipRepresentationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LeadershipRepresentationServiceFutureStub(channel, callOptions);
        }
      };
    return LeadershipRepresentationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getRepresentationStats(org.sgems.leadership.RepresentationRequest request,
        io.grpc.stub.StreamObserver<org.sgems.leadership.RepresentationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRepresentationStatsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.sgems.leadership.LeaderData> uploadLeadershipData(
        io.grpc.stub.StreamObserver<org.sgems.leadership.UploadResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadLeadershipDataMethod(), responseObserver);
    }

    /**
     */
    default void streamRepresentationChanges(org.sgems.leadership.RepresentationRequest request,
        io.grpc.stub.StreamObserver<org.sgems.leadership.RepresentationChange> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamRepresentationChangesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LeadershipRepresentationService.
   */
  public static abstract class LeadershipRepresentationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LeadershipRepresentationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LeadershipRepresentationService.
   */
  public static final class LeadershipRepresentationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LeadershipRepresentationServiceStub> {
    private LeadershipRepresentationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeadershipRepresentationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeadershipRepresentationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRepresentationStats(org.sgems.leadership.RepresentationRequest request,
        io.grpc.stub.StreamObserver<org.sgems.leadership.RepresentationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRepresentationStatsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.sgems.leadership.LeaderData> uploadLeadershipData(
        io.grpc.stub.StreamObserver<org.sgems.leadership.UploadResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadLeadershipDataMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void streamRepresentationChanges(org.sgems.leadership.RepresentationRequest request,
        io.grpc.stub.StreamObserver<org.sgems.leadership.RepresentationChange> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamRepresentationChangesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LeadershipRepresentationService.
   */
  public static final class LeadershipRepresentationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LeadershipRepresentationServiceBlockingStub> {
    private LeadershipRepresentationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeadershipRepresentationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeadershipRepresentationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sgems.leadership.RepresentationResponse getRepresentationStats(org.sgems.leadership.RepresentationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRepresentationStatsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.sgems.leadership.RepresentationChange> streamRepresentationChanges(
        org.sgems.leadership.RepresentationRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamRepresentationChangesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LeadershipRepresentationService.
   */
  public static final class LeadershipRepresentationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LeadershipRepresentationServiceFutureStub> {
    private LeadershipRepresentationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LeadershipRepresentationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LeadershipRepresentationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sgems.leadership.RepresentationResponse> getRepresentationStats(
        org.sgems.leadership.RepresentationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRepresentationStatsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REPRESENTATION_STATS = 0;
  private static final int METHODID_STREAM_REPRESENTATION_CHANGES = 1;
  private static final int METHODID_UPLOAD_LEADERSHIP_DATA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REPRESENTATION_STATS:
          serviceImpl.getRepresentationStats((org.sgems.leadership.RepresentationRequest) request,
              (io.grpc.stub.StreamObserver<org.sgems.leadership.RepresentationResponse>) responseObserver);
          break;
        case METHODID_STREAM_REPRESENTATION_CHANGES:
          serviceImpl.streamRepresentationChanges((org.sgems.leadership.RepresentationRequest) request,
              (io.grpc.stub.StreamObserver<org.sgems.leadership.RepresentationChange>) responseObserver);
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
        case METHODID_UPLOAD_LEADERSHIP_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadLeadershipData(
              (io.grpc.stub.StreamObserver<org.sgems.leadership.UploadResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetRepresentationStatsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.sgems.leadership.RepresentationRequest,
              org.sgems.leadership.RepresentationResponse>(
                service, METHODID_GET_REPRESENTATION_STATS)))
        .addMethod(
          getUploadLeadershipDataMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.sgems.leadership.LeaderData,
              org.sgems.leadership.UploadResponse>(
                service, METHODID_UPLOAD_LEADERSHIP_DATA)))
        .addMethod(
          getStreamRepresentationChangesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.sgems.leadership.RepresentationRequest,
              org.sgems.leadership.RepresentationChange>(
                service, METHODID_STREAM_REPRESENTATION_CHANGES)))
        .build();
  }

  private static abstract class LeadershipRepresentationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LeadershipRepresentationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sgems.leadership.LeadershipRepresentationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LeadershipRepresentationService");
    }
  }

  private static final class LeadershipRepresentationServiceFileDescriptorSupplier
      extends LeadershipRepresentationServiceBaseDescriptorSupplier {
    LeadershipRepresentationServiceFileDescriptorSupplier() {}
  }

  private static final class LeadershipRepresentationServiceMethodDescriptorSupplier
      extends LeadershipRepresentationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LeadershipRepresentationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LeadershipRepresentationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LeadershipRepresentationServiceFileDescriptorSupplier())
              .addMethod(getGetRepresentationStatsMethod())
              .addMethod(getUploadLeadershipDataMethod())
              .addMethod(getStreamRepresentationChangesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
