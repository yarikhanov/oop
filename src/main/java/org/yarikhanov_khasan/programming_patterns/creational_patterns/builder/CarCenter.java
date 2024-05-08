package org.yarikhanov_khasan.programming_patterns.creational_patterns.builder;

public class CarCenter {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setCarBuilder(new MercedesBuilder());

        Car car = manager.carBuilder();
        System.out.println(car);
    }
}
