package com.guagua.proto.hello.service;

import com.guagua.proto.hello.*;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

/**
 * @author guagua
 * @date 2023/3/15 17:35
 * @describe
 */
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void say(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);

        responseObserver.onNext(
                HelloResponse.newBuilder()
                        .setUuid(uuid)
                        .build()
        );

        responseObserver.onCompleted();
    }


}
