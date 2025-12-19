import java.util.Scanner;

// Create MultiplicationTable class to find Multiplication Table
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		int result[] = new int[10];
		
		// store the results in the multiplication table array
		for(int i=0 ; i<10 ; i++){
			result[i] = num * (i+1);
		}
		
		// display the result from the array
		for(int i=0 ; i<10 ; i++){
			System.out.println(num + " * " + (i+1) + " = " + result[i]);
		}
		
		// Close the Scanner Object
		input.close();
	}
}