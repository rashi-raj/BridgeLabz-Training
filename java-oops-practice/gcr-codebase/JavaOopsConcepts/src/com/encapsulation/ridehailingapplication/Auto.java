package com.encapsulation.ridehailingapplication;

class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
        this.location = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // small base charge
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
