/*
14. Movie Ticket Booking App 
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBooking{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] movies = {"Avatar", "Emily in Paris", "Stranger Things", "Money Heist", "Lucifer"};
		int moviePrices[] = {200, 250, 450, 250, 300};

        String input = null;

        do {
            System.out.println("\n----------------------------------------");
            System.out.println("   Welcome to Movie Ticket Booking App");
            System.out.println("----------------------------------------");
            System.out.println("Today's Trending Movies:");

            for (int i = 0; i < movies.length; i++){
                System.out.println((i + 1) + ". " + movies[i] + " (Rs " + moviePrices[i] + ")");
            }

            // Movie selection
            System.out.print("\nEnter Movie serial number: ");
            int movieChoice = sc.nextInt();

            if (movieChoice < 1 || movieChoice > movies.length){
                System.out.println("Invalid movie selection!");
                continue;
            }

            String selectedMovie = movies[movieChoice - 1];
			int moviePrice = moviePrices[movieChoice - 1];

            // Seat type selection
            System.out.println("\nSelect Seat Type:");
            System.out.println("1. Gold  (Rs 499)");
            System.out.println("2. Silver (Rs 299)");
            System.out.print("Enter choice: ");

            int seatChoice = sc.nextInt();
            int seatPrice = 0;
            String seatType = "";

            switch(seatChoice){
                case 1 ->{
                    seatType = "Gold";
                    seatPrice = 499;
                }
                case 2 ->{
                    seatType = "Silver";
                    seatPrice = 299;
                }
                default ->{
                    System.out.println("Invalid seat type!");
                    continue;
                }
            }

            // Snacks selection
            System.out.println("\nSelect Snacks:");
            System.out.println("1. Popcorn (Rs 150)");
            System.out.println("2. Nachos  (Rs 120)");
            System.out.println("3. Cold Drink (Rs 100)");
            System.out.println("4. No Snacks");
            System.out.print("Enter choice: ");

            int snackChoice = sc.nextInt();
            int snackPrice = 0;
            String snackName = "No Snacks";

            switch(snackChoice){
                case 1 -> {
                    snackName = "Popcorn";
                    snackPrice = 150;
                }
                case 2 -> {
                    snackName = "Nachos";
                    snackPrice = 120;
                }
                case 3 -> {
                    snackName = "Cold Drink";
                    snackPrice = 100;
                }
                case 4 -> snackPrice = 0;
                default -> {
                    System.out.println("Invalid snack option!");
                    continue;
                }
            }

            // Final Bill
            int totalAmount = seatPrice + snackPrice + moviePrice;

            System.out.println("\n----------- Booking Summary -----------");
            System.out.println("Movie       : " + selectedMovie);
            System.out.println("Seat Type   : " + seatType);
            System.out.println("Snacks      : " + snackName);
            System.out.println("Total Amount: Rs " + totalAmount);
            System.out.println("--------------------------------------");
            System.out.println("Booking Confirmed! Enjoy your movie!");

            // Continue for next customer
            while(true){
                System.out.print("\nDo you want to book for another customer? (Yes/No): ");
                input = sc.next();

                if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter Yes or No.");
                }
            }

        }while(input.equalsIgnoreCase("yes"));

        System.out.println("\nThank you for using Movie Ticket Booking App!");
        sc.close();
    }
}
