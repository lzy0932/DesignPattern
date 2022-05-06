package com.lzy.designpattern.facade;

/**
 * 外观角色
 */
public class ShapeFacade {
    private Circle circle;
    private Rectangle rectangle;

    public ShapeFacade() {
        circle = new Circle();
        rectangle = new Rectangle();
    }
    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
