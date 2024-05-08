package org.yarikhanov_khasan.programming_patterns.structural_patterns.facade;

public class Switch {
    public void turnOn(CheckVoltage checkVoltage){
        if (checkVoltage.isHaveVoltage()){
            System.out.println("Light is turning on");
        }else {
            System.out.println("Voltage is turning off");
        }
    }
}
