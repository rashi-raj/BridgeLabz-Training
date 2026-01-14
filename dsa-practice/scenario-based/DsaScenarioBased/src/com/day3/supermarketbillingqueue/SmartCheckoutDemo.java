package com.day3.supermarketbillingqueue;

import java.util.*;

public class SmartCheckoutDemo {

    public static void main(String[] args) {
    	// Create scanner object
        Scanner sc = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();

        while (true) {

            System.out.println("\n--- Smart Checkout Menu ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Process Billing");
            System.out.println("3. Show Stock");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            // Exit
            if(choice==4) {
            	System.out.println("Thank you!!");
            	break;
            }
            switch (choice) {

                case 1 -> {
                    System.out.print("Enter customer name: ");
                    String name = sc.next();

                    System.out.print("Enter number of items: ");
                    int n = sc.nextInt();

                    List<String> items = new ArrayList<>();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter item " + (i + 1) + ": ");
                        items.add(sc.next());
                    }

                    checkout.addCustomer(new Customer(name, items));
                }

                case 2 -> checkout.processCustomer();

                case 3 -> checkout.showStock();

                case 4 -> {
                    System.out.println("Checkout closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
        
        // close scanner object
        sc.close();
    }
}
