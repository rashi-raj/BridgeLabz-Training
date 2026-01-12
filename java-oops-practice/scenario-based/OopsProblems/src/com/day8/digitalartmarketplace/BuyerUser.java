package com.day8.digitalartmarketplace;

public class BuyerUser {

    private String name;
    private double walletBalance;

    public BuyerUser(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean hasSufficientBalance(double price) {
        return walletBalance >= price;
    }

    public void deductBalance(double price) {
        walletBalance -= price;
    }

    public void displayBalance() {
        System.out.println("Wallet Balance: Rs." + walletBalance);
    }
}
