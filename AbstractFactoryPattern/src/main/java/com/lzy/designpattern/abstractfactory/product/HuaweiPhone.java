package com.lzy.designpattern.abstractfactory.product;

/**
 * 具体产品
 */
public class HuaweiPhone implements Phone {
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }
}
