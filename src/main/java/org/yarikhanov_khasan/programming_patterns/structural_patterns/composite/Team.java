package org.yarikhanov_khasan.programming_patterns.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Player> playerList = new ArrayList<>();

    public void addPlayer(Player player){
        playerList.add(player);
    }

    public void removePlayer(Player player) {
        playerList.remove(player);
    }

    public void playHockey(){
        System.out.println("Team play hockey");
        playerList.forEach(Player::play);
    }
}
