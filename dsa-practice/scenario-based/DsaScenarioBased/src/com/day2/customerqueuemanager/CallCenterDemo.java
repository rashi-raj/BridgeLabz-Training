package com.day2.customerqueuemanager;

import java.util.Scanner;

public class CallCenterDemo{

    public static void main(String[] args){
    	// Create Scanner object
        Scanner sc = new Scanner(System.in);
        CallCenter center = new CallCenter();

        while(true){
        	// Menu
            System.out.println("\n--- Call Center Menu ---");
            System.out.println("1. Receive a call");
            System.out.println("2. Serve next customer");
            System.out.println("3. Display call count");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            // Exit
            if(choice==4) {
            	System.out.println("Thank you!!");
            	break;
            }
            
            // User choice
            switch(choice){

                case 1 -> {
                    System.out.print("Enter Customer ID: ");
                    String id = sc.next();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.next();

                    System.out.print("Is VIP? (true/false): ");
                    boolean isVIP = sc.nextBoolean();

                    center.receiveCall(new Customer(id, name, isVIP));
                }

                case 2 -> center.serveCustomer();

                case 3 -> center.displayCallCounts();

                case 4 -> {
                    System.out.println("Exiting Call Center System");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
        
        // Close scanner stream
        sc.close();
    }
}
