package com.encapsulation.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate, policyNumber);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // flat insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
