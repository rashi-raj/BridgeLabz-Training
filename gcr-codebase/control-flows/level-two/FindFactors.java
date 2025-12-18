import java.util.Scanner;

// Create FindFactors class to find the factors of a given number
public class FindFactors{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get the input for number
		int number = input.nextInt();
		
		// Finding factors using loop
		for(int i=1 ; i < number ; i++){
			if(number % i == 0){
				System.out.println(i);
			}
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}