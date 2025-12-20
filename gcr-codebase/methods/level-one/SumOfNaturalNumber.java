import java.util.Scanner;

// Create SumOfNaturalNumber class to find the sum of n natural numbers
public class SumOfNaturalNumber{
	
	// Method to calculate the sum of n natural numbers using loop
	public int findSum(int number){
		int sum=0;
		for(int i=1 ; i<=number ; i++){
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for number
		int number = sc.nextInt();
		
		SumOfNaturalNumber object = new SumOfNaturalNumber();
		
		// Get the calculated sum
		int result = object.findSum(number);
		System.out.println("The sum of " + number + " natural number is : " + result);
		
		// close the scanner stream
		sc.close();
	}
}