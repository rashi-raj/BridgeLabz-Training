package com.encapsulation.vehiclerentalsystem;

public class Bike extends Vehicle implements Insurable {

    Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate, policyNumber);
    }

    @Override
    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 200; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
