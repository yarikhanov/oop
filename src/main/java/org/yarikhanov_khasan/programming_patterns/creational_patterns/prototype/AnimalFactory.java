package org.yarikhanov_khasan.programming_patterns.creational_patterns.prototype;

public class AnimalFactory {
    Animal animal;

    public AnimalFactory(Animal animal) {
        this.animal = animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    Animal cloneAnimal(){
        return (Animal) animal.copy();
    }
}
