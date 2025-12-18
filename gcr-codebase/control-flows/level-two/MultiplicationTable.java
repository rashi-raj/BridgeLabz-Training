import java.util.Scanner;

// Create MultiplicationTable class to find the multiplication table of a number entered by the user from 6 to 9.
public class MultiplicationTable{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for number
		int number = input.nextInt();
		
		// Compute the table from 6 to 9
		for(int i=6 ; i<=9 ; i++){
			System.out.println( number + " * " + i + " = " + number * i);
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}