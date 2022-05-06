package com.lzy.designpattern.adapter.object;

import com.lzy.designpattern.adapter.Voltage220V;
import com.lzy.designpattern.adapter.Voltage5V;

/**
 * 适配器类
 */
public class VoltageAdapter implements Voltage5V {
    // 持有适配者实例
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    // 实现目标接口
    @Override
    public int output5V() {
        return voltage220V.output220V() / 44;
    }
}
