package org.yarikhanov_khasan.programming_patterns.structural_patterns.facade;

public class CheckVoltage {
    private boolean haveVoltage;

    public boolean isHaveVoltage() {
        return haveVoltage;
    }

    public void startVoltage(){
        System.out.println("Voltage is on");
        haveVoltage = true;
    }

    public void stopVoltage(){
        System.out.println("Voltage is stoped");
        haveVoltage = false;
    }

}
