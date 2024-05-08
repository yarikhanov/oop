package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.chain_of_responsibility;

public abstract class TrafficLight {
    private int color;

    private TrafficLight nextTrafficLight;

    public void setNextTrafficLight(TrafficLight nextTrafficLight) {
        this.nextTrafficLight = nextTrafficLight;
    }

    public TrafficLight(int color) {
        this.color = color;
    }

    public void notify(String message, int col){
        if (color >= col){
            write(message);
        }
        if (nextTrafficLight != null) {
            nextTrafficLight.notify(message, col);
        }
    }

    public abstract void write(String message);
}
