package com.day8.restaurantorderingsystem;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Vegetarian", price, stock);
    }
}
