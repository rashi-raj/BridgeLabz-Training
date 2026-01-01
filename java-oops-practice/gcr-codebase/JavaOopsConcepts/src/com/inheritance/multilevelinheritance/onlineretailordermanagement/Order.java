package com.inheritance.multilevelinheritance.onlineretailordermanagement;

class Order {
    protected int orderId;
    protected String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    String getOrderStatus() {
        return "Order Placed";
    }
}