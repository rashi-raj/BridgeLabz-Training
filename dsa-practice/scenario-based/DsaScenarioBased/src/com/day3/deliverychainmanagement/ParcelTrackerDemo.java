package com.day3.deliverychainmanagement;

import java.util.Scanner;

public class ParcelTrackerDemo {

    public static void main(String[] args) {
    	// Create scanner object
        Scanner sc = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();

        // default stages
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");

        while(true){
            System.out.println("\n--- Parcel Tracker Menu ---");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Checkpoint");
            System.out.println("3. Mark Parcel Lost");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            // Exit
            if(choice==4) {
            	System.out.println("Thank you!!");
            	break;
            }
            switch (choice) {

                case 1 -> tracker.trackParcel();

                case 2 -> {
                    System.out.print("Add after stage: ");
                    String after = sc.next();
                    System.out.print("Checkpoint name: ");
                    String cp = sc.next();
                    tracker.addCheckpoint(after, cp);
                }

                case 3 -> tracker.markLost();

                case 4 -> {
                    System.out.println("Tracking closed");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
        
        // Close scanner stream
        sc.close();
    }
}

