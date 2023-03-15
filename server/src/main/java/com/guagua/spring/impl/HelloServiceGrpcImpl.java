package com.guagua.spring.impl;

import com.guagua.proto.hello.DubboHelloGrpcServiceGrpc;
import com.guagua.proto.hello.HelloRequest;
import com.guagua.proto.hello.HelloResponse;
import com.guagua.proto.hello.HelloServiceGrpc;
import com.guagua.spring.DemoService;
import io.grpc.stub.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.UUID;

/**
 * @author guagua
 * @date 2023/3/14 01:24
 * @describe
 */
@DubboService(
        protocol = "grpc"
)
public class HelloServiceGrpcImpl extends DubboHelloGrpcServiceGrpc.HelloGrpcServiceImplBase {

    @Override
    public void say(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("request=" + request);
        String uuid = UUID.randomUUID().toString();
        responseObserver.onNext(
                HelloResponse.newBuilder()
                        .setUuid(uuid)
                        .build()
        );

        responseObserver.onCompleted();
    }
}
