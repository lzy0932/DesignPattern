package com.lzy.designpattern.observer;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserver());
        subject.attach(new ConcreteObserver());
        subject.setState(1);
        subject.setState(2);
    }
}
