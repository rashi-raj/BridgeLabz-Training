package com.day2.trafficmanager;

import java.util.Scanner;

public class TrafficDemo {

    public static void main(String[] args) {
    	// Create scanner object
        Scanner sc = new Scanner(System.in);
        TrafficManager tm = new TrafficManager();

        while (true) {

            System.out.println("\n--- Traffic Manager Menu ---");
            System.out.println("1. Vehicle Enter");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Display Roundabout");
            System.out.println("4. Exit System");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            if(choice==4) {
            	System.out.println("Thank you!!");
            	break;
            }
            switch (choice) {

                case 1 -> {
                    System.out.print("Enter vehicle number: ");
                    String num = sc.next();
                    tm.enterVehicle(num);
                }

                case 2 -> tm.exitVehicle();

                case 3 -> tm.printRoundabout();

                case 4 -> {
                    System.out.println("Traffic system closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
        // close scanner stream
        sc.close();
    }
}
