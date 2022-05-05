package com.lzy.designpattern.factorymethod.factory;

import com.lzy.designpattern.factorymethod.product.Circle;
import com.lzy.designpattern.factorymethod.product.Shape;

/**
 * 具体工厂
 */
public class CircleFactory extends ShapeFactory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
