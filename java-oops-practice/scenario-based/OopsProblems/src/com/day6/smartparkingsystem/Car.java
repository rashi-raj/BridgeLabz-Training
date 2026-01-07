package com.day6.smartparkingsystem;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); 
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 5;
        double penalty = (hours > allowedHours) ? 100 : 0;
        return (baseRate * hours) + penalty;
    }
}
