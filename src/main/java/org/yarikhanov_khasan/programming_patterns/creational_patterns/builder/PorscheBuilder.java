package org.yarikhanov_khasan.programming_patterns.creational_patterns.builder;

public class PorscheBuilder extends CarBuilder {

    @Override
    void buildName() {
        car.setName("Porsche");
    }

    @Override
    void buildPrice() {
        car.setPrice(1000);
    }
}
