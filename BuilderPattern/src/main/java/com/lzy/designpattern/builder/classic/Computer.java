package com.lzy.designpattern.builder.classic;

/**
 * 抽象产品
 */
public abstract class Computer {
    protected String type;
    protected String cpu;
    protected String memory;
    protected String os;

    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
