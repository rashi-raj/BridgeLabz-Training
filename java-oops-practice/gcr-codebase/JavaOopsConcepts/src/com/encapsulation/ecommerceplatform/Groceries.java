package com.encapsulation.ecommerceplatform;

class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}
