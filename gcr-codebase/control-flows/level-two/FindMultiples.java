import java.util.Scanner;

// Create FindMultiples class to find all the multiples of a number
public class FindMultiples{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get the input for number
		int number = input.nextInt();
		
		// finding the multiples
		if(number>0 && number<100){
			for(int i=100 ; i>=1 ; i--){
				if(number % i == 0){
					System.out.println(i);
					continue;
				}
			}
		}
		else{
			System.out.println("Enter a valid number between 1-100");
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}