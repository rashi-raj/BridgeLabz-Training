package com.inheritance.singleinheritance.smarthomedevices;

//Superclass
class Device {
 protected String deviceId;
 protected String status;

 // Constructor
 Device(String deviceId, String status) {
     this.deviceId = deviceId;
     this.status = status;
 }

 // Method to display device status
 void displayStatus() {
     System.out.println("Device ID: " + deviceId);
     System.out.println("Status: " + status);
 }
}
