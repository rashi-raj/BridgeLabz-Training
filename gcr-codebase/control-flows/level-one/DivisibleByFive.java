import java.util.Scanner;

// Create DivisibleByFive class to check the number is divisible by 5
public class DivisibleByFive{

	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		int number = input.nextInt();
		
		// Check if number is divisible by 5
		System.out.println("Is the number " +number+ " divisible by 5? " + (number % 5 == 0));
		
		// Closing the Scanner Stream
		input.close();
	}
}