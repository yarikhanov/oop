package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.observer;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> vacancies);
}
