package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_children;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Berry;

public class Blueberry implements Berry {
    @Override
    public void addBerry() {
        System.out.println("Add blueberry");
    }
}
