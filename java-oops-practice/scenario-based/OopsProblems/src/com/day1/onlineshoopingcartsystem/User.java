package com.day1.onlineshoopingcartsystem;

class User {
    private String name;
    private Cart cart;

    User(String name) {
        this.name = name;
        cart = new Cart();
    }

    void addToCart(Product product) {
        cart.addProduct(product);
    }

    void checkout() {
        cart.viewCart();
        System.out.println("Total Bill: Rs" + cart.calculateTotal());
    }
}