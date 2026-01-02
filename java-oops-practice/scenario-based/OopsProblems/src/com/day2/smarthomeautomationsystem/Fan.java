package com.day2.smarthomeautomationsystem;

class Fan extends Appliance {

    Fan(int powerUsage) {
        super(powerUsage);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Fan started spinning");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Fan stopped");
    }

    @Override
    public void displayStatus() {
        System.out.println("Fan Status: " + (isOn() ? "ON" : "OFF"));
    }
}
