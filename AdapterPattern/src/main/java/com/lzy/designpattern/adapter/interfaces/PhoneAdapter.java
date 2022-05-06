package com.lzy.designpattern.adapter.interfaces;

import com.lzy.designpattern.adapter.Voltage220V;

/**
 * 具体适配器类
 */
public class PhoneAdapter extends VoltageAdapter {

    public PhoneAdapter(Voltage220V voltage220V) {
        super(voltage220V);
    }

    @Override
    public int output5V() {
        return output220V() / 44;
    }
}
