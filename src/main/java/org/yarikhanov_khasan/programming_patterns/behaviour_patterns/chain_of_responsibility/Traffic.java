package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.chain_of_responsibility;

public class Traffic {
    public static void main(String[] args) {
        TrafficLight red = new RedColorNotifier(Color.RED);
        TrafficLight yellow = new YellowColorNotifier(Color.YELLOW);
        TrafficLight green = new GreenColorNotifier(Color.GREEN);


        green.setNextTrafficLight(yellow);
        yellow.setNextTrafficLight(red);

        green.notify("Everything is OK.", 1);
        green.notify("Something wrong", 2);
        green.notify("Accident ahead", 3);
    }
}
