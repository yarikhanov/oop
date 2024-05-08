package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.chain_of_responsibility;

public class GreenColorNotifier extends TrafficLight{

    public GreenColorNotifier(int color) {
        super(color);
    }

    @Override
    public void write(String message) {
        System.out.println("Green light " + message);
    }
}
