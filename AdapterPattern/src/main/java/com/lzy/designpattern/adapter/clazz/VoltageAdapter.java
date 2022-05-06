package com.lzy.designpattern.adapter.clazz;

import com.lzy.designpattern.adapter.Voltage220V;
import com.lzy.designpattern.adapter.Voltage5V;

/**
 * 适配器类
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    // 继承适配者类
    // 实现目标接口
    @Override
    public int output5V() {
        return output220V() / 44;
    }
}
