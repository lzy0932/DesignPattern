package com.lzy.designpattern.factorymethod.product;

/**
 * 具体产品
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
