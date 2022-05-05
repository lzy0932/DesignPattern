package com.lzy.designpattern.factorymethod.product;

/**
 * 具体产品
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
