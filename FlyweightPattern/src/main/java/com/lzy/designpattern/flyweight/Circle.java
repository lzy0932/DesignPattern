package com.lzy.designpattern.flyweight;

/**
 * 具体享元角色
 */
public class Circle implements Shape {
    // 内部状态
    private String color;

    // 外部状态
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + "{" +
                "color='" + color + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}');
    }
}
