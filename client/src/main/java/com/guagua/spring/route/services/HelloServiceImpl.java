package com.guagua.spring.route.services;

import com.guagua.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @author guagua
 * @date 2023/3/16 21:22
 * @describe
 */
@Service
public class HelloServiceImpl implements HelloService {

    @DubboReference(scope = "remote", interfaceName = "com.guagua.basic.HelloService", parameters = {
            "tag=gray"}
            , tag = "vip"
//            , stub = "com.guagua.basic.HelloService"
    )
    HelloService helloService;

    @Override
    public String hello(String name) {
        return helloService.hello(name);
    }
}
