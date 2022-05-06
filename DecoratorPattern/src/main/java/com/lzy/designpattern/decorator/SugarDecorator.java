package com.lzy.designpattern.decorator;

/**
 * 具体装饰
 */
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        addSugar();
    }

    private void addSugar() {
        System.out.print("加糖");
    }
}
