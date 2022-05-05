package com.lzy.designpattern.abstractfactory;

import com.lzy.designpattern.abstractfactory.factory.Factory;
import com.lzy.designpattern.abstractfactory.factory.HuaweiFactory;
import com.lzy.designpattern.abstractfactory.product.Phone;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new HuaweiFactory();
        Phone phone = factory.producePhone();
        phone.start();
    }
}
