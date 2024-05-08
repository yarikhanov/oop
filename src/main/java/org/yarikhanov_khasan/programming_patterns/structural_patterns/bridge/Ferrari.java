package org.yarikhanov_khasan.programming_patterns.structural_patterns.bridge;

public class Ferrari implements Car{
    @Override
    public void runCar() {
        System.out.println("Ferrari is first");
    }
}
