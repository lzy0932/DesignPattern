package com.lzy.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色
 */
public class ShapeFactory {
    // 用于存储享元对象的享元池
    private static Map<String, Shape> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}
