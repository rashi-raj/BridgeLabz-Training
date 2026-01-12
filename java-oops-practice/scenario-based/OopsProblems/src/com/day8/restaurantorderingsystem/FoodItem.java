package com.day8.restaurantorderingsystem;

public abstract class FoodItem {
    private String name;
    private String category;
    private double price;
    private int stock; 

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock() {
        if (stock > 0) {
            stock--;
        }
    }
    
    public void displayDetails() {
    	System.out.println("FoodItems : ");
    	System.out.println("\nName : " + name + "\nprice : " + price + "\nAvailable Stock : " + stock);
    }
}
