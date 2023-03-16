package com.guagua.spring.route;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guagua
 * @date 2023/3/16 21:27
 * @describe
 */
@SpringBootApplication
@EnableDubbo
public class RouteApplication {

    /**
     * 条件路由
     * ToDo 客户端调用服务端接口时在DubboReference 里配置参数如下：
     *    @DubboReference(scope = "remote", interfaceName = "com.guagua.basic.HelloService", parameters = {
     *             "tag=gray"
     *     })
     * 在dubbo-admin 管理页面服务治理条件路由可以对应用新添加规则，如下：
     * enabled: true
     * force: true
     * runtime: false
     * conditions:
     *   - '=> tag = gray'
     * todo 动态修改规则，查看接口的调用情况，只有参数满足 tag = gray 的客户端调用才可以正常调用服务提供者接口
     *
     * tag路由
     * ToDo tag路由 和条件类似，客户端请求时，携带tag，只有符合服务或tag规则的客户端才可以调用服务，
     * ToDo addresses 配置是服务的地址，只有标签和服务地址都正确时，服务才可吊桶，客户端配置如下：
     *     @DubboReference(scope = "remote", interfaceName = "com.guagua.basic.HelloService", parameters = {
     *             "tag=gray"
     *     }, tag = "vip")
     *
     * enabled: true
     * force: true
     * runtime: false
     * tags:
     *   - name: vip
     *     addresses:
     *       - '10.37.129.2:20881'
     *
     * 黑白名单
     * ToDo 可以给应用或服务设置，客户端的黑白名单， 只有在白名单的客户端才可访问服务
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(RouteApplication.class, args);
    }
}
