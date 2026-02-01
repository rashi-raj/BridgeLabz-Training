package com.functionalinterface.defininginterfaces.digitalpaymentinterface;

public class PaymentApp {
    public static void main(String[] args) {
        Payment payment = new CreditCard();
        payment.pay(1500);
    }
}
