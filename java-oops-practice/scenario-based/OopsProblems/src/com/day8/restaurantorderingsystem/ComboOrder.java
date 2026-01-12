package com.day8.restaurantorderingsystem;

public class ComboOrder {

    public static void applyCombo(Order order, FoodItem item1, FoodItem item2) {
        order.addFoodItem(item1);
        order.addFoodItem(item2);
        order.comboApplied = true;
        System.out.println("Combo offer applied successfully!");
    }
}
