import java.util.Scanner;

// Create LengthUnitConvertor class to convert length units
public class LengthUnitConvertor {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsTofeet = 3 * yards;
        return yardsTofeet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetToyards = 0.333333 * feet;
        return feetToyards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersToinches = 39.3701 * meters;
        return metersToinches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesTometers = 0.0254 * inches;
        return inchesTometers;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesTocm = 2.54 * inches;
        return inchesTocm;
    }

    public static void main(String[] args) {
		// Create a scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get inputs
        double yards = sc.nextDouble();
        double feet = sc.nextDouble();
        double meters = sc.nextDouble();
        double inches = sc.nextDouble();

        System.out.println("Yards to Feet: " + convertYardsToFeet(yards));
        System.out.println("Feet to Yards: " + convertFeetToYards(feet));
        System.out.println("Meters to Inches: " + convertMetersToInches(meters));
        System.out.println("Inches to Meters: " + convertInchesToMeters(inches));
        System.out.println("Inches to Centimeters: " + convertInchesToCentimeters(inches));

		// close the scanner stream
        sc.close();
    }
}
