package org.yarikhanov_khasan.programming_patterns.structural_patterns.bridge;

public class RaceCreator {
    public static void main(String[] args) {
        Race [] race = {
                new RaceF1France(new Lamborgini()),
                new RaceF1Italia(new Ferrari())
        };
        for (Race r : race) {
            r.startRace();
        }

    }
}
