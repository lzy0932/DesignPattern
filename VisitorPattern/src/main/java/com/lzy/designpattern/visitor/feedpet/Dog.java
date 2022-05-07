package com.lzy.designpattern.visitor.feedpet;

/**
 * 具体元素
 */
public class Dog implements Pet {
    @Override
    public void accept(Person person) {
        person.feed(this);
    }
	
    public void bark() {
        System.out.println("汪汪汪");
    }
}
