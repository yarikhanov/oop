package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.strategy;

public class Run implements Exercise {
    @Override
    public void doIt() {
        System.out.println("Running");
    }
}
