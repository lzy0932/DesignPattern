package com.lzy.designpattern.bridge.abstraction;

/**
 * 扩展抽象化角色
 */
public class Rectangle extends Shape {
    @Override
    public void draw() {
        color.paint("矩形");
    }
}
