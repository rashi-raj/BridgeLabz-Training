// import scanner class to take input from the user
import java.util.Scanner;

// create class QuotientRemainder
public class QuotientRemainder{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		// calculate quotient and remainder
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		
		System.out.print("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + number1 + " and " + number2);
		input.close();
	}
}