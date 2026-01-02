package com.day1.onlineshoopingcartsystem;

class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getName() {
        return name;
    }
}
