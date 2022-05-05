package com.lzy.designpattern.simplefactory;

import com.lzy.designpattern.simplefactory.factory.ComputerFactory;
import com.lzy.designpattern.simplefactory.product.Computer;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.createComputer("Lenovo");
        computer.start();
    }
}
