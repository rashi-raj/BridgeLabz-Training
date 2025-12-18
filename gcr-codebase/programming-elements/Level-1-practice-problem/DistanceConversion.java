// import scanner class to take input from the user
import java.util.Scanner;

// create class DistanceConversion
public class DistanceConversion {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double distanceInFeet = input.nextDouble();
		
		// convert feet to yards
		double distanceInYards = distanceInFeet / 3;
		
		// convert yards to miles
		double distanceInMiles = distanceInYards / 1760;
		
		System.out.print("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
		input.close();
	}
}