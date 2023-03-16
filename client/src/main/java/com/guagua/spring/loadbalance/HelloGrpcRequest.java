package com.guagua.spring.loadbalance;

import com.guagua.proto.hello.DubboHelloGrpcServiceGrpc;
import com.guagua.proto.hello.HelloRequest;
import com.guagua.proto.hello.HelloResponse;
import org.apache.commons.logging.LogFactory;
import org.apache.dubbo.common.constants.LoadbalanceRules;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author guagua
 * @date 2023/3/16 14:20
 * @describe
 */
@Component
public class HelloGrpcRequest implements CommandLineRunner {

    @DubboReference(scope = "remote", loadbalance = LoadbalanceRules.ROUND_ROBIN, protocol = "grpc", interfaceName = "com.guagua.proto.hello.DubboHelloGrpcServiceGrpc$IHelloGrpcService")
    DubboHelloGrpcServiceGrpc.IHelloGrpcService helloGrpcService;
    @Override
    public void run(String... args) throws Exception {

        while (true) {
            TimeUnit.SECONDS.sleep(1);
            HelloResponse response = helloGrpcService.say(HelloRequest.newBuilder()
                    .setName("guagua")
                    .build());

            System.out.println("load balance response = " + response);
        }


    }
}
