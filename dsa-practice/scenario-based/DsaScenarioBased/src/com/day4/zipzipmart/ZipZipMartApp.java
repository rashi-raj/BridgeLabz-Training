package com.day4.zipzipmart;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZipZipMartApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Transaction> sales = new ArrayList<>();
        TransactionMergeSort sorter = new TransactionMergeSort();

        while (true) {
            System.out.println("\n===== ZipZipMart Sales System =====");
            System.out.println("1. Add Transaction");
            System.out.println("2. Sort Transactions (Date + Amount)");
            System.out.println("3. Display Report");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    LocalDate date = LocalDate.parse(sc.nextLine());

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    sales.add(new Transaction(date, amount));
                    System.out.println("Transaction added!");
                    break;

                case 2:
                    sorter.mergeSort(sales);
                    System.out.println("Transactions sorted successfully.");
                    break;

                case 3:
                    if (sales.isEmpty()) {
                        System.out.println("No transactions available.");
                    } else {
                        System.out.println("Daily Sales Summary:");
                        for (Transaction t : sales) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting ZipZipMart system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
