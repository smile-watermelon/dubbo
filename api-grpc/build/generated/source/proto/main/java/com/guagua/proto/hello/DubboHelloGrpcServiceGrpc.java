/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

    package com.guagua.proto.hello;

import org.apache.dubbo.common.URL;

import java.util.concurrent.TimeUnit;

import static org.apache.dubbo.common.constants.CommonConstants.DEFAULT_TIMEOUT;
import static org.apache.dubbo.common.constants.CommonConstants.TIMEOUT_KEY;

import static com.guagua.proto.hello.HelloGrpcServiceGrpc.getServiceDescriptor;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public final class DubboHelloGrpcServiceGrpc {
private DubboHelloGrpcServiceGrpc() {}

public static class DubboHelloGrpcServiceStub implements IHelloGrpcService {

protected URL url;

protected HelloGrpcServiceGrpc.HelloGrpcServiceBlockingStub blockingStub;
protected HelloGrpcServiceGrpc.HelloGrpcServiceFutureStub futureStub;
protected HelloGrpcServiceGrpc.HelloGrpcServiceStub stub;

public DubboHelloGrpcServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url) {
this.url = url;

blockingStub = HelloGrpcServiceGrpc.newBlockingStub(channel).build(channel, callOptions);
futureStub = HelloGrpcServiceGrpc.newFutureStub(channel).build(channel, callOptions);
stub = HelloGrpcServiceGrpc.newStub(channel).build(channel, callOptions);
}

    public com.guagua.proto.hello.HelloResponse say(com.guagua.proto.hello.HelloRequest request) {
    return blockingStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .say(request);
    }

    public com.google.common.util.concurrent.ListenableFuture<com.guagua.proto.hello.HelloResponse> sayAsync(com.guagua.proto.hello.HelloRequest request) {
    return futureStub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .say(request);
    }

    public void say(com.guagua.proto.hello.HelloRequest request, io.grpc.stub.StreamObserver<com.guagua.proto.hello.HelloResponse> responseObserver){
    stub
    .withDeadlineAfter(url.getParameter(TIMEOUT_KEY, DEFAULT_TIMEOUT), TimeUnit.MILLISECONDS)
    .say(request, responseObserver);
    }

}

public static DubboHelloGrpcServiceStub getDubboStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions, URL url) {
return new DubboHelloGrpcServiceStub(channel, callOptions, url);
}

public interface IHelloGrpcService {
    default public com.guagua.proto.hello.HelloResponse say(com.guagua.proto.hello.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    default public com.google.common.util.concurrent.ListenableFuture<com.guagua.proto.hello.HelloResponse> sayAsync(com.guagua.proto.hello.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    public void say(com.guagua.proto.hello.HelloRequest request, io.grpc.stub.StreamObserver<com.guagua.proto.hello.HelloResponse> responseObserver);

}

public static abstract class HelloGrpcServiceImplBase implements IHelloGrpcService, io.grpc.BindableService {

private IHelloGrpcService proxiedImpl;

public final void setProxiedImpl(IHelloGrpcService proxiedImpl) {
this.proxiedImpl = proxiedImpl;
}

    @java.lang.Override
    public final com.guagua.proto.hello.HelloResponse say(com.guagua.proto.hello.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

    @java.lang.Override
    public final com.google.common.util.concurrent.ListenableFuture<com.guagua.proto.hello.HelloResponse> sayAsync(com.guagua.proto.hello.HelloRequest request) {
    throw new UnsupportedOperationException("No need to override this method, extend XxxImplBase and override all methods it allows.");
    }

        public void say(com.guagua.proto.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.guagua.proto.hello.HelloResponse> responseObserver) {
        asyncUnimplementedUnaryCall(com.guagua.proto.hello.HelloGrpcServiceGrpc.getSayMethod(), responseObserver);
        }

@java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
    .addMethod(
    com.guagua.proto.hello.HelloGrpcServiceGrpc.getSayMethod(),
    asyncUnaryCall(
    new MethodHandlers<
    com.guagua.proto.hello.HelloRequest,
    com.guagua.proto.hello.HelloResponse>(
    proxiedImpl, METHODID_SAY)))
.build();
}
}
    private static final int METHODID_SAY = 0;

private static final class MethodHandlers
<Req, Resp> implements
io.grpc.stub.ServerCalls.UnaryMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ServerStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.ClientStreamingMethod
<Req, Resp>,
io.grpc.stub.ServerCalls.BidiStreamingMethod
<Req, Resp> {
private final IHelloGrpcService serviceImpl;
private final int methodId;

MethodHandlers(IHelloGrpcService serviceImpl, int methodId) {
this.serviceImpl = serviceImpl;
this.methodId = methodId;
}

@java.lang.Override
@java.lang.SuppressWarnings("unchecked")
public void invoke(Req request, io.grpc.stub.StreamObserver
<Resp> responseObserver) {
    switch (methodId) {
            case METHODID_SAY:
            serviceImpl.say((com.guagua.proto.hello.HelloRequest) request,
            (io.grpc.stub.StreamObserver<com.guagua.proto.hello.HelloResponse>) responseObserver);
            break;
    default:
    throw new java.lang.AssertionError();
    }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver
    <Req> invoke(io.grpc.stub.StreamObserver
        <Resp> responseObserver) {
            switch (methodId) {
            default:
            throw new java.lang.AssertionError();
            }
            }
            }

            }
