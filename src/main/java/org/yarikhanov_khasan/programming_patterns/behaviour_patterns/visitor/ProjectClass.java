package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.visitor;

public class ProjectClass implements ProjectElement{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
