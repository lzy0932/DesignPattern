package com.lzy.designpattern.decorator;

/**
 * 抽象装饰
 */
public abstract class CoffeeDecorator implements Coffee {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        coffee.makeCoffee();
    }
}
