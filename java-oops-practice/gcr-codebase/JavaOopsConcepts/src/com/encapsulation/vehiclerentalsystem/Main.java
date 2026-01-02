package com.encapsulation.vehiclerentalsystem;

public class Main {

    static void processRental(Vehicle vehicle, int days) {

        double rentalCost = vehicle.calculateRentalCost(days);
        double insuranceCost = 0;

        if (vehicle instanceof Insurable) {
            insuranceCost = ((Insurable) vehicle).calculateInsurance();
            System.out.println(((Insurable) vehicle).getInsuranceDetails());
        }

        vehicle.displayDetails();
        System.out.println("Rental Days: " + days);
        System.out.println("Rental Cost: ₹" + rentalCost);
        System.out.println("Insurance Cost: ₹" + insuranceCost);
        System.out.println("Total Cost: ₹" + (rentalCost + insuranceCost));
        System.out.println();
    }

    public static void main(String[] args) {

        Vehicle v1 = new Car("CAR101", 2000, "CAR-POL-11");
        Vehicle v2 = new Bike("BIKE202", 500, "BIKE-POL-22");
        Vehicle v3 = new Truck("TRK303", 5000, "TRK-POL-33");

        Vehicle[] vehicles = { v1, v2, v3 };

        for (Vehicle v : vehicles) {
            processRental(v, 3);
        }
    }
}
