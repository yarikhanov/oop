package org.yarikhanov_khasan.programming_patterns.structural_patterns.facade;

public class Voltageflow {
    Light light = new Light();
    Switch aSwitch = new Switch();

    CheckVoltage checkVoltage = new CheckVoltage();

    public void resolveProblem(){
        light.lightOn();
        checkVoltage.startVoltage();
        aSwitch.turnOn(checkVoltage);
    }
}
