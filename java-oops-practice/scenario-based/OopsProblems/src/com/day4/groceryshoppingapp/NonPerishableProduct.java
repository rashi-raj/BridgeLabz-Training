package com.day4.groceryshoppingapp;

class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double getDiscountRate() {
        return 0.05; // 5%
    }
}
