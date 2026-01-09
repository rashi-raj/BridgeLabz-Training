package com.day7.travelitinearyplanner;

class Hotel {

    private double costPerNight;
    private int nights;

    public Hotel(double costPerNight, int nights) {
        this.costPerNight = costPerNight;
        this.nights = nights;
    }

    public double getCost() {
        return costPerNight * nights;
    }
}
