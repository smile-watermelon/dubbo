//package com.guagua.spring.metric;
//
//import com.alibaba.dubbo.common.Constants;
//import org.apache.dubbo.common.constants.CommonConstants;
//import org.apache.dubbo.common.extension.Activate;
//import org.apache.dubbo.common.logger.Logger;
//import org.apache.dubbo.common.logger.LoggerFactory;
//import org.apache.dubbo.rpc.*;
//import org.apache.dubbo.rpc.model.ScopeModelAccessor;
//import org.apache.dubbo.rpc.model.ScopeModelAware;
//
///**
// * @author guagua
// * @date 2023/3/16 18:42
// * @describe
// */
//@Activate(group = CommonConstants.PROVIDER)
//public class PrometheusFilter implements Filter, ScopeModelAware {
//
//    private Logger logger = LoggerFactory.getLogger(PrometheusFilter.class);
//    @Override
//    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
//
//        collector.increaseTotalRequests(interfaceName, methodName, group, version);
//        collector.increaseProcessingRequests(interfaceName, methodName, group, version);
//        Long startTime = System.currentTimeMillis();
//        try {
//            Result invoke = invoker.invoke(invocation);
//            collector.increaseSucceedRequests(interfaceName, methodName, group, version);
//            return invoke;
//        } catch (RpcException e) {
//            collector.increaseFailedRequests(interfaceName, methodName, group, version);
//            throw e;
//        } finally {
//            Long endTime = System.currentTimeMillis();
//            Long rt = endTime - startTime;
//            collector.addRT(interfaceName, methodName, group, version, rt);
//            collector.decreaseProcessingRequests(interfaceName, methodName, group, version);
//        }
//    }
//}
