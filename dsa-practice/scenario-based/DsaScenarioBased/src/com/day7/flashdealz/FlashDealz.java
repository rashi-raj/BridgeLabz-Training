package com.day7.flashdealz;

/*
 FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization

 */

import java.util.*;

public class FlashDealz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // consume newline

            System.out.println("\nProduct " + (i + 1));
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter discount percentage: ");
            int discount = sc.nextInt();

            list.add(new Product(name, discount));
        }

        // Convert List to Array for Quick Sort
        Product[] products = list.toArray(new Product[0]);

        // Sort using Quick Sort
        QuickSort.quickSort(products, 0, products.length - 1);

        System.out.println("\nFLASH DEALS (Sorted by Discount) ");
        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "% OFF");
        }

        sc.close();
    }
}
