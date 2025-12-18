import java.util.Scanner;

// Create the Factorial class to find the factorial of an integer 
public class Factorial{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		int number = input.nextInt();
		
		// Check if the number is a positive number
		if(number > 0){
		
			// Declaring the variable factorial
			int factorial = 1;
			while(number > 0){
				factorial = factorial * number;
				number--;
			}
			
			System.out.println(factorial);
		}
		else{
			System.out.println("Not a natural number!");
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}