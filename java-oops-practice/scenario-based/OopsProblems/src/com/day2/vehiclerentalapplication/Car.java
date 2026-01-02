package com.day2.vehiclerentalapplication;

class Car extends Vehicle {

    Car(String number) {
        super(number, 800);
    }

    @Override
    public double calculateRent(int days) {
        double surcharge = 500;
        return (baseRate * days) + surcharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car Number: " + vehicleNumber);
    }
}
