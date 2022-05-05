package com.lzy.designpattern.simplefactory.product;

/**
 * 具体产品
 */
public class LenovoComputer extends Computer {
    @Override
    public void start() {
        System.out.println("联想电脑启动");
    }
}
