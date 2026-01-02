/*
19. Bus Route Distance Tracker 
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/

import java.util.Scanner;

public class BusRouteDistanceTracker {
    public static void main(String[] args) {
		// Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println(" Welcome to Bus Route Distance Tracker ");
        System.out.println("----------------------------------------");

        int stopNumber = 1;
        double totalDistance = 0;
        char choice = 'n';
		
        while (choice != 'y' && choice != 'Y') {

            System.out.print("\nEnter distance travelled till Stop " + stopNumber + " (in km): ");
            double distance = sc.nextDouble();

            totalDistance += distance;

            System.out.println("Total distance covered so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (y/n): ");
            choice = sc.next().charAt(0);

            stopNumber++;
        }

        System.out.println("\n Passenger got off the bus.");
        System.out.println("Total distance travelled: " + totalDistance + " km");

		// Close scanner class
        sc.close();
    }
}
