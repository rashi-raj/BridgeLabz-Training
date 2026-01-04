package com.day3.cabbygoapp;

class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private boolean rideActive = false;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        if (!rideActive) {
            double fare = vehicle.calculateFare(distance);
            rideActive = true;

            System.out.println("\n Ride Booked Successfully!");
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Driver: " + driver.getName());
            System.out.println("Driver Rating: " + driver.getRating());
            System.out.println("Estimated Fare: Rs" + fare);
        } else {
            System.out.println("Ride already in progress");
        }
    }

    @Override
    public void endRide() {
        if (rideActive) {
            rideActive = false;
            System.out.println("\nRide Ended");
            System.out.println("Final Fare: Rs" + vehicle.getFare());
        } else {
            System.out.println("No active ride");
        }
    }
}
