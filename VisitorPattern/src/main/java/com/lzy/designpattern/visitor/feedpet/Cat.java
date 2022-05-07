package com.lzy.designpattern.visitor.feedpet;

/**
 * 具体元素
 */
public class Cat implements Pet {
    @Override
    public void accept(Person person) {
        person.feed(this);
    }

    public void meow() {
        System.out.println("喵喵喵");
    }
}
