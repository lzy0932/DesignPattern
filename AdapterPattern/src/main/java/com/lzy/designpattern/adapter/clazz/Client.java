package com.lzy.designpattern.adapter.clazz;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        System.out.println("输出电压为" + voltageAdapter.output5V() + "V");
    }
}
