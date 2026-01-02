package com.day2.vehiclerentalapplication;

class Customer {
    private String name;
    private int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public String getCustomerDetails() {
        return "Customer: " + name + ", ID: " + customerId;
    }
}
