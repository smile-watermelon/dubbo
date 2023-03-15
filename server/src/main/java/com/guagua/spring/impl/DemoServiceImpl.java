package com.guagua.spring.impl;

import com.guagua.spring.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author guagua
 * @date 2023/3/14 01:24
 * @describe
 */
@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello dubbo " + name ;
    }
}
