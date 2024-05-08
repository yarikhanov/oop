package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.strategy;

public class Human {
    Exercise exercise;

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void executeExercise(){
        exercise.doIt();
    }
}
