package com.lzy.designpattern.builder.classic;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new LaptopBuilder();
        Director director = new Director(builder);
        director.construct("i5", "16G", "Windows");
        Computer computer = builder.build();
        System.out.println(computer);
    }
}
