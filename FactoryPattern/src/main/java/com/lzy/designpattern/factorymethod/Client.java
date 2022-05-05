package com.lzy.designpattern.factorymethod;

import com.lzy.designpattern.factorymethod.factory.CircleFactory;
import com.lzy.designpattern.factorymethod.factory.ShapeFactory;
import com.lzy.designpattern.factorymethod.product.Shape;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape shape = factory.getShape();
        shape.draw();
    }
}
