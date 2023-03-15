package com.guagua.hello.server;

import com.guagua.hello.service.HelloService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * @author guagua
 * @date 2023/3/15 18:41
 * @describe
 */
public class HelloServer {

    public static void main(String[] args) throws IOException {
        Server server = ServerBuilder.forPort(8888)
                .addService(new HelloService())
                .build()
                .start();

        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//        int number = HelloRequest.Gender.FEMALE.getNumber();
//        System.out.println(number);

    }
}
