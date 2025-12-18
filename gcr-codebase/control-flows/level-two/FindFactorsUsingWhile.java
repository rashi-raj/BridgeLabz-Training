import java.util.Scanner;

// Create FindFactorsUsingWhile class to find the factors of a given number
public class FindFactorsUsingWhile{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get the input for number
		int number = input.nextInt();
		
		// Finding factors using loop
		int i=1 ;
		while(i < number){
			if(number % i == 0){
				System.out.println(i);
			}
			i++;
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}