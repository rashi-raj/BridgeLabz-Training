package com.functionalinterface.defininginterfaces.multivehiclerentalsystem;

public class Car implements Rentable {
    public void rent() {
        System.out.println("Car rented");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
}



