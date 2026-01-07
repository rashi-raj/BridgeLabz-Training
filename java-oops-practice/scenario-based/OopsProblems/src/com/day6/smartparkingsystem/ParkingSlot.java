package com.day6.smartparkingsystem;

public class ParkingSlot {
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private String location;

    public ParkingSlot(String slotId, String location, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.location = location;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public boolean assignSlot() {
        if (!isOccupied) {
            isOccupied = true;
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
    }

    public String getSlotDetails() {
        return slotId + " | Location: " + location + " | Allowed: " + vehicleTypeAllowed;
    }
}
