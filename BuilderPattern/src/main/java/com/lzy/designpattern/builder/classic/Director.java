package com.lzy.designpattern.builder.classic;

/**
 * 指导者
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String cpu, String memory, String os) {
        builder.buildCpu(cpu);
        builder.buildMemory(memory);
        builder.buildOs(os);
    }
}
