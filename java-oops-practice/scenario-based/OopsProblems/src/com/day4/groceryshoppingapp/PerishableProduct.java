package com.day4.groceryshoppingapp;

class PerishableProduct extends Product {

    PerishableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double getDiscountRate() {
        return 0.10; // 10%
    }
}
