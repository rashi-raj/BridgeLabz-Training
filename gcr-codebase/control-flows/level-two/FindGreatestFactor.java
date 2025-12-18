import java.util.Scanner;

// Create FindGreatestFactor class to find the greatest factor of a number beside itself
public class FindGreatestFactor{
	public static void main(String [] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get the input for number
		int number = input.nextInt();
		
		// Initialize the greatest factor and find it
		int greatestFactor = 1;
		int i=number-1;
		while(i>=1){
			if(number%i == 0){
				greatestFactor = i;
				break;
			}
			i--;
		}
		
		System.out.println("GreatestFactor : " + greatestFactor);
		
		// Closing the Scanner Stream
		input.close();
	}
}