package com.day10.hospitalqueuemanagement;

public class Patient {
	String name;
    int checkInTime;

    Patient(String name, int checkInTime) {
        this.name = name;
        this.checkInTime = checkInTime;
    }

    public String toString() {
        return name + " (" + checkInTime + ")";
    }
}

