package com.lzy.designpattern.facade;

/**
 * 子系统角色
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("画圆");
    }
}
