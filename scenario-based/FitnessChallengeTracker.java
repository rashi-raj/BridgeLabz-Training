/*
13. Sandeep’s Fitness Challenge Tracker 
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days
*/

import java.util.Scanner;

public class FitnessChallengeTracker{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int WEEK_DAYS = 7;
        String input;

        do {
            System.out.println(" ------------------------------------------------");
            System.out.println("| Welcome to Sandeep's Fitness Challenge Tracker |");
            System.out.println(" ------------------------------------------------");

            int[] pushUps = new int[WEEK_DAYS];

            System.out.println("Enter the push-ups count for 7 days (enter 0 for rest day):");

            // Input push-ups count
            for(int i = 0; i < WEEK_DAYS; i++) {
                System.out.print("Day " + (i + 1) + " -> ");
                pushUps[i] = sc.nextInt();
            }

            int total = 0;
            int activeDays = 0; 

            // Calculate total and average (skip rest days)
            for(int count : pushUps){

                if(count == 0){
                    continue; // skip rest day
                }

                total += count;
                activeDays++;
            }

            double avg = (activeDays > 0) ? (double) total / activeDays : 0;

            System.out.println("--------------------------------");
            System.out.println("          Results");
            System.out.println("--------------------------------");
            System.out.println("Total count of push-ups  -> " + total);
            System.out.println("Average push-ups (excluding rest days) -> " + avg);

            // Validate Yes / No input
            while(true){
                System.out.print("\nDo you want to continue? (Yes/No): ");
                input = sc.next();

                if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter Yes or No.");
                }
            }

            if (input.equalsIgnoreCase("no")) {
                System.out.println("\nThank you for using Sandeep's Fitness Challenge Tracker!");
            }

        }while(input.equalsIgnoreCase("yes"));

        // Close scanner stream
        sc.close();
    }
}
