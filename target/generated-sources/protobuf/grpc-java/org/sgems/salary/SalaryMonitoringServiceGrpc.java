package org.sgems.salary;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: SalaryMonitoringService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SalaryMonitoringServiceGrpc {

  private SalaryMonitoringServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SalaryMonitoringService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.sgems.salary.PayGapRequest,
      org.sgems.salary.PayGapResponse> getCalculatePayGapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculatePayGap",
      requestType = org.sgems.salary.PayGapRequest.class,
      responseType = org.sgems.salary.PayGapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.sgems.salary.PayGapRequest,
      org.sgems.salary.PayGapResponse> getCalculatePayGapMethod() {
    io.grpc.MethodDescriptor<org.sgems.salary.PayGapRequest, org.sgems.salary.PayGapResponse> getCalculatePayGapMethod;
    if ((getCalculatePayGapMethod = SalaryMonitoringServiceGrpc.getCalculatePayGapMethod) == null) {
      synchronized (SalaryMonitoringServiceGrpc.class) {
        if ((getCalculatePayGapMethod = SalaryMonitoringServiceGrpc.getCalculatePayGapMethod) == null) {
          SalaryMonitoringServiceGrpc.getCalculatePayGapMethod = getCalculatePayGapMethod =
              io.grpc.MethodDescriptor.<org.sgems.salary.PayGapRequest, org.sgems.salary.PayGapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculatePayGap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.salary.PayGapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.salary.PayGapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalaryMonitoringServiceMethodDescriptorSupplier("CalculatePayGap"))
              .build();
        }
      }
    }
    return getCalculatePayGapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sgems.salary.SalaryStatsRequest,
      org.sgems.salary.SalaryStatsResponse> getStreamSalaryStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamSalaryStatistics",
      requestType = org.sgems.salary.SalaryStatsRequest.class,
      responseType = org.sgems.salary.SalaryStatsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.sgems.salary.SalaryStatsRequest,
      org.sgems.salary.SalaryStatsResponse> getStreamSalaryStatisticsMethod() {
    io.grpc.MethodDescriptor<org.sgems.salary.SalaryStatsRequest, org.sgems.salary.SalaryStatsResponse> getStreamSalaryStatisticsMethod;
    if ((getStreamSalaryStatisticsMethod = SalaryMonitoringServiceGrpc.getStreamSalaryStatisticsMethod) == null) {
      synchronized (SalaryMonitoringServiceGrpc.class) {
        if ((getStreamSalaryStatisticsMethod = SalaryMonitoringServiceGrpc.getStreamSalaryStatisticsMethod) == null) {
          SalaryMonitoringServiceGrpc.getStreamSalaryStatisticsMethod = getStreamSalaryStatisticsMethod =
              io.grpc.MethodDescriptor.<org.sgems.salary.SalaryStatsRequest, org.sgems.salary.SalaryStatsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StreamSalaryStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.salary.SalaryStatsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.salary.SalaryStatsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalaryMonitoringServiceMethodDescriptorSupplier("StreamSalaryStatistics"))
              .build();
        }
      }
    }
    return getStreamSalaryStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.sgems.salary.SalaryRecord,
      org.sgems.salary.UploadStatus> getUploadSalaryRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadSalaryRecords",
      requestType = org.sgems.salary.SalaryRecord.class,
      responseType = org.sgems.salary.UploadStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.sgems.salary.SalaryRecord,
      org.sgems.salary.UploadStatus> getUploadSalaryRecordsMethod() {
    io.grpc.MethodDescriptor<org.sgems.salary.SalaryRecord, org.sgems.salary.UploadStatus> getUploadSalaryRecordsMethod;
    if ((getUploadSalaryRecordsMethod = SalaryMonitoringServiceGrpc.getUploadSalaryRecordsMethod) == null) {
      synchronized (SalaryMonitoringServiceGrpc.class) {
        if ((getUploadSalaryRecordsMethod = SalaryMonitoringServiceGrpc.getUploadSalaryRecordsMethod) == null) {
          SalaryMonitoringServiceGrpc.getUploadSalaryRecordsMethod = getUploadSalaryRecordsMethod =
              io.grpc.MethodDescriptor.<org.sgems.salary.SalaryRecord, org.sgems.salary.UploadStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadSalaryRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.salary.SalaryRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.sgems.salary.UploadStatus.getDefaultInstance()))
              .setSchemaDescriptor(new SalaryMonitoringServiceMethodDescriptorSupplier("UploadSalaryRecords"))
              .build();
        }
      }
    }
    return getUploadSalaryRecordsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalaryMonitoringServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalaryMonitoringServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalaryMonitoringServiceStub>() {
        @java.lang.Override
        public SalaryMonitoringServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalaryMonitoringServiceStub(channel, callOptions);
        }
      };
    return SalaryMonitoringServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalaryMonitoringServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalaryMonitoringServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalaryMonitoringServiceBlockingStub>() {
        @java.lang.Override
        public SalaryMonitoringServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalaryMonitoringServiceBlockingStub(channel, callOptions);
        }
      };
    return SalaryMonitoringServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalaryMonitoringServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SalaryMonitoringServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SalaryMonitoringServiceFutureStub>() {
        @java.lang.Override
        public SalaryMonitoringServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SalaryMonitoringServiceFutureStub(channel, callOptions);
        }
      };
    return SalaryMonitoringServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void calculatePayGap(org.sgems.salary.PayGapRequest request,
        io.grpc.stub.StreamObserver<org.sgems.salary.PayGapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculatePayGapMethod(), responseObserver);
    }

    /**
     */
    default void streamSalaryStatistics(org.sgems.salary.SalaryStatsRequest request,
        io.grpc.stub.StreamObserver<org.sgems.salary.SalaryStatsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStreamSalaryStatisticsMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.sgems.salary.SalaryRecord> uploadSalaryRecords(
        io.grpc.stub.StreamObserver<org.sgems.salary.UploadStatus> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadSalaryRecordsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SalaryMonitoringService.
   */
  public static abstract class SalaryMonitoringServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SalaryMonitoringServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SalaryMonitoringService.
   */
  public static final class SalaryMonitoringServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SalaryMonitoringServiceStub> {
    private SalaryMonitoringServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalaryMonitoringServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalaryMonitoringServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculatePayGap(org.sgems.salary.PayGapRequest request,
        io.grpc.stub.StreamObserver<org.sgems.salary.PayGapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculatePayGapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void streamSalaryStatistics(org.sgems.salary.SalaryStatsRequest request,
        io.grpc.stub.StreamObserver<org.sgems.salary.SalaryStatsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getStreamSalaryStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.sgems.salary.SalaryRecord> uploadSalaryRecords(
        io.grpc.stub.StreamObserver<org.sgems.salary.UploadStatus> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadSalaryRecordsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SalaryMonitoringService.
   */
  public static final class SalaryMonitoringServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SalaryMonitoringServiceBlockingStub> {
    private SalaryMonitoringServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalaryMonitoringServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalaryMonitoringServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.sgems.salary.PayGapResponse calculatePayGap(org.sgems.salary.PayGapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculatePayGapMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.sgems.salary.SalaryStatsResponse> streamSalaryStatistics(
        org.sgems.salary.SalaryStatsRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getStreamSalaryStatisticsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SalaryMonitoringService.
   */
  public static final class SalaryMonitoringServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SalaryMonitoringServiceFutureStub> {
    private SalaryMonitoringServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalaryMonitoringServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SalaryMonitoringServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.sgems.salary.PayGapResponse> calculatePayGap(
        org.sgems.salary.PayGapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculatePayGapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_PAY_GAP = 0;
  private static final int METHODID_STREAM_SALARY_STATISTICS = 1;
  private static final int METHODID_UPLOAD_SALARY_RECORDS = 2;

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
        case METHODID_CALCULATE_PAY_GAP:
          serviceImpl.calculatePayGap((org.sgems.salary.PayGapRequest) request,
              (io.grpc.stub.StreamObserver<org.sgems.salary.PayGapResponse>) responseObserver);
          break;
        case METHODID_STREAM_SALARY_STATISTICS:
          serviceImpl.streamSalaryStatistics((org.sgems.salary.SalaryStatsRequest) request,
              (io.grpc.stub.StreamObserver<org.sgems.salary.SalaryStatsResponse>) responseObserver);
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
        case METHODID_UPLOAD_SALARY_RECORDS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadSalaryRecords(
              (io.grpc.stub.StreamObserver<org.sgems.salary.UploadStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCalculatePayGapMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.sgems.salary.PayGapRequest,
              org.sgems.salary.PayGapResponse>(
                service, METHODID_CALCULATE_PAY_GAP)))
        .addMethod(
          getStreamSalaryStatisticsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.sgems.salary.SalaryStatsRequest,
              org.sgems.salary.SalaryStatsResponse>(
                service, METHODID_STREAM_SALARY_STATISTICS)))
        .addMethod(
          getUploadSalaryRecordsMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.sgems.salary.SalaryRecord,
              org.sgems.salary.UploadStatus>(
                service, METHODID_UPLOAD_SALARY_RECORDS)))
        .build();
  }

  private static abstract class SalaryMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalaryMonitoringServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.sgems.salary.SalaryMonitoringProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SalaryMonitoringService");
    }
  }

  private static final class SalaryMonitoringServiceFileDescriptorSupplier
      extends SalaryMonitoringServiceBaseDescriptorSupplier {
    SalaryMonitoringServiceFileDescriptorSupplier() {}
  }

  private static final class SalaryMonitoringServiceMethodDescriptorSupplier
      extends SalaryMonitoringServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SalaryMonitoringServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SalaryMonitoringServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalaryMonitoringServiceFileDescriptorSupplier())
              .addMethod(getCalculatePayGapMethod())
              .addMethod(getStreamSalaryStatisticsMethod())
              .addMethod(getUploadSalaryRecordsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
