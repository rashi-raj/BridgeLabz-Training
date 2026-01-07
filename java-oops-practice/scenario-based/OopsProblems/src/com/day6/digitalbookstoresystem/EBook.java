package com.day6.digitalbookstoresystem;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Flat 20% discount on EBooks
    @Override
    public double applyDiscount(double price, int quantity) {
        double total = price * quantity;
        return total * 0.20;
    }
}
