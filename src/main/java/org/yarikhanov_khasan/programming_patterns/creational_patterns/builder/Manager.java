package org.yarikhanov_khasan.programming_patterns.creational_patterns.builder;

public class Manager {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car carBuilder(){
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildPrice();

        return carBuilder.getCar();
    }
}
