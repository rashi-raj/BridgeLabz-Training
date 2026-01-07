package com.day6.digitalbookstoresystem;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // ₹100 discount if quantity >= 2
    @Override
    public double applyDiscount(double price, int quantity) {
        if (quantity >= 2) {
            return 100;
        }
        return 0;
    }
}
