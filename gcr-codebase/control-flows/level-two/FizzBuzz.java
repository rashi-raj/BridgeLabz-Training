import java.util.Scanner;

// Create a FizzBuzz class
public class FizzBuzz{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get the input for number
		int number = input.nextInt();
		 
		// Check for FizzBuzz
		if(number > 0){
			for(int i=1 ; i<=number ; i++){
				if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				}
				else if(i%5 == 0){
					System.out.println("Buzz");
				}
				else if(i%3 == 0){
					System.out.println("Fizz");
				}
				else{
					System.out.println(i);
				}
			}
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}