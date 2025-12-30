/*
12. Train Reservation Queue 
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/

import java.util.Scanner;

public class TrainReservationQueue{
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		final int SEATS = 50;
		int availableSeats = SEATS; 
        String choice;
		int bookSeats = 0;

        // Predefined train route
        String[] route = { "Patna", "Gaya", "Prayagraj", "Kanpur", "Delhi" };
		
		do{
			System.out.println("-----------------------------");
			System.out.println("   Train Reservation System");
			System.out.println("-----------------------------");
			System.out.println("1. Book Ticket");
			System.out.println("2. Check Available seats");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. Exit");
			System.out.println("-----------------------------");
			
			// Validate options
			while(true){
				System.out.println("Enter the option number: ");
				int option = sc.nextInt();
				if(option>=1 && option<=4){
					switch(option){
						case 1 -> {
							if(availableSeats==0){
								System.out.println("No seats available !! [BOOKING CLOSED]");
								break;
							}
							
							// Display available destinations
							System.out.println("\nAvailable Destinations:");
							System.out.println("------------------------");
							for (int i = 0; i < route.length; i++) {
								System.out.println((i + 1) + ". " + route[i]);
							}
							System.out.println("------------------------");

							int destChoice;
							// Validate destination choice
							while(true){
								System.out.print("Select destination number: ");
								destChoice = sc.nextInt();
								if (destChoice < 1 || destChoice > route.length){
									System.out.println("Invalid destination selection!");
								}else{
									break;
								}
							}

							// Validate bookSeats
							while(true){
								System.out.println("Enter the number of seats to be booked : ");
								bookSeats = sc.nextInt();
								if(bookSeats <= 0){
									System.out.println("Invalid!!");
								}else if(bookSeats > availableSeats){
									System.out.println("Only " + availableSeats + " available.");
								}else{
									availableSeats = availableSeats - bookSeats;
									System.out.println("Booking Successful!");
									System.out.println("Destination: " + route[destChoice - 1]);
									System.out.println("Seats Booked: " + bookSeats);
									System.out.println("Seats Remaining: " + availableSeats);
									break;
								}
							}
						}
						
						case 2 -> System.out.println("Available seats : " + availableSeats);
						
						case 3 -> {
							// Validate cancelSeats
							while(true){
								System.out.println("How many seats do you want to cancel??");
								int cancelSeats = sc.nextInt();
								if(cancelSeats > bookSeats || cancelSeats<=0){
									System.out.println("Enter valid numbers");
								}else{
									if (availableSeats + cancelSeats <= SEATS) {
										availableSeats += cancelSeats;
									}
									System.out.println("Available Seats: " + availableSeats);
									break;
								}
							}	
						}
						
						case 4 -> {
							System.out.println("Thank you for using Train Reservation System!");
							return;
						}
						
						default -> System.out.println("Invalid option! Try again.");
					}	
					break;
				}
				else{
					System.out.println("Invalid input! Enter within the given options");
				}
			}
			// Validate Yes/No
			while(true) {
				System.out.print("Do you want to continue? (Yes/No): ");
				choice = sc.next();

				if (choice.equalsIgnoreCase("yes") || choice.equalsIgnoreCase("no")) {
					break;
				}
				System.out.println("Invalid input! Enter Yes or No.");
			}

			
		}while(choice.equalsIgnoreCase("yes"));
		
		System.out.println("\nReservation session ended.");
        sc.close();
	}
}