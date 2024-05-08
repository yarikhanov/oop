package org.yarikhanov_khasan.programming_patterns.structural_patterns.bridge;

public abstract class Race {
    protected Car car;

    protected Race(Car car) {
        this.car = car;
    }

    public abstract void startRace();
}
