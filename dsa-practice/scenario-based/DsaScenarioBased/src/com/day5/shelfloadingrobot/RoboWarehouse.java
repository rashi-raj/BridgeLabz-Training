package com.day5.shelfloadingrobot;

import java.util.ArrayList;
import java.util.Scanner;

public class RoboWarehouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> shelf = new ArrayList<>();
        PackageSorter sorter = new PackageSorter();

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter weight of package " + i + ": ");
            int weight = sc.nextInt();

            sorter.insertInSortedOrder(shelf, weight);

            System.out.println("Shelf after insertion: " + shelf);
        }

        sc.close();
    }
}
