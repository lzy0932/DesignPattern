package com.lzy.designpattern.bridge.implementor;

/**
 * 具体实现化角色
 */
public class Black implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("黑色" + shape);
    }
}
