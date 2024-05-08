package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.chain_of_responsibility;

public class YellowColorNotifier extends TrafficLight{

    public YellowColorNotifier(int color) {
        super(color);
    }

    @Override
    public void write(String message) {
        System.out.println("Yellow light " + message);
    }
}
