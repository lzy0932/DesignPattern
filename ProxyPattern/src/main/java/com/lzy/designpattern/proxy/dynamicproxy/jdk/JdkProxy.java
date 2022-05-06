package com.lzy.designpattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类
 */
public class JdkProxy implements InvocationHandler {
    private Official target;

    public Object bind(Official target) {
        this.target = target;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    /**
     * 作用：通过代理对象执行目标对象的任何接口方法都会经过该方法
     * 方法参数的含义
     * @param proxy   代理对象的引用
     * @param method  当前执行的方法
     * @param args    当前执行方法所需的参数
     * @return        和目标对象方法有相同的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        preRequest();
        result = method.invoke(this.target, args);
        postRequest();
        return result;
    }

    private void preRequest() {
        System.out.println("前置处理");
    }

    private void postRequest() {
        System.out.println("后置处理");
    }
}
