package com.lzy.designpattern.builder.varient;

public class Client {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .engine("v12")
                .rack("镁合金")
                .steering("方向盘")
                .tire("米其林")
                .build();
        System.out.println(car);
    }
}
