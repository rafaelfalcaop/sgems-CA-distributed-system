package org.sgems.reporting;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: DiscriminationReportingService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DiscriminationReportingServiceGrpc {

  private DiscriminationReportingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "DiscriminationReportingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sgems.reporting.IncidentRequest,
      org.sgems.reporting.IncidentResponse> getSubmitIncidentReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitIncidentReport",
      requestType = org.sgems.reporting.IncidentRequest.class,
      responseType = org.sgems.reporting.IncidentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sgems.reporting.IncidentRequest,
      org.sgems.reporting.IncidentResponse> getSubmitIncidentReportMethod() {
    io.grpc.MethodDescriptor<org.sgems.reporting.IncidentRequest, org.sgems.reporting.IncidentResponse> getSubmitIncidentReportMethod;
    if ((getSubmitIncidentReportMethod = DiscriminationReportingServiceGrpc.getSubmitIncidentReportMethod) == null) {
      synchronized (DiscriminationReportingServiceGrpc.class) {
        if ((getSubmitIncidentReportMethod = DiscriminationReportingServiceGrpc.getSubmitIncidentReportMethod) == null) {
          DiscriminationReportingServiceGrpc.getSubmitIncidentReportMethod = getSubmitIncidentReportMethod =
              io.grpc.MethodDescriptor.<org.sgems.reporting.IncidentRequest, org.sgems.reporting.IncidentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitIncidentReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.reporting.IncidentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.reporting.IncidentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DiscriminationReportingServiceMethodDescriptorSupplier("SubmitIncidentReport"))
              .build();
        }
      }
    }
    return getSubmitIncidentReportMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sgems.reporting.IncidentUpdateRequest,
      org.sgems.reporting.IncidentUpdate> getGetIncidentUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetIncidentUpdates",
      requestType = org.sgems.reporting.IncidentUpdateRequest.class,
      responseType = org.sgems.reporting.IncidentUpdate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.sgems.reporting.IncidentUpdateRequest,
      org.sgems.reporting.IncidentUpdate> getGetIncidentUpdatesMethod() {
    io.grpc.MethodDescriptor<org.sgems.reporting.IncidentUpdateRequest, org.sgems.reporting.IncidentUpdate> getGetIncidentUpdatesMethod;
    if ((getGetIncidentUpdatesMethod = DiscriminationReportingServiceGrpc.getGetIncidentUpdatesMethod) == null) {
      synchronized (DiscriminationReportingServiceGrpc.class) {
        if ((getGetIncidentUpdatesMethod = DiscriminationReportingServiceGrpc.getGetIncidentUpdatesMethod) == null) {
          DiscriminationReportingServiceGrpc.getGetIncidentUpdatesMethod = getGetIncidentUpdatesMethod =
              io.grpc.MethodDescriptor.<org.sgems.reporting.IncidentUpdateRequest, org.sgems.reporting.IncidentUpdate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetIncidentUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.reporting.IncidentUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.reporting.IncidentUpdate.getDefaultInstance()))
              .setSchemaDescriptor(new DiscriminationReportingServiceMethodDescriptorSupplier("GetIncidentUpdates"))
              .build();
        }
      }
    }
    return getGetIncidentUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sgems.reporting.LiveMessage,
      org.sgems.reporting.LiveMessage> getLiveCaseCommunicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LiveCaseCommunication",
      requestType = org.sgems.reporting.LiveMessage.class,
      responseType = org.sgems.reporting.LiveMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.sgems.reporting.LiveMessage,
      org.sgems.reporting.LiveMessage> getLiveCaseCommunicationMethod() {
    io.grpc.MethodDescriptor<org.sgems.reporting.LiveMessage, org.sgems.reporting.LiveMessage> getLiveCaseCommunicationMethod;
    if ((getLiveCaseCommunicationMethod = DiscriminationReportingServiceGrpc.getLiveCaseCommunicationMethod) == null) {
      synchronized (DiscriminationReportingServiceGrpc.class) {
        if ((getLiveCaseCommunicationMethod = DiscriminationReportingServiceGrpc.getLiveCaseCommunicationMethod) == null) {
          DiscriminationReportingServiceGrpc.getLiveCaseCommunicationMethod = getLiveCaseCommunicationMethod =
              io.grpc.MethodDescriptor.<org.sgems.reporting.LiveMessage, org.sgems.reporting.LiveMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LiveCaseCommunication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.reporting.LiveMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.reporting.LiveMessage.getDefaultInstance()))
              .setSchemaDescriptor(new DiscriminationReportingServiceMethodDescriptorSupplier("LiveCaseCommunication"))
              .build();
        }
      }
    }
    return getLiveCaseCommunicationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DiscriminationReportingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscriminationReportingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscriminationReportingServiceStub>() {
        @java.lang.Override
        public DiscriminationReportingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscriminationReportingServiceStub(channel, callOptions);
        }
      };
    return DiscriminationReportingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DiscriminationReportingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscriminationReportingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscriminationReportingServiceBlockingStub>() {
        @java.lang.Override
        public DiscriminationReportingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscriminationReportingServiceBlockingStub(channel, callOptions);
        }
      };
    return DiscriminationReportingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DiscriminationReportingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DiscriminationReportingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DiscriminationReportingServiceFutureStub>() {
        @java.lang.Override
        public DiscriminationReportingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DiscriminationReportingServiceFutureStub(channel, callOptions);
        }
      };
    return DiscriminationReportingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void submitIncidentReport(org.sgems.reporting.IncidentRequest request,
        io.grpc.stub.StreamObserver<org.sgems.reporting.IncidentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitIncidentReportMethod(), responseObserver);
    }

    /**
     */
    default void getIncidentUpdates(org.sgems.reporting.IncidentUpdateRequest request,
        io.grpc.stub.StreamObserver<org.sgems.reporting.IncidentUpdate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIncidentUpdatesMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.sgems.reporting.LiveMessage> liveCaseCommunication(
        io.grpc.stub.StreamObserver<org.sgems.reporting.LiveMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getLiveCaseCommunicationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DiscriminationReportingService.
   */
  public static abstract class DiscriminationReportingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DiscriminationReportingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DiscriminationReportingService.
   */
  public static final class DiscriminationReportingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DiscriminationReportingServiceStub> {
    private DiscriminationReportingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscriminationReportingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscriminationReportingServiceStub(channel, callOptions);
    }

    /**
     */
    public void submitIncidentReport(org.sgems.reporting.IncidentRequest request,
        io.grpc.stub.StreamObserver<org.sgems.reporting.IncidentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitIncidentReportMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIncidentUpdates(org.sgems.reporting.IncidentUpdateRequest request,
        io.grpc.stub.StreamObserver<org.sgems.reporting.IncidentUpdate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetIncidentUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.sgems.reporting.LiveMessage> liveCaseCommunication(
        io.grpc.stub.StreamObserver<org.sgems.reporting.LiveMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getLiveCaseCommunicationMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DiscriminationReportingService.
   */
  public static final class DiscriminationReportingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DiscriminationReportingServiceBlockingStub> {
    private DiscriminationReportingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscriminationReportingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscriminationReportingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sgems.reporting.IncidentResponse submitIncidentReport(org.sgems.reporting.IncidentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitIncidentReportMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.sgems.reporting.IncidentUpdate> getIncidentUpdates(
        org.sgems.reporting.IncidentUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetIncidentUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DiscriminationReportingService.
   */
  public static final class DiscriminationReportingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DiscriminationReportingServiceFutureStub> {
    private DiscriminationReportingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DiscriminationReportingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DiscriminationReportingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sgems.reporting.IncidentResponse> submitIncidentReport(
        org.sgems.reporting.IncidentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitIncidentReportMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_INCIDENT_REPORT = 0;
  private static final int METHODID_GET_INCIDENT_UPDATES = 1;
  private static final int METHODID_LIVE_CASE_COMMUNICATION = 2;

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
        case METHODID_SUBMIT_INCIDENT_REPORT:
          serviceImpl.submitIncidentReport((org.sgems.reporting.IncidentRequest) request,
              (io.grpc.stub.StreamObserver<org.sgems.reporting.IncidentResponse>) responseObserver);
          break;
        case METHODID_GET_INCIDENT_UPDATES:
          serviceImpl.getIncidentUpdates((org.sgems.reporting.IncidentUpdateRequest) request,
              (io.grpc.stub.StreamObserver<org.sgems.reporting.IncidentUpdate>) responseObserver);
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
        case METHODID_LIVE_CASE_COMMUNICATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.liveCaseCommunication(
              (io.grpc.stub.StreamObserver<org.sgems.reporting.LiveMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSubmitIncidentReportMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.sgems.reporting.IncidentRequest,
              org.sgems.reporting.IncidentResponse>(
                service, METHODID_SUBMIT_INCIDENT_REPORT)))
        .addMethod(
          getGetIncidentUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.sgems.reporting.IncidentUpdateRequest,
              org.sgems.reporting.IncidentUpdate>(
                service, METHODID_GET_INCIDENT_UPDATES)))
        .addMethod(
          getLiveCaseCommunicationMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.sgems.reporting.LiveMessage,
              org.sgems.reporting.LiveMessage>(
                service, METHODID_LIVE_CASE_COMMUNICATION)))
        .build();
  }

  private static abstract class DiscriminationReportingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DiscriminationReportingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sgems.reporting.DiscriminationReportingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DiscriminationReportingService");
    }
  }

  private static final class DiscriminationReportingServiceFileDescriptorSupplier
      extends DiscriminationReportingServiceBaseDescriptorSupplier {
    DiscriminationReportingServiceFileDescriptorSupplier() {}
  }

  private static final class DiscriminationReportingServiceMethodDescriptorSupplier
      extends DiscriminationReportingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DiscriminationReportingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DiscriminationReportingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DiscriminationReportingServiceFileDescriptorSupplier())
              .addMethod(getSubmitIncidentReportMethod())
              .addMethod(getGetIncidentUpdatesMethod())
              .addMethod(getLiveCaseCommunicationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
