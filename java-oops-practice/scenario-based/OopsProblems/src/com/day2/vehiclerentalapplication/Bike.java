package com.day2.vehiclerentalapplication;

class Bike extends Vehicle {

    Bike(String number) {
        super(number, 200);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; 
    }

    @Override
    public void displayInfo() {
        System.out.println("Bike Number: " + vehicleNumber);
    }
}
