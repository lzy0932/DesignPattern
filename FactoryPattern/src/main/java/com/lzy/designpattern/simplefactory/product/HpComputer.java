package com.lzy.designpattern.simplefactory.product;

/**
 * 具体产品
 */
public class HpComputer extends Computer {
    @Override
    public void start() {
        System.out.println("惠普电脑启动");
    }
}
