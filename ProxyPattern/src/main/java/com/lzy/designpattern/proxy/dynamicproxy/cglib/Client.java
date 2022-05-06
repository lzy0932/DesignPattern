package com.lzy.designpattern.proxy.dynamicproxy.cglib;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Singer singer = new Singer("周杰伦");
        CglibProxy cglibProxy = new CglibProxy();
        Singer proxy = (Singer) cglibProxy.getProxy(singer.getClass());
        proxy.sing();
    }
}
