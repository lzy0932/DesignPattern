package com.lzy.designpattern.bridge.abstraction;

import com.lzy.designpattern.bridge.implementor.Color;

/**
 * 抽象化角色
 */
public abstract class Shape {
    // 关键代码：抽象类依赖实现类
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
