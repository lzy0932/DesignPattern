package com.lzy.designpattern.proxy.dynamicproxy.jdk;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Official official = new Official();
        JdkProxy jdkProxy = new JdkProxy();
        Ticker proxy = (Ticker) jdkProxy.bind(official);
        proxy.sell();
    }
}
