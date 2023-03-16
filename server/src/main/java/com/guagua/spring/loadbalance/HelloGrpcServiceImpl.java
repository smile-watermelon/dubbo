package com.guagua.spring.loadbalance;

import com.guagua.proto.hello.DubboHelloGrpcServiceGrpc;
import com.guagua.proto.hello.HelloRequest;
import com.guagua.proto.hello.HelloResponse;
import io.grpc.stub.StreamObserver;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.UUID;

/**
 * @author guagua
 * @date 2023/3/16 14:26
 * @describe
 */
@DubboService(protocol = "grpc", weight = 100)
public class HelloGrpcServiceImpl extends DubboHelloGrpcServiceGrpc.HelloGrpcServiceImplBase {

    @Override
    public void say(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        responseObserver.onNext(
                HelloResponse.newBuilder()
                        .setUuid(UUID.randomUUID().toString() + "....... server 1")
                        .build()
        );
        responseObserver.onCompleted();
    }


}
