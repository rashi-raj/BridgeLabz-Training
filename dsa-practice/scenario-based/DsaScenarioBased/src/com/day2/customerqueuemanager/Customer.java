package com.day2.customerqueuemanager;

// Class Customer to initialize customer data 
public class Customer {
    String id;
    String name;
    boolean isVIP;

    // parameterized constructor
    Customer(String id, String name, boolean isVIP) {
        this.id = id;
        this.name = name;
        this.isVIP = isVIP;
    }
}
