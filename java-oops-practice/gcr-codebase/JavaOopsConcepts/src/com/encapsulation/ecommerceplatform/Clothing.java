package com.encapsulation.ecommerceplatform;

class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return price * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "5% GST on Clothing";
    }
}
