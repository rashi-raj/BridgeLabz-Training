// import scanner class to take input from the user
import java.util.Scanner;

// create class IntOperation
public class IntOperation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		// integer operations
		int result1 = a + b * c;
		int result2 = a * b + c;
		int result3 = c + a / b;
		int result4 = a % b + c;
		
		System.out.print("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
		input.close();
	}
}