package com.encapsulation.ridehailingapplication;

class Bike extends Vehicle implements GPS {

    private String location;

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm(); // no base charge
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
