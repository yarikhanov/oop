package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_adult.BucketForAdult;

public class ListForAdult {
    public static void main(String[] args) {
        Bucket bucket = new BucketForAdult();
        Berry berry = bucket.getBerry();
        Fruit fruit = bucket.getFruit();
        Vegetable vegetable = bucket.getVegetable();
        berry.addBerry();
        fruit.addFruit();
        vegetable.addVegetable();
    }
}
