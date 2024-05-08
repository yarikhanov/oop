package org.yarikhanov_khasan.programming_patterns.structural_patterns.decorator;

public class PlayerDecorator implements Player{
    Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public String playVolleyball() {
        return player.playVolleyball();
    }
}
