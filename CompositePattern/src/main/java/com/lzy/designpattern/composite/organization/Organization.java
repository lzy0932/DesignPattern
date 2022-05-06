package com.lzy.designpattern.composite.organization;

/**
 * 抽象根节点
 */
public abstract class Organization {
    private String name;

    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void inform(String info);
}
