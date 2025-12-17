// Import Scanner class to take input from the user
import java.util.Scanner;

// Create KilometerToMileConversion class to convert kilometers into miles

public class KilometerToMileConversion{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double km = input.nextDouble();

		// Convert kilometers to miles
		double mile = km * 0.621371;

		System.out.print("The total miles is " + mile + " mile for the given " + km + " km");
		input.close();
	}
}