import java.util.Scanner;

// Create WeightUnitConvertor class to convert temperature, weight and volume units
public class   {

    // Method to convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheitTocelsius = (farhenheit - 32) * 5 / 9;
        return farhenheitTocelsius; 
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsiusTofarhenheit = (celsius * 9 / 5) + 32;
        return celsiusTofarhenheit;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsTokilograms = 0.453592 * pounds;
        return poundsTokilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsTopounds = 2.20462 * kilograms;
        return kilogramsTopounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsToliters = 3.78541 * gallons;
        return gallonsToliters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersTogallons = 0.264172 * liters;
        return litersTogallons;
    }

    public static void main(String[] args) {
		// Create a scanner object
        Scanner sc = new Scanner(System.in);

		// Get inputs
        double farhenheit = sc.nextDouble();
        double celsius = sc.nextDouble();
        double pounds = sc.nextDouble();
        double kilograms = sc.nextDouble();
        double gallons = sc.nextDouble();
        double liters = sc.nextDouble();

        System.out.println("Fahrenheit to Celsius: " + convertFarhenheitToCelsius(farhenheit));
        System.out.println("Celsius to Fahrenheit: " + convertCelsiusToFarhenheit(celsius));
        System.out.println("Pounds to Kilograms: " + convertPoundsToKilograms(pounds));
        System.out.println("Kilograms to Pounds: " + convertKilogramsToPounds(kilograms));
        System.out.println("Gallons to Liters: " + convertGallonsToLiters(gallons));
        System.out.println("Liters to Gallons: " + convertLitersToGallons(liters));
		
		// close the scanner stream
        sc.close();
    }
}
