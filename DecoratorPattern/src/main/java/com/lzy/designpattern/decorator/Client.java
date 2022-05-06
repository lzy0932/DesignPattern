package com.lzy.designpattern.decorator;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Coffee coffee = new OriginalCoffee();
        coffee.makeCoffee();
        System.out.println();

        coffee = new MilkDecorator(coffee);
        coffee.makeCoffee();
        System.out.println();

        coffee = new SugarDecorator(coffee);
        coffee.makeCoffee();
    }
}
