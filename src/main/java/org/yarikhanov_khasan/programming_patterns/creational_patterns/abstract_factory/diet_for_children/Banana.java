package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_children;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Fruit;

public class Banana implements Fruit {
    @Override
    public void addFruit() {
        System.out.println("Add banana");
    }
}
