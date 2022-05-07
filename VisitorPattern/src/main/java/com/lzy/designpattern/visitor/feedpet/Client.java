package com.lzy.designpattern.visitor.feedpet;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        home.accept(new Owner());
        home.accept(new Other());
    }
}
