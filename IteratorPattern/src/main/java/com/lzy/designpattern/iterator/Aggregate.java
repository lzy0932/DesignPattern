package com.lzy.designpattern.iterator;

/**
 * 抽象聚合
 */
public interface Aggregate {
    void add(Object object);
    void remove(Object object);
    Iterator iterator();
}
