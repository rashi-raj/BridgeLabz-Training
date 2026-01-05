package com.day4.groceryshoppingapp;

import java.util.*;

class Cart implements ICheckout {

    private List<Product> products = new ArrayList<>();
    private double total;
    private double totalDiscount;

    public void addProduct(Product p) {
        products.add(p);
    }

    private void calculateTotal() {
        total = 0;
        totalDiscount = 0;

        for (Product p : products) {
            total += p.getTotal();
            totalDiscount += p.getDiscountAmount();
        }
    }

    @Override
    public void applyDiscount() {
        calculateTotal();
        total -= totalDiscount;
    }

    @Override
    public void generateBill() {
        System.out.println("\n========= SWIFTCART BILL =========");
        System.out.printf("%-12s %-6s %-8s %-10s %-10s%n",
                "Item", "Qty", "Price", "Discount", "Total");

        for (Product p : products) {
        	System.out.println("Item: " + p.name);
        	System.out.println("Quantity: " + p.quantity);
        	System.out.println("Price: ₹" + (p.price * p.quantity));
        	System.out.println("Discount: ₹" + p.getDiscountAmount());
        	System.out.println("Final Price: ₹" + (p.getTotal() - p.getDiscountAmount()));
        	System.out.println("-------------------------");
        }

        System.out.println("----------------------------------");
        System.out.println("Total Discount: ₹" + totalDiscount);
        System.out.println("Final Payable: ₹" + total);
    }
}
