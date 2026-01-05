package com.day4.groceryshoppingapp;

import java.util.Scanner;

public class SwiftCart{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        while (true) {
            System.out.println("\n1. Milk ₹50 (Perishable)");
            System.out.println("2. Bread ₹25 (Perishable)");
            System.out.println("3. Rice ₹60 (Non-Perishable)");
            System.out.println("4. Chips ₹20 (Non-Perishable)");
            System.out.println("5. Checkout");

            int choice = sc.nextInt();
            if (choice == 5) break;

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            switch (choice) {
                case 1 -> cart.addProduct(new PerishableProduct("Milk", 50, qty));
                case 2 -> cart.addProduct(new PerishableProduct("Bread", 25, qty));
                case 3 -> cart.addProduct(new NonPerishableProduct("Rice", 60, qty));
                case 4 -> cart.addProduct(new NonPerishableProduct("Chips", 20, qty));
            }
        }

        cart.applyDiscount();
        cart.generateBill();
        sc.close();
    }
}
