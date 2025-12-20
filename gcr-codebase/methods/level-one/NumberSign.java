import java.util.Scanner;

// Create NumberSign class to check whether a number is positive, negative, or zero
public class NumberSign{

	//  Method to determine number sign
	public int determineSign(int number){
		if(number < 0){
			return -1;
		}
		else if(number > 0){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for number
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		NumberSign numberSign = new NumberSign();
		System.out.println(numberSign.determineSign(number));
		
		// close the scanner stream
		sc.close();
		
	}
}