package com.guagua.proto.hello.client;

import com.guagua.proto.hello.HelloRequest;
import com.guagua.proto.hello.HelloResponse;
import com.guagua.proto.hello.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 * @author guagua
 * @date 2023/3/15 18:42
 * @describe
 */
public class HelloClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8888)
                .usePlaintext()
                .build();

        HelloResponse response = HelloServiceGrpc.newBlockingStub(channel)
                .say(HelloRequest.newBuilder()
                        .setName("guagua")
                        .setAge(18)
                        .build()
                );

        System.out.println(response.getUuid());
    }
}
