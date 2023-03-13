package com.guagua.basic;

import com.guagua.basic.HelloService;

/**
 * @author guagua
 * @date 2023/3/13 22:22
 * @describe
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
