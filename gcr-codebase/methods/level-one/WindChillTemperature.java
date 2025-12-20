import java.util.Scanner;

// Create WindChillTemperature class to calculate the wind chill temperature
public class WindChillTemperature{
	
	//Method to calculate the wind chill temperature
	public double calculateWindChill(double temperature, double windSpeed){
	
		double windChill = 35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		return windChill;
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for number
		System.out.println("Enter temperature and windSpeed: ");
		double temperature  = sc.nextDouble();
		double windSpeed = sc.nextDouble();
		
		WindChillTemperature obj = new WindChillTemperature();
		
		double result = obj.calculateWindChill(temperature, windSpeed);
		System.out.println("Windchill : " + result);
		
		// close the scanner stream
		sc.close();
	}
}