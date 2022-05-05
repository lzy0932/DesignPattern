package com.lzy.designpattern.abstractfactory.product;

/**
 * 具体产品
 */
public class XiaomiRouter implements Router {
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }
}
