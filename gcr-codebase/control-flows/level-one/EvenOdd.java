import java.util.Scanner;

// Create EvenOdd class to print odd numbers and even numbers between 1 to the number entered by the user
public class EvenOdd{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		int number = input.nextInt();
		
		// Check for natural number and print even and odd number
		for(int i=1 ; i <= number ; i++){
			if(i % 2 == 0){
				System.out.println(i + " is even number!");
			}
			else{
				System.out.println(i + " is odd number!");
			}
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}