package com.lzy.designpattern.prototype;

import java.util.Date;

/**
 * 访问者
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Dolly", new Date());

        Sheep clone = (Sheep) sheep.clone();
        System.out.println(clone.getName() + " " + clone.getDate());
        System.out.println(sheep.getName() == clone.getName()); // true
        System.out.println(sheep.getDate() == clone.getDate()); // false

        Sheep clone1 = (Sheep) sheep.deepClone();
        System.out.println(clone1.getName() + " " + clone1.getDate());
        System.out.println(sheep.getName() == clone1.getName()); // false
        System.out.println(sheep.getDate() == clone1.getDate()); // false
    }
}
