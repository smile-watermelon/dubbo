package com.guagua.spring.impl;

import com.guagua.spring.DemoService;
import org.apache.dubbo.common.constants.ClusterRules;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author guagua
 * @date 2023/3/14 01:24
 * @describe
 */

/**
 * interfaceClass = DemoService.class,
 *         interfaceName = "com.guagua.spring.impl.DemoServiceImpl",
 *         version = "1.0",
 *         group = "dev",
 *         path = "",
 *         // 是否暴露服务
 *         export = false,
 *         token = "123",
 *         deprecated = false,
 *         dynamic = true,
 *         accesslog = "DemoServiceImpl",
 *         // 接口最大并发执行数，默认-1，不限制
 *         executes = -1,
 *         // 接口是不是注册到注册中心，默认true
 *         register = true,
 *         // 接口的权重
 *         weight = -1,
 *         // 接口说明文档
 *         document = "",
 *         // 服务注册延迟时间
 *         delay = -1,
 *         // 接口存根，默认是接口名 + Local
 *         stub = "",
 *         // 接口的调用策略，例如：快速失败，安全失败(记录日志，返回空的值)
 *         cluster = ClusterRules.EMPTY,
 *         // 生产代理， 值为：jdk, javassist
 *         proxy = "",
 *         // 服务支持的最大连接数，-1 = 共享连接
 *         connections = -1
 *         // 还有很多
 */
@DubboService(protocol = "dubbo")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello dubbo " + name ;
    }
}
