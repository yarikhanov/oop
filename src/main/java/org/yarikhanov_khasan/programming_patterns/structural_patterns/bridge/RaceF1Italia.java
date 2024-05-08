package org.yarikhanov_khasan.programming_patterns.structural_patterns.bridge;

public class RaceF1Italia extends Race{
    protected RaceF1Italia(Car car) {
        super(car);
    }

    @Override
    public void startRace() {
        System.out.println("Racing F1 - Italia is started");
        car.runCar();
    }
}
