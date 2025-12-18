import java.util.Scanner;

// Create GreatestFactor class to find the greatest factor of a number beside itself
public class GreatestFactor{
	public static void main(String [] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get the input for number
		int number = input.nextInt();
		
		// Initialize the greatest factor and find it
		int greatestFactor = 1;
		for(int i=number-1 ; i>=1 ; i--){
			if(number%i == 0){
				greatestFactor = i;
				break;
			}
		}
		
		System.out.println("GreatestFactor : " + greatestFactor);
		
		// Closing the Scanner Stream
		input.close();
	}
}