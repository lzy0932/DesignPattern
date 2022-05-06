package com.lzy.designpattern.bridge;

import com.lzy.designpattern.bridge.abstraction.Circle;
import com.lzy.designpattern.bridge.abstraction.Shape;
import com.lzy.designpattern.bridge.implementor.Color;
import com.lzy.designpattern.bridge.implementor.White;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Color color = new White();
        Shape shape = new Circle();
        shape.setColor(color);
        shape.draw();
    }
}
