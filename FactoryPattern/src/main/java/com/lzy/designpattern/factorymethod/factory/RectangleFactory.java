package com.lzy.designpattern.factorymethod.factory;

import com.lzy.designpattern.factorymethod.product.Rectangle;
import com.lzy.designpattern.factorymethod.product.Shape;

/**
 * 具体工厂
 */
public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
