package com.functionalinterface.defininginterfaces.multivehiclerentalsystem;
public class RentalApp {
    public static void main(String[] args) {
        Rentable vehicle = new Bike();
        vehicle.rent();
        vehicle.returnVehicle();
    }
}
