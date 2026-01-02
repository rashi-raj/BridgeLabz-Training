package com.encapsulation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate, policyNumber);
    }

    @Override
    double calculateRentalCost(int days) {
        return (rentalRate * days) + 1000; 
    }

    @Override
    public double calculateInsurance() {
        return 1000; 
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance | Policy No: " + getInsurancePolicyNumber();
    }
}
