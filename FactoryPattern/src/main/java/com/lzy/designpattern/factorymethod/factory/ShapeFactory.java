package com.lzy.designpattern.factorymethod.factory;

import com.lzy.designpattern.factorymethod.product.Shape;

/**
 * 抽象工厂
 */
public abstract class ShapeFactory {
    public abstract Shape getShape();
}
