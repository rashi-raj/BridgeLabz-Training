package com.day2.vehiclerentalapplication;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Rashi", 101);

        Vehicle v1 = new Bike("BIKE123");
        Vehicle v2 = new Car("CAR456");
        Vehicle v3 = new Truck("TRUCK789");

        System.out.println(c1.getCustomerDetails());

        v1.displayInfo();
        System.out.println("Rent for 3 days: Rs" + v1.calculateRent(3));

        v2.displayInfo();
        System.out.println("Rent for 3 days: Rs" + v2.calculateRent(3));

        v3.displayInfo();
        System.out.println("Rent for 3 days: Rs" + v3.calculateRent(3));
    }
}

