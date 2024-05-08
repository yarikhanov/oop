package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.state;

public class Human {
    Exercise exercise;

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public void changeExercise(){
        if (exercise instanceof PushUps){
            setExercise(new Running());
        }else if( exercise instanceof Running){
            setExercise(new FootballPlay());
        }else if (exercise instanceof  FootballPlay){
            setExercise(new PushUps());
        }
    }

    public void doIt(){
        exercise.doIt();
    }
}
