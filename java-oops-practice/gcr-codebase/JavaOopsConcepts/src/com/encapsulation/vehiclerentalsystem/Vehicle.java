package com.encapsulation.vehiclerentalsystem;

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    protected double rentalRate; 

    // Encapsulated sensitive data
    private String insurancePolicyNumber;

    // Constructor
    Vehicle(String vehicleNumber, String type,
            double rentalRate, String policyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = policyNumber;
    }

    // Getter methods (no direct access to policy number)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: ₹" + rentalRate + " per day");
    }
}

