import java.util.Scanner;

public class CountDownUsingForLoop{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for counter
		int counter = input.nextInt();
		
		for(int i=counter ; i>=1 ; i--){
			// Print the value of the counter
			System.out.println(i);
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}