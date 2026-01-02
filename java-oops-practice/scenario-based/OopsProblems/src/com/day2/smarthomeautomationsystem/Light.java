package com.day2.smarthomeautomationsystem;

class Light extends Appliance {

    Light() {
        super(60); // default power
    }

    Light(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public void displayStatus() {
        System.out.println("Light Status: " + (isOn() ? "ON" : "OFF"));
    }
}
