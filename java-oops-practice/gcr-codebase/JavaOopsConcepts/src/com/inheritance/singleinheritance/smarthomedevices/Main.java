package com.inheritance.singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {
        Device device = new Thermostat("TH-101", "ON", 24);
        device.displayStatus();
    }
}