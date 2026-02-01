package com.functionalinterface.defaultmethod.smartvehicledashboard;

public interface Vehicle {

    void displaySpeed();

    // Optional feature for advanced vehicles
    default void displayBatteryPercentage() {
        System.out.println("Battery information not available");
    }
}
