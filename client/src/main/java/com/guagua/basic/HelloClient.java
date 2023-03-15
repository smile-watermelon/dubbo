package com.guagua.basic;

import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;

public class HelloClient {
    public static void main(String[] args) {
        ReferenceConfig<HelloService> referenceConfig = new ReferenceConfig<>();

        referenceConfig.setInterface(HelloService.class);

        DubboBootstrap.getInstance()
                .application("client")
                .registry(new RegistryConfig("zookeeper://localhost:2181"))
                .reference(referenceConfig);

        HelloService helloService = referenceConfig.get();
        String response = helloService.hello("guagua");
        System.out.println(response);


    }
}