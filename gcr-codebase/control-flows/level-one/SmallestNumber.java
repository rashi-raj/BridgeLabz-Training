import java.util.Scanner;

// Create SmallestNumber class to check if first number is the smallest of the three numbers
public class SmallestNumber{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get three input values for number
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		// Check if first number is the smallest of the three numbers
		System.out.println("Is the first number the smallest? " + ((number1<number2) && (number1<number3)));
		
		// Closing the Scanner Stream
		input.close();
	}
}