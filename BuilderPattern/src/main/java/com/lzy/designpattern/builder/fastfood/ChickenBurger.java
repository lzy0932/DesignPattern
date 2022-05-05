package com.lzy.designpattern.builder.fastfood;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 10.0f;
    }
}
