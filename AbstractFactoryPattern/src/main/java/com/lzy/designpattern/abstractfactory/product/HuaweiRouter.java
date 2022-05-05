package com.lzy.designpattern.abstractfactory.product;

/**
 * 具体产品
 */
public class HuaweiRouter implements Router {
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }
}
