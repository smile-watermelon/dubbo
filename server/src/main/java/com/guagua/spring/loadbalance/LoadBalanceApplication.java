package com.guagua.spring.loadbalance;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guagua
 * @date 2023/3/16 14:24
 * @describe
 */
@SpringBootApplication
@EnableDubbo
public class LoadBalanceApplication {

    /**
     * ToDo 单机模拟负载均衡不好测试，会出现IP绑定异常
     * java.net.BindException: Address already in use
     *
     * todo 解决方案：在使用负载均衡时，dubbo-admin 查看服务时，因为dubbo-admin 默认开启了 qos 会有端口占用等一些问题，
     * todo 可以在dubbo-admin 项目 dubbo-admin-distribution 模块下 config/application.properties 添加下面的配置
     * ToDo dubbo.application.qos-enable=false
     *
     * 负载均衡策略 5 种：
     *  1、RandomLoadBalance 权重随机
     *  2、RoundRobinLoadBalance 权重轮询
     *  3、LeastActiveLoadBalance 最少活跃数，
     *  4、ConsistentHashLoadBalance 一致性哈希
     *  5、ShortestResponseLoadBalance 最短响应时间
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(LoadBalanceApplication.class, args);
    }
}
