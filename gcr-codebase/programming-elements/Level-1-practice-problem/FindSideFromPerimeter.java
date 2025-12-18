// import scanner class to take input from the user
import java.util.Scanner;

// Create class FindSideFromPerimeter to find sides of rectangle from its perimeter
public class FindSideFromPerimeter{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double perimeter = input.nextInt();
		
		// Calculate side from perimeter
		double side = perimeter / 4;
		
		System.out.print("The length of the side is " + side + " whose perimeter is " + perimeter );
		input.close();
	}
}