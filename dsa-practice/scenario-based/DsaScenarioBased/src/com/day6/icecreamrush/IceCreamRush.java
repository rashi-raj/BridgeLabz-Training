package com.day6.icecreamrush;

import java.util.Scanner;

public class IceCreamRush {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlavorSorter sorter = new FlavorSorter();

        System.out.print("Enter number of flavors: ");
        int n = sc.nextInt();

        int[] sales = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weekly sales for flavor " + (i + 1) + ": ");
            sales[i] = sc.nextInt();
        }

        sorter.bubbleSort(sales);

        System.out.println("Flavors sorted by popularity:");
        for (int s : sales) {
            System.out.print(s + " ");
        }

        sc.close();
    }
}
