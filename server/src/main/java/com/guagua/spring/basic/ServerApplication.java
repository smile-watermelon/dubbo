package com.guagua.spring.basic;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author guagua
 * @date 2023/3/14 01:24
 * @describe
 */

@SpringBootApplication
@EnableDubbo
public class ServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ServerApplication.class, args);
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames)
//                .filter(beanName -> beanName.contains("dubbo"))
//                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
