package org.yarikhanov_khasan.programming_patterns.behaviour_patterns.strategy;

public class Training {
    public static void main(String[] args) {
        Human human = new Human();
        human.setExercise(new PushUps());
        human.executeExercise();

        human.setExercise(new Run());
        human.executeExercise();

        human.setExercise(new BasketballPlay());
        human.executeExercise();
    }
}
