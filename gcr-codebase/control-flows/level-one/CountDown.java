import java.util.Scanner;

public class CountDown{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for counter
		int counter = input.nextInt();
		
		while(counter >= 1){
			// Print the value of the counter
			System.out.println(counter);
			
			// Decrement the counter
			counter--;
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}