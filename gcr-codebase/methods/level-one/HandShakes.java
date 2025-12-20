import java.util.Scanner;

// Create HandShakes class to calculate hanshakes
public class HandShakes{

	//  Method to calculate simple interest
	public int calculateHandshakes(int numberOfStudents){
		return (numberOfStudents * (numberOfStudents - 1))/2;
	}
	
	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get the input 
		int numberOfStudents = sc.nextInt();
		
		HandShakes handshakes = new HandShakes();
		
		// Get the calculated handshakes
		int result = handshakes.calculateHandshakes(numberOfStudents);
		
		System.out.println("No. of handshakes : " + result);
		
		// close the scanner stream
		sc.close();
	}
}
