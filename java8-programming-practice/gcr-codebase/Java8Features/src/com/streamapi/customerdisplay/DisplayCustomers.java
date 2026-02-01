package com.streamapi.customerdisplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayCustomers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();

        System.out.println("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Taking customer names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name " + (i + 1) + ": ");
            String name = sc.nextLine();
            customers.add(new Customer(name));
        }

        System.out.println("\nCustomer names in uppercase and sorted order:");

        customers.stream()
                 .map(c -> c.getName().toUpperCase())
                 .sorted()
                 .forEach(System.out::println);

        sc.close();
    }
}
