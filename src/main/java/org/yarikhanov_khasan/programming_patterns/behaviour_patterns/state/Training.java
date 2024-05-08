package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.state;

public class Training {
    public static void main(String[] args) {
        Exercise exercise = new PushUps();
        Human human = new Human();
        human.setExercise(exercise);

        for (int i = 0; i < 10; i++){
            human.doIt();
            human.changeExercise();
        }
    }
}
