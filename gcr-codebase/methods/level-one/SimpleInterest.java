import java.util.Scanner;

// Create SimpleInterest class to find the simple interest
public class SimpleInterest{

	// Method to find simple interest
	public double calculateSimpleInterest(int principal, int rate, int time){
		return (principal * rate * time)/100;
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		SimpleInterest simpleInterest = new SimpleInterest();
		
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		int time = sc.nextInt();
		
		// Get the calculated simple interest
		double result = simpleInterest.calculateSimpleInterest(principal, rate, time);
		System.out.println(result);
		
		// close the scanner stream
		sc.close();
	}
}