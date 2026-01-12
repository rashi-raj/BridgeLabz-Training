package com.day1.ambulanceroute;

import java.util.Scanner;

public class AmbulanceRouteApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency");
        route.addUnit("Radiology");
        route.addUnit("Surgery");
        route.addUnit("ICU");

        while (true) {
            System.out.println("\n--- Ambulance Navigation Menu ---");
            System.out.println("1. Display Units");
            System.out.println("2. Find Nearest Available Unit");
            System.out.println("3. Set Unit Under Maintenance");
            System.out.println("4. Remove Unit");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    route.displayUnits();
                    break;

                case 2:
                    route.findAvailableUnit();
                    break;

                case 3:
                    System.out.print("Enter unit name: ");
                    route.setMaintenance(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter unit name: ");
                    route.removeUnit(sc.nextLine());
                    break;

                case 5:
                    System.out.println("System closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
