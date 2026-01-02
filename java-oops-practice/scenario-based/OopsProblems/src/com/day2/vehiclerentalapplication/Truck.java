package com.day2.vehiclerentalapplication;

class Truck extends Vehicle {

    Truck(String number) {
        super(number, 1500);
    }

    @Override
    public double calculateRent(int days) {
        double heavyLoadCharge = days * 300;
        return (baseRate * days) + heavyLoadCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Number: " + vehicleNumber);
    }
}
