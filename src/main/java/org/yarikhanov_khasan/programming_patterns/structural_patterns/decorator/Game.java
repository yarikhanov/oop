package org.yarikhanov_khasan.programming_patterns.structural_patterns.decorator;

public class Game {
    public static void main(String[] args) {
        Player player = new MiddleAttackPlayer(new AttackPlayer());

        System.out.println(player.playVolleyball());
    }
}
