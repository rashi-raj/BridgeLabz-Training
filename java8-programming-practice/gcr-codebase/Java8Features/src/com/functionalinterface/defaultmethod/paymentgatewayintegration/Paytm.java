package com.functionalinterface.defaultmethod.paymentgatewayintegration;

class Paytm implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paytm payment of ₹" + amount);
    }
}

class Razorpay implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Razorpay payment of ₹" + amount);
    }
}
