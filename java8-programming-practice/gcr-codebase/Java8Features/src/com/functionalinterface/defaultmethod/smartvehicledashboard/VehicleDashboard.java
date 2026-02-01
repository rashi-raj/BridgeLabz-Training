package com.functionalinterface.defaultmethod.smartvehicledashboard;

public class VehicleDashboard {
    public static void main(String[] args) {

        Vehicle v1 = new PetrolCar();
        Vehicle v2 = new ElectricCar();

        v1.displaySpeed();
        v1.displayBatteryPercentage();

        System.out.println();

        v2.displaySpeed();
        v2.displayBatteryPercentage();
    }
}
