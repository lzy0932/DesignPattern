package com.lzy.designpattern.composite.file;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点
 */
public class Directory extends Entry {
    private List<Entry> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Directory add(Entry entry) {
        children.add(entry);
        return this;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry: children) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        children.forEach(entry -> entry.printList(prefix + "/" + name));
    }
}
