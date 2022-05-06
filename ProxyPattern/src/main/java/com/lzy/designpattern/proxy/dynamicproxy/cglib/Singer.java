package com.lzy.designpattern.proxy.dynamicproxy.cglib;

/**
 * 被代理类
 */
public class Singer {
    private static String name;

    public Singer() {
    }

    public Singer(String name) {
        Singer.name = name;
    }

    public void sing() {
        System.out.println(name + "在唱歌");
    }
}
