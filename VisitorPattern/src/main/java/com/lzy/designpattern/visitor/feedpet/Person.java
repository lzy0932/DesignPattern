package com.lzy.designpattern.visitor.feedpet;

/**
 * 抽象访问者
 */
public interface Person {
    void feed(Dog dog);
    void feed(Cat cat);
}
