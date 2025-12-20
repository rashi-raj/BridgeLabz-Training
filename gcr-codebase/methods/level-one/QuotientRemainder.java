import java.util.Scanner;

public class QuotientRemainder{

	public static int[] findRemainderAndQuotient(int number1, int number2){
		
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		
		return new int[]{quotient, remainder};
	}
	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for number
		System.out.println("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		QuotientRemainder obj = new QuotientRemainder();
		
		int result[] = obj.findRemainderAndQuotient(number1, number2);
		
		System.out.println("Quotient : " + result[0] + "  Remainder : " + result[1]);
		
		// close the scanner stream
		sc.close();
	}
}