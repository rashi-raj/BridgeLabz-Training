package com.collectors.orderrevenuesummary;
import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenue {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Rashi", 500),
                new Order("Amit", 300),
                new Order("Rashi", 700),
                new Order("Amit", 200)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                              Order::getCustomer,
                              Collectors.summingDouble(Order::getAmount)
                      ));

        System.out.println(revenueByCustomer);
    }
}
