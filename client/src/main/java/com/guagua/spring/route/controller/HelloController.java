package com.guagua.spring.route.controller;

import com.guagua.basic.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author guagua
 * @date 2023/3/16 21:16
 * @describe
 */


@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/")
    public String say() {
        return helloService.hello("guagua");
    }
}
