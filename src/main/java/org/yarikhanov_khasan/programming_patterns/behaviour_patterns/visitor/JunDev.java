package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.visitor;

public class JunDev implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("jun create project class");
    }

    @Override
    public void create(Database database) {
        System.out.println("jun create database");
    }

    @Override
    public void create(Test test) {
        System.out.println("jun create test");
    }
}
