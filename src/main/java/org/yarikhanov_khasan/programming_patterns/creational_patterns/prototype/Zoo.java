package org.yarikhanov_khasan.programming_patterns.creational_patterns.prototype;

public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Animal("lion", "Africa", 100);

        System.out.println(lion);

        AnimalFactory animalFactory = new AnimalFactory(lion);
        Animal lionClone = animalFactory.cloneAnimal();
        System.out.println(lionClone);
    }
}
