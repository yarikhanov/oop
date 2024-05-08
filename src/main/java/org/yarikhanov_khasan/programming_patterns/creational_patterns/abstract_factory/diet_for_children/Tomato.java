package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_children;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Vegetable;

public class Tomato implements Vegetable {

    @Override
    public void addVegetable() {
        System.out.println("Add tomato");
    }
}
