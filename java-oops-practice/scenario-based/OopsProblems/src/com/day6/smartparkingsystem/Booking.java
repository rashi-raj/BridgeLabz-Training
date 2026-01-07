package com.day6.smartparkingsystem;

public class Booking {
    private ParkingSlot slot;
    private Vehicle vehicle;
    private int hours;

    public Booking(ParkingSlot slot, Vehicle vehicle, int hours) {
        this.slot = slot;
        this.vehicle = vehicle;
        this.hours = hours;
    }

    public void generateLog() {
        double amount = vehicle.calculateCharges(hours);
        System.out.println("\n--- Parking Receipt ---");
        System.out.println("Vehicle No: " + vehicle.getVehicleNumber());
        System.out.println("Slot: " + slot.getSlotDetails());
        System.out.println("Duration: " + hours + " hours");
        System.out.println("Total Charges: ₹" + amount);
    }
}
