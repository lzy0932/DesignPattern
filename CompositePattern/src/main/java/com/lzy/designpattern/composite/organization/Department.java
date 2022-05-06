package com.lzy.designpattern.composite.organization;

/**
 * 叶子节点
 */
public class Department extends Organization {
    public Department(String name) {
        super(name);
    }

    @Override
    public void inform(String info) {
        System.out.println(info + "-" + getName());
    }
}
