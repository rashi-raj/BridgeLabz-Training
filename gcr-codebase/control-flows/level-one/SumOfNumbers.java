import java.util.Scanner;

// Create a class SumOfNumbers to find the sum of numbers until the user enters 0
public class SumOfNumbers{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		
		// Get input value for variable
		double var = input.nextDouble();
		
		// Find the sum of numbers until the user enters 0
		while(var != 0){
			total += var;
			var = input.nextDouble();
		}
		
		System.out.println(total);
		
		// Closing the Scanner Stream
		input.close();
	}
}