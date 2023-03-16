package com.guagua.proto.hello;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.30.2)",
    comments = "Source: hello_service.proto")
public final class HelloGrpcServiceGrpc {

  private HelloGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "hello.HelloGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.guagua.proto.hello.HelloRequest,
      com.guagua.proto.hello.HelloResponse> getSayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Say",
      requestType = com.guagua.proto.hello.HelloRequest.class,
      responseType = com.guagua.proto.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.guagua.proto.hello.HelloRequest,
      com.guagua.proto.hello.HelloResponse> getSayMethod() {
    io.grpc.MethodDescriptor<com.guagua.proto.hello.HelloRequest, com.guagua.proto.hello.HelloResponse> getSayMethod;
    if ((getSayMethod = HelloGrpcServiceGrpc.getSayMethod) == null) {
      synchronized (HelloGrpcServiceGrpc.class) {
        if ((getSayMethod = HelloGrpcServiceGrpc.getSayMethod) == null) {
          HelloGrpcServiceGrpc.getSayMethod = getSayMethod =
              io.grpc.MethodDescriptor.<com.guagua.proto.hello.HelloRequest, com.guagua.proto.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Say"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.guagua.proto.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.guagua.proto.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloGrpcServiceMethodDescriptorSupplier("Say"))
              .build();
        }
      }
    }
    return getSayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloGrpcServiceStub>() {
        @java.lang.Override
        public HelloGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloGrpcServiceStub(channel, callOptions);
        }
      };
    return HelloGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloGrpcServiceBlockingStub>() {
        @java.lang.Override
        public HelloGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloGrpcServiceFutureStub>() {
        @java.lang.Override
        public HelloGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return HelloGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HelloGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void say(com.guagua.proto.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.guagua.proto.hello.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.guagua.proto.hello.HelloRequest,
                com.guagua.proto.hello.HelloResponse>(
                  this, METHODID_SAY)))
          .build();
    }
  }

  /**
   */
  public static final class HelloGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloGrpcServiceStub> {
    private HelloGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void say(com.guagua.proto.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.guagua.proto.hello.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HelloGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloGrpcServiceBlockingStub> {
    private HelloGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.guagua.proto.hello.HelloResponse say(com.guagua.proto.hello.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HelloGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloGrpcServiceFutureStub> {
    private HelloGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.guagua.proto.hello.HelloResponse> say(
        com.guagua.proto.hello.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY:
          serviceImpl.say((com.guagua.proto.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.guagua.proto.hello.HelloResponse>) responseObserver);
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

  private static abstract class HelloGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.guagua.proto.hello.HelloGrpcServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloGrpcService");
    }
  }

  private static final class HelloGrpcServiceFileDescriptorSupplier
      extends HelloGrpcServiceBaseDescriptorSupplier {
    HelloGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class HelloGrpcServiceMethodDescriptorSupplier
      extends HelloGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloGrpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HelloGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloGrpcServiceFileDescriptorSupplier())
              .addMethod(getSayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
