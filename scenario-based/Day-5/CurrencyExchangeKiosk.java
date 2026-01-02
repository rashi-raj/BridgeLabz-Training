/*
18. Currency Exchange Kiosk 
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;

public class CurrencyExchangeKiosk {
    public static void main(String[] args) {

		// Create scanner object
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
			System.out.println("\n *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("|    Currency Exchange Kiosk    |");
			System.out.println(" *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");

            System.out.print("\nEnter amount in INR: ");
            double inr = sc.nextDouble();

            System.out.println("Choose target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.println("4. JPY");
            System.out.print("Enter choice (1-4): ");
            int currency = sc.nextInt();

            double convertedAmount = 0;

            switch(currency){
                case 1:
                    convertedAmount = inr * 0.012; // USD
                    System.out.println("Amount in USD: " + convertedAmount);
                    break;

                case 2:
                    convertedAmount = inr * 0.011; // EUR
                    System.out.println("Amount in EUR: " + convertedAmount);
                    break;

                case 3:
                    convertedAmount = inr * 0.0095; // GBP
                    System.out.println("Amount in GBP: " + convertedAmount);
                    break;

                case 4:
                    convertedAmount = inr * 1.65; // JPY
                    System.out.println("Amount in JPY: " + convertedAmount);
                    break;

                default:
                    System.out.println("Invalid currency choice!");
            }

            System.out.print("\nDo you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Currency Exchange Kiosk");
		
		// Close scanner stream
        sc.close();
    }
}
