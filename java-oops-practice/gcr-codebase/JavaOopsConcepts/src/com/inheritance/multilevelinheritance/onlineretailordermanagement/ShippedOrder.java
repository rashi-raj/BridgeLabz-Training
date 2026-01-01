package com.inheritance.multilevelinheritance.onlineretailordermanagement;

class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}
