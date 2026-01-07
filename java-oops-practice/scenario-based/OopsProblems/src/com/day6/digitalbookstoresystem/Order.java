package com.day6.digitalbookstoresystem;

public class Order {
    private String customerName;
    private Book book;
    private int quantity;
    private String status; 

    public Order(String customerName, Book book, int quantity) {
        this.customerName = customerName;
        this.book = book;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    public double calculateTotal() {
        double discount = book.applyDiscount(book.getPrice(), quantity);
        return (book.getPrice() * quantity) - discount;
    }

    public void confirmOrder() {
        status = "CONFIRMED";
    }

    public String getStatus() {
        return status;
    }

    public void printOrderSummary() {
        System.out.println("\n--- Order Summary ---");
        System.out.println("Customer: " + customerName);
        System.out.println("Book: " + book.getTitle());
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Status: " + status);
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}
