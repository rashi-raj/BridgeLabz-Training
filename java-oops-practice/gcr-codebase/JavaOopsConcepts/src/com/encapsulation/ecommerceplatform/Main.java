package com.encapsulation.ecommerceplatform;

public class Main{

    static void printFinalPrice(Product product) {

        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
            System.out.println(((Taxable) product).getTaxDetails());
        }

        double discount = product.calculateDiscount();
        double finalPrice = product.price + tax - discount;

        product.displayDetails();
        System.out.println("Discount: Rs" + discount);
        System.out.println("Tax: Rs" + tax);
        System.out.println("Final Price: Rs" + finalPrice);
        System.out.println();
    }

    public static void main(String[] args) {

        Product p1 = new Electronics(101, "Laptop", 60000);
        Product p2 = new Clothing(102, "Jacket", 3000);
        Product p3 = new Groceries(103, "Rice", 1200);

        Product[] products = { p1, p2, p3 };

        for (Product p : products) {
            printFinalPrice(p);
        }
    }
}

