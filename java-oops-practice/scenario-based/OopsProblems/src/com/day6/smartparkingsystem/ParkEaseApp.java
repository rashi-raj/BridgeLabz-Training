package com.day6.smartparkingsystem;

import java.util.Scanner;

public class ParkEaseApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to ParkEase ===");

        System.out.print("Enter Slot ID: ");
        String slotId = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Allowed Vehicle Type (car/bike/truck): ");
        String allowedType = sc.nextLine();

        ParkingSlot slot = new ParkingSlot(slotId, location, allowedType);

        System.out.print("Enter Vehicle Type (car/bike/truck): ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Parking Duration (hours): ");
        int hours = sc.nextInt();

        Vehicle vehicle = null;

        switch (vehicleType.toLowerCase()) {
            case "car":
                vehicle = new Car(vehicleNumber);
                break;
            case "bike":
                vehicle = new Bike(vehicleNumber);
                break;
            case "truck":
                vehicle = new Truck(vehicleNumber);
                break;
            default:
                System.out.println("Invalid vehicle type!");
                return;
        }

        if (!slot.isAvailable()) {
            System.out.println("Slot already occupied!");
            return;
        }

        slot.assignSlot();

        Booking booking = new Booking(slot, vehicle, hours);
        booking.generateLog();

        slot.releaseSlot();
        sc.close();
    }
}
