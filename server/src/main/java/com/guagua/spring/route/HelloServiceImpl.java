package com.guagua.spring.route;

import com.guagua.basic.HelloService;
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
@DubboService(protocol = "dubbo1")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "great1 " + name;
    }
}
