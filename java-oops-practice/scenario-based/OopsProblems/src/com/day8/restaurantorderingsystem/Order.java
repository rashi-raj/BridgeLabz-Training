package com.day8.restaurantorderingsystem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    protected List<FoodItem> foodItems = new ArrayList<>();
    protected boolean comboApplied = false; 

    public void addFoodItem(FoodItem item) {
        if (item.isAvailable()) {
            foodItems.add(item);
            item.reduceStock();
            System.out.println(item.getName() + " added to cart.");
        } else {
            System.out.println(item.getName() + " is out of stock.");
        }
    }

    protected double calculateTotal() {
        double total = 0;
        for (FoodItem item : foodItems) {
            total += item.getPrice();
        }
        return total;
    }

    // 🔥 polymorphism via state
    protected double applyDiscount() {
        double total = calculateTotal();

        if (comboApplied) {
            return total * 0.85; // 15% combo discount
        }

        if (total >= 2000) {
            return total * 0.60; // 40% discount
        }

        return total;
    }

    @Override
    public void placeOrder() {
        System.out.println("\n----------------------------");
        System.out.println("Order placed successfully!");
        System.out.println("Total Payable Amount: Rs " + applyDiscount());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}
