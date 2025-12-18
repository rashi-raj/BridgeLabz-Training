// import scanner class to take input from the user
import java.util.Scanner;

// create class Calculator to find the addition, subtraction, multiplication, and division of two numbers.
public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		
		//Calculate addition of the two variable
		float addition = number1 + number2;
		
		//Calculate subtraction of the two variable
		float subtraction = Math.abs(number1 - number2);
		
		//Calculate multiplication of the two variable
		float multiplication = number1 * number2;
		
		//Calculate division of the two variable
		float division = number1/number2;
		
		System.out.print("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " add " + number2
		                  + " is " + addition + "," + subtraction + ", " + multiplication + ", and " + division);
		input.close();
	}
}