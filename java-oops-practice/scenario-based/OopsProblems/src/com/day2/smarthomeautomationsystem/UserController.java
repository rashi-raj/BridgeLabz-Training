package com.day2.smarthomeautomationsystem;

class UserController {

    public void operateDevice(Controllable device, boolean state) {
        if (state)
            device.turnOn();
        else
            device.turnOff();
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage())
            System.out.println("First appliance consumes more power");
        else if (a1.getPowerUsage() < a2.getPowerUsage())
            System.out.println("Second appliance consumes more power");
        else
            System.out.println("Both appliances consume equal power");
    }
}
