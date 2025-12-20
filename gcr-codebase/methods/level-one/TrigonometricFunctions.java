import java.util.Scanner;

// Create TrigonometricFunctions class to calculate various trigonometric functions
public class TrigonometricFunctions{
	
	//Method to calculate various trigonometric functions
	public double[] calculateTrigonometricFunctions(double angleInDegree){
	
		double angleInRadians = angleInDegree * 0.0174533;
		double sineFunction = Math.sin(angleInRadians);
		double cosineFunction = Math.cos(angleInRadians);
		double tangent = Math.tan(angleInRadians);
		
		return new double[]{sineFunction, cosineFunction, tangent};
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for number
		System.out.println("Enter angle in degrees: ");
		double angleInDegree  = sc.nextDouble();
		
		TrigonometricFunctions trigonometricFunctions = new TrigonometricFunctions();
		
		double[] result = trigonometricFunctions.calculateTrigonometricFunctions(angleInDegree);
		System.out.println("Sine : " + result[0] + " Cosine : " + result[1] + " Tangent : " + result[2] );
		
		// close the scanner stream
		sc.close();
	}
}