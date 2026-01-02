package com.encapsulation.ridehailingapplication;

class Car extends Vehicle implements GPS {

    private String location;

    public Car(int id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // base charge
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        location = newLocation;
    }
}
