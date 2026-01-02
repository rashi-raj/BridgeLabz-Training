package com.day1.onlineshoopingcartsystem;

public class Main {
    public static void main(String[] args) {

        User user = new User("Rohan");

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 800);

        user.addToCart(p1);
        user.addToCart(p2);

        user.checkout();
    }
}
