package com.day2.ewalletapplication;

class Transaction {
    private String type;
    private double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getTransactionDetails() {
        return type + " of Rs" + amount;
    }
}
