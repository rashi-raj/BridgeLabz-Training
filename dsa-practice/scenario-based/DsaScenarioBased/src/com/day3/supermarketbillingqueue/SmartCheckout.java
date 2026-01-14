package com.day3.supermarketbillingqueue;

import java.util.*;

public class SmartCheckout {

    Queue<Customer> customerQueue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    SmartCheckout() {
        // initial items
        priceMap.put("Milk", 50);
        priceMap.put("Bread", 30);
        priceMap.put("Rice", 60);
        priceMap.put("Eggs", 10);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Rice", 15);
        stockMap.put("Eggs", 30);
    }

    void addCustomer(Customer c) {
        customerQueue.offer(c);
        System.out.println(c.name + " added to billing queue");
    }

    void processCustomer() {

        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = customerQueue.poll();
        int total = 0;

        System.out.println("\nBilling for " + c.name);

        for (String item : c.items) {

            if (!priceMap.containsKey(item) || stockMap.get(item) == 0) {
                System.out.println(item + " not available");
                continue;
            }

            total += priceMap.get(item);
            stockMap.put(item, stockMap.get(item) - 1);
            System.out.println(item + " added - Rs" + priceMap.get(item));
        }

        System.out.println("Total bill = Rs" + total);
    }

    void showStock() {
        System.out.println("\nCurrent Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " : " + stockMap.get(item));
        }
    }
}
