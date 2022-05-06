package com.lzy.designpattern.facade;

/**
 * 子系统角色
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("画矩形");
    }
}
