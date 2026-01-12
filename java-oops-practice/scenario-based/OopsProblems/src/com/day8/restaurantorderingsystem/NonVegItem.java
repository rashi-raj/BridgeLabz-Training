package com.day8.restaurantorderingsystem;

public class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Vegetarian", price, stock);
    }
}
