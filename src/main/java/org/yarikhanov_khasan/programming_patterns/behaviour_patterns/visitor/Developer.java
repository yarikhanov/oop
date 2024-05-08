package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.visitor;

public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(Database database);
    public void create(Test test);
}
