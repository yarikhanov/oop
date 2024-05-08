package org.yarikhanov_khasan.programming_patterns.creational_patterns.prototype;

public class Animal implements Copyable{
    String name;
    String area;
    int weight;

    public Animal(String name, String area, int weight) {
        this.name = name;
        this.area = area;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public Object copy() {
        Animal animal = new Animal(name, area, weight);
        return animal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", weight=" + weight +
                '}';
    }
}
