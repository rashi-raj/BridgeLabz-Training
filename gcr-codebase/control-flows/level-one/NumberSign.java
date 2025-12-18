import java.util.Scanner;

// Create NumberSign class to check whether a number is positive, negative, and zero
public class NumberSign{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		int number = input.nextInt();
		
		// Check whether number is positive, negative, or zero.
		if(number > 0){
			System.out.println("Positive");
		}
		else if(number < 0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Zero");
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}