import java.util.Scanner;
class TemperatureConversion{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in celsius : ");
		double celsius = sc.nextInt();
		double fahrenheit = (celsius * 9.0/5) + 32;
		System.out.println();
		System.out.print("Temperature in Fahrenheit is : " + fahrenheit);
	}
}