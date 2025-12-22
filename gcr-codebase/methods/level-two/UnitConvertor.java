import java.util.Scanner;

// Create UnitConvertor class to convert the units
public class UnitConvertor{

	// Method to convert kilometers to miles
	public static double convertKmToMiles(double km){
		double kmToMiles = 0.621371 * km;
		return kmToMiles;
	}
	
	// Method to convert miles to kilometers
	public static double convertMilesToKm(double miles){
		double milesToKm = 1.60934 * miles;
		return milesToKm;
	}
	
	// Method to convert meters to feet
	public static double convertMetersToFeet(double meters){
		double metersToFeet = 3.28084 * meters;
		return metersToFeet;
	}
	
	// Method to convert feet to meters
	public static double convertFeetToMeters(double feet){
		double feetToMeters = 0.3048 * feet;
		return feetToMeters;
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get inputs
		double km = sc.nextDouble();
		double miles = sc.nextDouble();
		double meters = sc.nextDouble();
		double feet = sc.nextDouble();
		
		System.out.println("Kilometers to Miles: " + convertKmToMiles(km));
        System.out.println("Miles to Kilometers: " + convertMilesToKm(miles));
        System.out.println("Meters to Feet: " + convertMetersToFeet(meters));
        System.out.println("Feet to Meters: " + convertFeetToMeters(feet));
		
		// close the scanner stream
		sc.close();
	}
}