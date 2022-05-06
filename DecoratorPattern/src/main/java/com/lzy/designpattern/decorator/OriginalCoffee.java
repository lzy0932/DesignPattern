package com.lzy.designpattern.decorator;

/**
 * 具体构件
 */
public class OriginalCoffee implements Coffee {
    @Override
    public void makeCoffee() {
        System.out.print("原味咖啡");
    }
}
