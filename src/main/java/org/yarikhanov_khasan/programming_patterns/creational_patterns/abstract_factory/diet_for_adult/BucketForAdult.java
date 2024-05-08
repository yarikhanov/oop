package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_adult;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Berry;
import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Bucket;
import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Fruit;
import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Vegetable;

public class BucketForAdult implements Bucket {
    @Override
    public Berry getBerry() {
        return new Strawberry();
    }

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Vegetable getVegetable() {
        return new Cucumber();
    }
}
