package com.encapsulation.ecommerceplatform;

class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return price * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}
