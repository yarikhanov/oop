package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.visitor;

public class SeniorDev implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("senior create project class");
    }

    @Override
    public void create(Database database) {
        System.out.println("senior create database");
    }

    @Override
    public void create(Test test) {
        System.out.println("senior create test");
    }
}
