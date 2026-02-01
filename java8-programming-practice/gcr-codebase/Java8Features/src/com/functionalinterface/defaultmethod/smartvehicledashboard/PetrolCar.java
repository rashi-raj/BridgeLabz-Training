package com.functionalinterface.defaultmethod.smartvehicledashboard;

class PetrolCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Speed: 100 km/h");
    }

    // Overriding default method
    public void displayBatteryPercentage() {
        System.out.println("Battery: 75%");
    }
}
