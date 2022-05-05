package com.lzy.designpattern.abstractfactory.product;

/**
 * 具体产品
 */
public class XiaomiPhone implements Phone {
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }
}
