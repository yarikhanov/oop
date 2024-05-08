package org.yarikhanov_khasan.programming_patterns.creational_patterns.builder;

public abstract class CarBuilder {

    Car car;

    void createCar(){
        car = new Car();
    }
    Car getCar(){
        return car;
    }
    abstract void buildName();

    abstract void buildPrice();
}
