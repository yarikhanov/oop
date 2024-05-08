package org.yarikhanov_khasan.programming_patterns.structural_patterns.decorator;

public class MasterAttackPlayer extends PlayerDecorator{
    public MasterAttackPlayer(Player player) {
        super(player);
    }

    public String playAsMaster(){
        return "Master play";
    }

    @Override
    public String playVolleyball() {
       return super.playVolleyball() + " " + playAsMaster();
    }
}
