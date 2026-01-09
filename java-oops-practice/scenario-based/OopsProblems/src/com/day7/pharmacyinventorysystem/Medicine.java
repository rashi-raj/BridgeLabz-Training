package com.day7.pharmacyinventorysystem;

import java.time.LocalDate;

abstract class Medicine implements ISellable {

    private String name;
    private double price;
    private int quantity;
    protected LocalDate expiryDate;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50);
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    @Override
    public void sell(int qty) {
        if (qty <= quantity && !checkExpiry()) {
            quantity -= qty;
            System.out.println("Sold " + qty + " units");
            System.out.println("Total bill: Rs" + calculateTotal(qty));
            System.out.println("Remaining stock: " + quantity);
        } else {
            System.out.println("Sale failed (Expired or insufficient stock)");
        }
    }

    private double applyDiscount(double amount) {
        return amount >= 500 ? amount * 0.9 : amount;
    }

    protected double calculateTotal(int qty) {
        double total = price * qty;
        return applyDiscount(total);
    }
}
