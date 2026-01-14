package com.day3.supermarketbillingqueue;

import java.util.List;

public class Customer {
    String name;
    List<String> items;

    Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }
}
