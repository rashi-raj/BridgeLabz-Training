package com.day3.cabbygoapp;

abstract class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    private double ratePerKm;  
    private double fare;        

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public double calculateFare(double distance) {
        double baseFare = 50;
        fare = baseFare + distance * ratePerKm;   
        return fare;
    }

    public double getFare() {
        return fare;
    }

    public String getType() {
        return type;
    }
}
