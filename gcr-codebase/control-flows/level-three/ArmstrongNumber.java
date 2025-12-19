import java.util.Scanner;

// Create ArmstrongNumber class to check whether a number is an Armstrong number
public class ArmstrongNumber{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input for number
		int number = input.nextInt();
		
		// Store original number
		int copy = number;
		int sum=0;
		
		// Use loop to calculate sum of cubes of digits 
		while(number>0){
			int remainder = number%10;
			sum += Math.pow(remainder,3);
			number /= 10;
		}
		
		// Check Armstrong condition
		if(copy == sum){
			System.out.println("Given number is an armstrong number");
		}
		else{
			System.out.println("Not an armstrong number");
		}
		
		// Close scanner
        input.close();
	}
}