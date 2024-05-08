package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_adult;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Berry;

public class Strawberry implements Berry {

    @Override
    public void addBerry() {
        System.out.println("Add strawberry");
    }
}
