package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Main {
    public static void main(String[] args) {

        Vehicle ev = new ElectricVehicle("Tesla Model 3", 200);
        Vehicle pv = new PetrolVehicle("Honda City", 180);

        ev.displayInfo();
        ((ElectricVehicle) ev).charge();

        System.out.println();

        pv.displayInfo();
        ((PetrolVehicle) pv).refuel();
    }
}