package com.lzy.designpattern.builder.varient;

public class Car {

    private String engine;
    private String rack;
    private String tire;
    private String steering;

    public Car(CarBuilder carBuilder) {
        this.engine = carBuilder.engine;
        this.rack = carBuilder.rack;
        this.tire = carBuilder.tire;
        this.steering = carBuilder.steering;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", rack='" + rack + '\'' +
                ", tire='" + tire + '\'' +
                ", steering='" + steering + '\'' +
                '}';
    }

    public static class CarBuilder {

        private String engine;
        private String rack;
        private String tire;
        private String steering;

        public CarBuilder engine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder rack(String rack) {
            this.rack = rack;
            return this;
        }

        public CarBuilder tire(String steering) {
            this.tire = tire;
            return this;
        }

        public CarBuilder steering(String steering) {
            this.steering = steering;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}


