package com.inheritance.singleinheritance.smarthomedevices;

//Subclass
class Thermostat extends Device {
 private int temperatureSetting;

 // Constructor
 Thermostat(String deviceId, String status, int temperatureSetting) {
     super(deviceId, status);
     this.temperatureSetting = temperatureSetting;
 }

 // Overriding displayStatus()
 void displayStatus() {
     super.displayStatus();
     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
 }
}

