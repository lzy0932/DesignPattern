package com.lzy.designpattern.iterator;

import java.util.List;

/**
 * 具体迭代器
 */
public class ConcreteIterator implements Iterator {
    private List<Object> list;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }

    @Override
    public Object next() {
        Object object = null;
        if (hasNext()) {
            object = list.get(++index);
        }
        return object;
    }
}
