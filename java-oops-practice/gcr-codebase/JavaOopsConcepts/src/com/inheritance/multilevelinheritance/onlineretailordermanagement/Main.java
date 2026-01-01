package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order(101, "01-Jan-2025");
        Order order2 = new ShippedOrder(102, "02-Jan-2025", "TRK12345");
        Order order3 = new DeliveredOrder(103, "03-Jan-2025", "TRK67890", "06-Jan-2025");

        System.out.println("Order 1 Status: " + order1.getOrderStatus());
        System.out.println("Order 2 Status: " + order2.getOrderStatus());
        System.out.println("Order 3 Status: " + order3.getOrderStatus());
    }
}