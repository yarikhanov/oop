package org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory;

import org.yarikhanov_khasan.programming_patterns.creational_patterns.abstract_factory.diet_for_children.BucketForChildren;

public class ListForChildren {
    public static void main(String[] args) {
        Bucket bucket = new BucketForChildren();
        Berry berry = bucket.getBerry();
        Fruit fruit = bucket.getFruit();
        Vegetable vegetable = bucket.getVegetable();
        berry.addBerry();
        fruit.addFruit();
        vegetable.addVegetable();
    }
}
