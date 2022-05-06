package com.lzy.designpattern.proxy.dynamicproxy.jdk;

/**
 * 真实主题类
 */
public class Official implements Ticker {
    @Override
    public void sell() {
        System.out.println("官方售票");
    }
}
