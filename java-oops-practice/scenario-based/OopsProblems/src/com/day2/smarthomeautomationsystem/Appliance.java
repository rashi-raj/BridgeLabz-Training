package com.day2.smarthomeautomationsystem;

abstract class Appliance implements Controllable {
    private boolean isOn;        // internal state (encapsulated)
    protected int powerUsage;    // watts

    // Default power setting
    Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.isOn = false;
    }

    protected void setState(boolean state) {
        isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getPowerUsage() {
        return powerUsage;
    }

    public abstract void displayStatus();
}
