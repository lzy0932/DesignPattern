package com.lzy.designpattern.observer;

/**
 * 具体观察者
 */
public class ConcreteObserver extends Observer {
    @Override
    public void update(Subject subject) {
        ConcreteSubject concreteSubject = (ConcreteSubject) subject;
        System.out.println("观察者状态：" + concreteSubject.getState());
    }
}
