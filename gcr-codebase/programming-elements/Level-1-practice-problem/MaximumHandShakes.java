import java.util.Scanner;

// Create a class to calculate maximum number of handshakes among N number of students
public class MaximumHandShakes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students : ");
		int numberOfStudent = input.nextInt();
		
		// Calculate number of handshakes
		int totalHandshakes = (numberOfStudent * (numberOfStudent-1)) / 2;
		
		System.out.print("Number of possible handshakes are : " + totalHandshakes);
		input.close();
	}
}

