package com.inheritance.assistedproblems.transportsystem;

class Motorcycle extends Vehicle {
    private boolean hasCarrier;

    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        System.out.println("\nVehicle Type: Motorcycle");
        super.displayInfo();
        System.out.println("Carrier Available: " + (hasCarrier ? "Yes" : "No"));
    }
}