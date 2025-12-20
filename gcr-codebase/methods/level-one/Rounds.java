import java.util.Scanner;

// Create Rounds class to compute how many rounds must the athlete complete
public class Rounds{

	//  Method to calculate rounds
	public double calculateRounds(int perimeter, int distance){
		return (distance/perimeter);
	}
	
	// Method to calculate perimeter
	public int calculatePerimeter(int side1, int side2, int side3){
		return side1+side2+side3;
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get the input for sides of triangle
		System.out.println("Enter the sides of the triangle : ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		// Converting the distance 5 km into meters and assigning it
		int distance = 5000;
		
		Rounds rounds = new Rounds();
		
		// Get the calculated perimeter and rounds
		int perimeter = rounds.calculatePerimeter(side1, side2, side3);
		double result = rounds.calculateRounds(perimeter, distance);
		
		System.out.println("Number of rounds user needs to do to complete 5km run : " + result);
		
		// close the scanner stream
		sc.close();
	}
}