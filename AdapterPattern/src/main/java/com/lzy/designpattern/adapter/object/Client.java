package com.lzy.designpattern.adapter.object;

import com.lzy.designpattern.adapter.Voltage220V;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Voltage220V());
        System.out.println("输出电压为" + voltageAdapter.output5V() + "V");
    }
}
