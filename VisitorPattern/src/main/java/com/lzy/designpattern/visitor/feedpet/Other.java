package com.lzy.designpattern.visitor.feedpet;

/**
 * 具体访问者
 */
public class Other implements Person {
    @Override
    public void feed(Dog dog) {
        System.out.println("其他人喂狗");
        dog.bark();
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("其他人喂猫");
        cat.meow();
    }
}
