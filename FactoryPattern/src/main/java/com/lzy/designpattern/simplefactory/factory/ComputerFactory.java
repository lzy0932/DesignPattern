package com.lzy.designpattern.simplefactory.factory;

import com.lzy.designpattern.simplefactory.product.LenovoComputer;
import com.lzy.designpattern.simplefactory.product.Computer;
import com.lzy.designpattern.simplefactory.product.HpComputer;

/**
 * 具体工厂
 */
public class ComputerFactory {
    public static Computer createComputer(String type) {
        Computer computer = null;
        switch (type) {
            case "Lenovo": computer = new LenovoComputer();
                break;
            case "Hp": computer = new HpComputer();
                break;
            default:
                break;
        }
        return computer;
    }
}
