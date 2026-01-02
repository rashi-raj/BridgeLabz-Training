package com.day2.smarthomeautomationsystem;

class AC extends Appliance {

    AC(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("AC cooling started");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("AC turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("AC Status: " + (isOn() ? "ON" : "OFF"));
    }
}
