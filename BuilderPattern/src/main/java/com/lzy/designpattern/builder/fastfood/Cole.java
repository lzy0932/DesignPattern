package com.lzy.designpattern.builder.fastfood;

public class Cole extends Drink {
    @Override
    public String name() {
        return "Coke Cole";
    }

    @Override
    public float price() {
        return 5.0f;
    }
}
