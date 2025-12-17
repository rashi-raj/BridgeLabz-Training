// import scanner class to take input from the user
import java.util.Scanner;

// create class DoubleOperation
public class DoubleOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		// double operations
		double result1 = a + b * c;
		double result2 = a * b + c;
		double result3 = c + a / b;
		double result4 = a % b + c;
		
		System.out.print("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
		input.close();
	}
}