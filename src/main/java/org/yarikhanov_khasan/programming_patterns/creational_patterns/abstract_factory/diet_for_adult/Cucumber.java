package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_adult;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Vegetable;

public class Cucumber implements Vegetable {

    @Override
    public void addVegetable() {
        System.out.println("Add cucumber");
    }
}
