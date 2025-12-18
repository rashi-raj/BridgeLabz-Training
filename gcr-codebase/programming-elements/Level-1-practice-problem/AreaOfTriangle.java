// import scanner class to take input from the user
import java.util.Scanner;

// create class AreaOfTriangle to find the area of triangle
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int base = input.nextInt();
		int height = input.nextInt();
		
		// Calculate the area in centimeters
		double area = 1/2.0 * base * height;
		
		//Calculate the area in inches
		double areaInches = area * 0.394; 
		
		System.out.print("Area of triangle in centimeters is " + area + "and in inches is " + areaInches );
		input.close();
	}
}