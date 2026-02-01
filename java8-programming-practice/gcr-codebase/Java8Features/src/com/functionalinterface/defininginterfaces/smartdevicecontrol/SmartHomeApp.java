package com.functionalinterface.defininginterfaces.smartdevicecontrol;

public class SmartHomeApp {
    public static void main(String[] args) {
        SmartDevice device = new Light();
        device.turnOn();
        device.turnOff();
    }
}
