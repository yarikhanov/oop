package org.yarikhanov_khasan.programming_patterns.structural_patterns.composite;

public class Game {
    public static void main(String[] args) {
        Team team = new Team();
        team.addPlayer(new AttackPlayer());
        team.addPlayer(new DefendPlayer());

        team.playHockey();
    }
}
