package com.guagua.spring.route;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

/**
 * @author guagua
 * @date 2023/3/16 21:15
 * @describe
 */
@SpringBootApplication
@EnableDubbo
public class RouteClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(RouteClientApplication.class, args);
        String[] names = run.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
    }
}
