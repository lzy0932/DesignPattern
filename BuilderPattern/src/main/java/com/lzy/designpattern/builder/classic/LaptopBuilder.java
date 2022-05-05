package com.lzy.designpattern.builder.classic;

/**
 * 具体建造者
 */
public class LaptopBuilder extends Builder {

    private Computer computer = new Laptop();

    @Override
    public void buildCpu(String cpu) {
        computer.cpu = cpu;
    }

    @Override
    public void buildMemory(String memory) {
        computer.memory = memory;
    }

    @Override
    public void buildOs(String os) {
        computer.os = os;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
