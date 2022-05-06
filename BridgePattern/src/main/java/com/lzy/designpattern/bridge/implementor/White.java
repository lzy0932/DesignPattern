package com.lzy.designpattern.bridge.implementor;

/**
 * 具体实现化角色
 */
public class White implements Color {
    @Override
    public void paint(String shape) {
        System.out.println("白色" + shape);
    }
}
