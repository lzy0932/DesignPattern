package com.lzy.designpattern.adapter.interfaces;

import com.lzy.designpattern.adapter.Voltage220V;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        PhoneAdapter phoneAdapter = new PhoneAdapter(new Voltage220V());
        System.out.println("输出电压为" + phoneAdapter.output5V() + "V");
    }
}
