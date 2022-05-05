package com.lzy.designpattern.builder.fastfood;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
