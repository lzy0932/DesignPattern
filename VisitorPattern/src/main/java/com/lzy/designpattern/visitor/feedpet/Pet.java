package com.lzy.designpattern.visitor.feedpet;

/**
 * 抽象元素
 */
public interface Pet {
    void accept(Person person);
}
