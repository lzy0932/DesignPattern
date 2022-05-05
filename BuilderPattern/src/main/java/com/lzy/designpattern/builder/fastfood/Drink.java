package com.lzy.designpattern.builder.fastfood;

public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
