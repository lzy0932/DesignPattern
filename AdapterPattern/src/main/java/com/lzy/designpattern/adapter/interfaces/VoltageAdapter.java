package com.lzy.designpattern.adapter.interfaces;

import com.lzy.designpattern.adapter.Voltage220V;

/**
 * 抽象适配器类
 */
public abstract class VoltageAdapter implements Voltage {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output220V() {
        return voltage220V.output220V();
    }

    @Override
    public int output380V() {
        return 0;
    }
}
