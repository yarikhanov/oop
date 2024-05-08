package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.observer;

import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println(name + " some changes in vacancies " + vacancies);
    }
}
