package com.day6.digitalbookstoresystem;

import java.util.Scanner;

public class BookBazaarApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to BookBazaar ===");

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Book Type (ebook/printed): ");
        String type = sc.nextLine();

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock Available: ");
        int stock = sc.nextInt();

        System.out.print("Enter Quantity to Buy: ");
        int quantity = sc.nextInt();

        Book book = null;

        if (type.equalsIgnoreCase("ebook")) {
            book = new EBook(title, author, price, stock);
        } else if (type.equalsIgnoreCase("printed")) {
            book = new PrintedBook(title, author, price, stock);
        } else {
            System.out.println("Invalid book type!");
            System.exit(0);
        }

        if (!book.reduceStock(quantity)) {
            System.out.println("Insufficient stock!");
            System.exit(0);
        }

        Order order = new Order(customerName, book, quantity);
        order.confirmOrder();
        order.printOrderSummary();

        sc.close();
    }
}