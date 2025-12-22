import java.util.Scanner;

// Create NumberChecker utility class
public class NumberChecker5{

    // Method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int number){

        int sum = 0;

        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0){
                sum += i;
            }
        }

        return sum;
    }

    // Method to check if number is Perfect
    public static boolean isPerfect(int number){

        return sumOfProperDivisors(number) == number;
    }

    // Method to check if number is Abundant
    public static boolean isAbundant(int number){

        return sumOfProperDivisors(number) > number;
    }

    // Method to check if number is Deficient
    public static boolean isDeficient(int number){

        return sumOfProperDivisors(number) < number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int digit){

        int fact = 1;

        for (int i = 1; i <= digit; i++){
            fact *= i;
        }

        return fact;
    }

    // Method to check if number is Strong
    // Strong number: sum of factorial of digits = number
    public static boolean isStrong(int number){

        int temp = number;
        int sum = 0;

        while (temp != 0){
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);
		
		// Get input for number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        System.out.println("Is Perfect Number: " + isPerfect(number));
        System.out.println("Is Abundant Number: " + isAbundant(number));
        System.out.println("Is Deficient Number: " + isDeficient(number));
        System.out.println("Is Strong Number: " + isStrong(number));

		// Close scanner stream
        sc.close();
    }
}
