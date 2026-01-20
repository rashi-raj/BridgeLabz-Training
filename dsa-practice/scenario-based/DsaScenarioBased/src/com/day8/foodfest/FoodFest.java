package com.day8.foodfest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodFest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Stall> finalList = new ArrayList<>();

        System.out.print("Enter number of Zones: ");
        int zones = sc.nextInt();

        for (int i = 0; i < zones; i++) {

            System.out.println("\nZone " + (i + 1));
            System.out.print("Enter number of Stalls: ");
            int stallsCount = sc.nextInt();

            List<Stall> zoneList = new ArrayList<>();

            for (int j = 0; j < stallsCount; j++) {
                sc.nextLine(); // consume newline
                System.out.print("Enter Stall Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Customer Footfall: ");
                int count = sc.nextInt();

                zoneList.add(new Stall(name, count));
            }

            // Sort each zone list (Descending order)
            zoneList.sort((a, b) -> b.customerCount - a.customerCount);

            // Merge zone-wise sorted lists
            finalList = (i == 0) ? zoneList : MergeSort.merge(finalList, zoneList);
        }

        // Display final ranking
        System.out.println("\n===== FOOD FEST STALL PERFORMANCE =====");
        int rank = 1;
        for (Stall s : finalList) {
            System.out.println(rank++ + ". " + s.name + " - " + s.customerCount + " customers");
        }

        sc.close();
    }
}
