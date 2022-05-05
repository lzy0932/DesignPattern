package com.lzy.designpattern.builder.fastfood;

public class Juice extends Drink {
    @Override
    public String name() {
        return "Orange Juice";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
