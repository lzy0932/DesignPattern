package com.lzy.designpattern.proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类
 */
public class CglibProxy implements MethodInterceptor {

    public Object getProxy(Class<?> clazz) {
        //创建一个增强器
        Enhancer enhancer = new Enhancer();
        //设置超类(被代理类)
        enhancer.setSuperclass(clazz);
        //设置方法拦截器
        enhancer.setCallback(this);
        return enhancer.create();
    }

    /**
     * intercept用于拦截增强被代理类的方法，和 JDK 动态代理中的 invoke 方法类似
     * @param o 被代理的对象（需要增强的对象）
     * @param method 被拦截的方法（需要增强的方法）
     * @param objects 方法入参
     * @param methodProxy 用于调用原始方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        preRequest();
        methodProxy.invokeSuper(o, objects);
        postRequest();
        return o;
    }

    private void preRequest() {
        System.out.println("前置处理");
    }

    private void postRequest() {
        System.out.println("后置处理");
    }
}
