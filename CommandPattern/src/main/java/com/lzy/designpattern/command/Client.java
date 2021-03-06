package com.lzy.designpattern.command;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
        invoker.invoke();
    }
}
