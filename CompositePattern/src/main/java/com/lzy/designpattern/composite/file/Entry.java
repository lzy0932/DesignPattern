package com.lzy.designpattern.composite.file;

/**
 * 抽象根节点
 */
public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public abstract void printList(String prefix);

    public void printList() {
        printList("");
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
