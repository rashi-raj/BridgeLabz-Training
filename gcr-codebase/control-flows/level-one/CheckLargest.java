import java.util.Scanner;

// Create CheckLargest class to check if the first, second, or third number is the largest of the three
public class CheckLargest{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get three input values for number
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Check if the first, second, or third number is the largest of the three
		System.out.println("Is the first number the largest? " + ((number1 > number2) && (number1 > number3)) 
		+ "\nIs the second number the largest? " + ((number2 > number1) && (number2 > number3)) 
		+ "\nIs the third number the largest? " + ((number3 > number1) && (number3 > number2)));
		
		// Closing the Scanner Stream
		input.close();
	}
}