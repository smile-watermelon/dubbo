package com.guagua.basic;

import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class HelloServer {
    public static void main(String[] args) {
        ServiceConfig<HelloService> serviceConfig = new ServiceConfig<>();
        serviceConfig.setInterface(HelloService.class);
        serviceConfig.setRef(new HelloServiceImpl());

        DubboBootstrap.getInstance()
                .application("server")
                .registry(new RegistryConfig("zookeeper://localhost:2181"))
                .protocol(new ProtocolConfig("dubbo", -1))
                .service(serviceConfig)
                .start()
                .await();
    }
}