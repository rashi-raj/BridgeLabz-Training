package com.conversions.objectcollectionconversion;
import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

class OrdersToCustomerTotalMap {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Alice", 100),
                new Order("Bob", 200),
                new Order("Alice", 150)
        );

        Map<String, Double> totalAmount = orders.stream()
                                                .collect(Collectors.groupingBy(o -> o.customer,
                                                        Collectors.summingDouble(o -> o.amount)));

        System.out.println(totalAmount);
    }
}
