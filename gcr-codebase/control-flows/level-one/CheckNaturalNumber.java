import java.util.Scanner;

// Create CheckNaturalNumber class to check for the natural number and print the sum of n natural numbers
public class CheckNaturalNumber{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		int number = input.nextInt();
		
		// Check if the number is positive integer
		if(number > 0){
			// Find the sum of n natural numbers
			int sum = (number * (number + 1)) / 2;
			System.out.println("The sum of " +number+ " natural numbers is : " +sum);
		}
		else {
			System.out.println("The number " +number+ " is not a natural number");
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}