package org.yarikhanov_khasan.programming_patterns.structural_patterns.decorator;

public class AttackPlayer implements Player{
    @Override
    public String playVolleyball() {
        return "Player is attacking";
    }
}
