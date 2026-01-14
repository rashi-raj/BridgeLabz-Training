package com.day2.traincompanion;

import java.util.Scanner;

public class TrainCompanion {

	public static void main(String[] args) {
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Train companion");
		CompartmentNavigation a = new CompartmentNavigation();
		
		while(true) {
			// Menu
			System.out.println("\n1. Add a compartment");
			System.out.println("2. Remove a compartment");
			System.out.println("3. Move to the next compartment");
			System.out.println("4. Move to the previous compartment");
			System.out.println("5. Exit");
			System.out.println("Choose any option : ");
			
			int choice = sc.nextInt();
			// Exit
			if(choice==5) {
				System.out.println("Thankyou!!!");
				break;
			}
			
			// User choice
			switch(choice) {
				case 1 -> {
					System.out.println("Which service you want ?(Pantry, WiFi, General, AC, Sleeper");
					String s = sc.next();
					a.addCompartment(s);
				}
				
				case 2 -> {
					System.out.println("Which compartment you want to delete ?");
					for(int i=1 ; i<=a.size ; i++) {
						if(i==a.size) {
							System.out.print(i);
							break;
						}
						System.out.print(i + ", ");
					}
					int del = sc.nextInt();
					a.removeCompartment(del);
				}
				
				case 3 -> {
					a.moveForward();
					a.displayAdjacent();
				}
				
				case 4 -> {
					a.moveBackward();
					a.displayAdjacent();
				}
				default -> {
					System.out.println("Invalid input");
				}
				
			}
		}
		
		// Close scanner stream
		sc.close();
	}

}
