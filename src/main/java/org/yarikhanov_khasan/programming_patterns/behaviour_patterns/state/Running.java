package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.state;

public class Running implements Exercise{
    @Override
    public void doIt() {
        System.out.println("Run");
    }
}
