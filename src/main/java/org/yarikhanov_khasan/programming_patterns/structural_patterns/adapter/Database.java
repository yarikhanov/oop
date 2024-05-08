package org.yarikhanov_khasan.programming_patterns.structural_patterns.adapter;

public interface Database {
    public void insert();
    public void update();
    public void select();
    public void delete();
}
