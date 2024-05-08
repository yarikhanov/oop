package org.yarikhanov_khasan.programming_patterns.structural_patterns.adapter;

public class AdapterJavaToDB extends JavaApp implements Database{
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void delete() {
        deleteObject();
    }
}
