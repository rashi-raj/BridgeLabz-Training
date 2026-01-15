package com.day4.eventmanager;

public class Ticket {
    String eventName;
    double price;

    public Ticket(String eventName, double price) {
        this.eventName = eventName;
        this.price = price;
    }

    @Override
    public String toString() {
        return eventName + " -> ₹" + price;
    }
}
