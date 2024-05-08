package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.observer;

public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
