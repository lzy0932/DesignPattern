package com.lzy.designpattern.builder.fastfood;

public class BeefBurger extends Burger{
    @Override
    public String name() {
        return "Beef Burger";
    }

    @Override
    public float price() {
        return 10.5f;
    }
}
