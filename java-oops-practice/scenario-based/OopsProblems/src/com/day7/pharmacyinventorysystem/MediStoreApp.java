package com.day7.pharmacyinventorysystem;

import java.util.Scanner;
import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Medicine Type (1-Tablet, 2-Syrup, 3-Injection): ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Medicine Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Expiry Date (YYYY-MM-DD): ");
        LocalDate expiryDate = LocalDate.parse(sc.next());

        System.out.print("Enter Quantity to Sell: ");
        int qty = sc.nextInt();

        Medicine medicine = null;

        switch (choice) {
            case 1:
                medicine = new Tablet(name, price, expiryDate);
                break;
            case 2:
                medicine = new Syrup(name, price, expiryDate);
                break;
            case 3:
                medicine = new Injection(name, price, expiryDate);
                break;
            default:
                System.out.println("Invalid medicine type");
                System.exit(0);
        }

        medicine.sell(qty);

        sc.close();
    }
}
