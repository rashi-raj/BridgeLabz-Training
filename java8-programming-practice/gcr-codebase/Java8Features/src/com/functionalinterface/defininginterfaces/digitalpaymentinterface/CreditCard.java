package com.functionalinterface.defininginterfaces.digitalpaymentinterface;

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}