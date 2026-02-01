package com.functionalinterface.defaultmethod.paymentgatewayintegration;

public interface PaymentProcessor {

    // Existing abstract method
    void pay(double amount);

    // New feature added later
    default void refund(double amount) {
        System.out.println("Refunding amount: " + amount);
    }
}
