package org.yarikhanov_khasan.programming_patterns.creational_patterns.builder;

public class MercedesBuilder extends CarBuilder{
    @Override
    void buildName() {
        car.setName("Mercedes");
    }

    @Override
    void buildPrice() {
        car.setPrice(500);
    }
}
