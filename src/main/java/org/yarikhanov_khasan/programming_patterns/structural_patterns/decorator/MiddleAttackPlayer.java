package org.yarikhanov_khasan.programming_patterns.structural_patterns.decorator;

public class MiddleAttackPlayer extends PlayerDecorator{
    public MiddleAttackPlayer(Player player) {
        super(player);
    }

    public String playAsMiddle(){
        return "Middle play";
    }

    @Override
    public String playVolleyball() {
        return super.playVolleyball() + " " + playAsMiddle();
    }
}
