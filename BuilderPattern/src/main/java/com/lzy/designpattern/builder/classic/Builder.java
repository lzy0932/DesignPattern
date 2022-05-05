package com.lzy.designpattern.builder.classic;

/**
 * 抽象建造者
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildMemory(String memory);
    public abstract void buildOs(String os);
    public abstract Computer build();
}
