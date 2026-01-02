package com.day2.hospitalmanagementsystem;

class Bill implements Payable {
    private double baseAmount;
    private double tax;
    private double discount;

    Bill(double baseAmount) {
        this.baseAmount = baseAmount;
        this.tax = baseAmount * 0.10;      // 10% tax
        this.discount = baseAmount * 0.05; // 5% discount
    }

    @Override
    public double calculatePayment() {
        return baseAmount + tax - discount;
    }
}
