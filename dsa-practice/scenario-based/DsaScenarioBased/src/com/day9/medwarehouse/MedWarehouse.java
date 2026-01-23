package com.day9.medwarehouse;

/*
 * MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedWarehouse {

    // Current date
    public static LocalDate today = LocalDate.now();

    // Threshold to mark medicine as near expiry
    public static int proximityThresholdDays = 10;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of warehouse branches
        System.out.println("Enter the number of branches : ");
        int n = sc.nextInt();
        sc.nextLine();

        // Final merged and sorted list
        List<Medicine> list = new ArrayList<>();
        MergeSort sort = new MergeSort();

        for (int i = 0; i < n; i++) {

            // Records per branch
            System.out.println("Number of records in the branch " + (i + 1) + " : ");
            int m = sc.nextInt();
            sc.nextLine();

            // Branch-specific list
            List<Medicine> ulist = new ArrayList<>();

            for (int j = 0; j < m; j++) {

                // Medicine details
                System.out.println("Enter Medicine name");
                String name = sc.nextLine();

                System.out.println("Enter Expiry date (yyyy-mm-dd) : ");
                LocalDate expiryDate = LocalDate.parse(sc.nextLine());

                // Calculate days left for expiry
                long daysDifference = ChronoUnit.DAYS.between(today, expiryDate);

                // Check near-expiry condition
                boolean nearExpiry;
                if (daysDifference >= 0 && daysDifference <= proximityThresholdDays) {
                    nearExpiry = true;
                } else {
                    nearExpiry = false;
                }

                // Add medicine to branch list
                Medicine med = new Medicine(name, expiryDate, nearExpiry);
                ulist.add(med);
            }

            // Merge branch data into final list
            if (i == 0) {
                list = ulist;
            } else {
                list = sort.merge(list, ulist);
            }
        }

        // Display final sorted medicine list
        System.out.println(list);

        sc.close();
    }
}
