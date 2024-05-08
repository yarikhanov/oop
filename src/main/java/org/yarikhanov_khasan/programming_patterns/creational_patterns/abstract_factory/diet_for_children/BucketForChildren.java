package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_children;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Berry;
import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Bucket;
import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Fruit;
import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.Vegetable;

public class BucketForChildren implements Bucket {
    @Override
    public Berry getBerry() {
        return new Blueberry();
    }

    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Vegetable getVegetable() {
        return new Tomato();
    }
}
