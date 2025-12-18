import java.util.Scanner;

// Create NaturalNumberSum class to find the sum of n natural numbers and compare the result with the formulae n*(n+1)/2
public class NaturalNumberSum{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		int number = input.nextInt();
		
		// Check if the number is a natural number
		if(number > 0){
		
			// Find the sum of n natural numbers using formula
			int formulaSum = (number * (number + 1)) / 2;
			
			// Intialize a variable sum to zero and find the sum of n natural number using for loop
			int sum = 0;
			for(int i = 1; i <= number; i++){
				sum += i;
			}
			
			// Compare both sum
			if(sum == formulaSum){
				System.out.println("The sum of " +number+ " natural numbers computated from formula as well as from loop are same and the sum is : " +sum);
			}
			else{
				System.out.println("The natural number sum does not matched");
			}
		}
		else {
			System.out.println("The number " +number+ " is not a natural number");
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}