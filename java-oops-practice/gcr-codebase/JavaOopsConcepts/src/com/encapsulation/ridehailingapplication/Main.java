package com.encapsulation.ridehailingapplication;

public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Car(201, "Rahul", 15);
        Vehicle v2 = new Bike(202, "Amit", 8);
        Vehicle v3 = new Auto(203, "Suresh", 10);

        Vehicle[] rides = { v1, v2, v3 };
        double distance = 12.5;

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: ₹" + v.calculateFare(distance));

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("City Center");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

        }
    }
}
