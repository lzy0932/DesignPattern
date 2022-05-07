package com.lzy.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题
 */
public abstract class Subject {
    // 关键代码：维护一个观察者列表
    protected List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
