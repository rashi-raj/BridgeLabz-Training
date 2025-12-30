/*
11. Temperature Logger 
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemperatureLogger{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int DAYS = 7; 
        String input;

        do{
            System.out.println(" -------------------------------");
            System.out.println("| Welcome to Temperature Logger |");
            System.out.println(" -------------------------------");

            double[] temp = new double[DAYS];

            System.out.println("Enter the temperature for 7 days (in Celsius):");

            // Input temperatures
            for (int i = 0; i < DAYS; i++){
                System.out.print("Day " + (i + 1) + " -> ");
                temp[i] = sc.nextDouble();
            }

            double sum = 0;
            double maxTemp = temp[0];

            // Calculate sum and max temperature
            for (int i = 0; i < DAYS; i++){
                sum += temp[i];
                if (temp[i] > maxTemp) {
                    maxTemp = temp[i];
                }
            }

            double avg = sum / DAYS;

            System.out.println("---------------------------------");
            System.out.println("          Results");
            System.out.println("---------------------------------");
            System.out.println("Total Temperature  -> " + sum + "\u00B0C");
            System.out.println("Average Temperature -> " + avg + "\u00B0C");
            System.out.println("Maximum Temperature -> " + maxTemp + "\u00B0C");

            // Validate Yes / No input
            while(true){
                System.out.print("\nDo you want to continue? (Yes/No): ");
                input = sc.next();

                if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no")){
                    break;
                }else{
                    System.out.println("Invalid input! Please enter Yes or No.");
                }
            }

            if (input.equalsIgnoreCase("no")){
                System.out.println("\nThank you for using Temperature Logger!");
            }

        }while(input.equalsIgnoreCase("yes"));

		// Close scanner stream
        sc.close(); 
    }
}
