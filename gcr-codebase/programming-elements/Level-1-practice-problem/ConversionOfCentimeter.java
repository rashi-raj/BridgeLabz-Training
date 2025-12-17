// Import Scanner class to take input from the user
import java.util.Scanner;

// Create ConversionOfCentimeter class to convert centimeters into feet and inches
 
public class ConversionOfCentimeter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double centimeters = input.nextDouble();
		
		//Convert height in centimeters to inches
		double inch = 2.54 * centimeters;
		
		//Convert height in inch to foot
		double foot = 12 * inch;
		
		System.out.print("Your height in cm is " + centimeters + " while in feet is " + foot + " and inches is " + inch);
		input.close();
	}
}
