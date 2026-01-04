package com.day3.cabbygoapp;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to CabbyGo");

        // Driver input
        System.out.print("Enter Driver Name: ");
        String dName = sc.nextLine();

        System.out.print("Enter License Number: ");
        String license = sc.nextLine();

        System.out.print("Enter Driver Rating: ");
        double rating = sc.nextDouble();

        Driver driver = new Driver(dName, license, rating);

        // Vehicle selection
        System.out.println("\nSelect Vehicle Type:");
        System.out.println("1. Mini");
        System.out.println("2. Sedan");
        System.out.println("3. SUV");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        Vehicle vehicle;

        if (choice == 1) {
            vehicle = new Mini(vehicleNo);
        } else if (choice == 2) {
            vehicle = new Sedan(vehicleNo);
        } else {
            vehicle = new SUV(vehicleNo);
        }

        RideService ride = new RideService(vehicle, driver);

        System.out.print("\nEnter Distance (in km): ");
        double distance = sc.nextDouble();

        ride.bookRide(distance);
        ride.endRide();

        sc.close();
    }
}
