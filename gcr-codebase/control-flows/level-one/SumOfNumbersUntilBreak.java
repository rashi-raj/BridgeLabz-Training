import java.util.Scanner;

// Create a class SumOfNumbersUntilBreak to find the sum of numbers until the user enters 0 or a negative number
public class SumOfNumbersUntilBreak{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		double total = 0.0;
		
		// Get input value for variable
		double var = input.nextDouble();
		
		// Find the sum of numbers until the user enters 0 or negative number
		while(true){
			total += var;
			var = input.nextDouble();
			if(var <= 0){
				break;
			}
		}
		
		System.out.println(total);
		
		// Closing the Scanner Stream
		input.close();
	}
}