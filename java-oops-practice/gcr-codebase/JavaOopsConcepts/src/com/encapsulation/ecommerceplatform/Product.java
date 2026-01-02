package com.encapsulation.ecommerceplatform;

abstract class Product {
    private int productId;
    private String name;
    protected double price;

    // Constructor
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation: Getters & Setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    abstract double calculateDiscount();

    // Concrete method
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Base Price: Rs" + price);
    }
}

