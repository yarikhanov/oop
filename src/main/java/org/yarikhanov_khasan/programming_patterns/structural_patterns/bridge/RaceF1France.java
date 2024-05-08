package org.yarikhanov_khasan.programming_patterns.structural_patterns.bridge;

public class RaceF1France extends Race{

    protected RaceF1France(Car car) {
        super(car);
    }

    @Override
    public void startRace() {
        System.out.println("Racing F1 - France is started");
        car.runCar();
    }
}
