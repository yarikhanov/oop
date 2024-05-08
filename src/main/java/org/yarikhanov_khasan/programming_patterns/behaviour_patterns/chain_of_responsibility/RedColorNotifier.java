package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.chain_of_responsibility;

public class RedColorNotifier extends TrafficLight{
    public RedColorNotifier(int color) {
        super(color);
    }

    @Override
    public void write(String message) {
        System.out.println("Red light " + message);
    }
}
