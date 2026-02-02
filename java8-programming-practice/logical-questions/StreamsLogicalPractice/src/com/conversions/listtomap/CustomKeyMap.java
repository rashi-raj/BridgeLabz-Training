package com.conversions.listtomap;
import java.util.*;
import java.util.stream.Collectors;

class Product {
    int code;
    String name;

    Product(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() { return code; }
    public String getName() { return name; }
}

public class CustomKeyMap {
    public static void main(String[] args) {

        List<Product> list = Arrays.asList(
                new Product(101, "Laptop"),
                new Product(102, "Mobile")
        );

        Map<Integer, Product> map =
                list.stream()
                    .collect(Collectors.toMap(
                            Product::getCode,
                            p -> p
                    ));

        System.out.println(map);
    }
}
