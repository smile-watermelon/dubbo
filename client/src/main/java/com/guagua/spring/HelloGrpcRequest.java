package com.guagua.spring;

import com.guagua.proto.hello.DubboHelloGrpcServiceGrpc;
import com.guagua.proto.hello.HelloRequest;
import com.guagua.proto.hello.HelloResponse;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author guagua
 * @date 2023/3/16 00:30
 * @describe
 */
@Component
public class HelloGrpcRequest implements CommandLineRunner {

    @Autowired
    ApplicationContext context;

//    <dubbo:reference scope="remote" id="greeter" interface="io.grpc.examples.helloworld.DubboGreeterGrpc$IGreeter" protocol="grpc"/>
    @DubboReference(interfaceName = "com.guagua.proto.hello.DubboHelloGrpcServiceGrpc$IHelloGrpcService", protocol = "grpc")
    DubboHelloGrpcServiceGrpc.IHelloGrpcService helloGrpcService;


    @Override
    public void run(String... args) throws Exception {
        System.out.println(context);

        HelloResponse response = helloGrpcService.say(HelloRequest.newBuilder()
                .setName("guagua")
                .build());

        System.out.println("grpc response ==> " + response);

    }
}
