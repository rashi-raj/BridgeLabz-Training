package com.day1.onlineshoopingcartsystem;

import java.util.ArrayList;

class Cart {
    private ArrayList<Product> products;

    Cart() {
        products = new ArrayList<>();
    }

    void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart");
    }

    void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.getName() + " removed from cart");
    }

    double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    void viewCart() {
        System.out.println("Items in Cart:");
        for (Product p : products) {
            System.out.println("- " + p.getName() + " : Rs" + p.getPrice());
        }
    }
}
