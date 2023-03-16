package com.guagua.spring.metric;

import com.guagua.basic.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author guagua
 * @date 2023/3/13 22:22
 * @describe
 */
@DubboService(protocol = "dubbo")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
