import java.util.Scanner;

public class FactorialRecursion{

    // Recursive method to calculate factorial
    public static int factorial(int n){

        // Base case
        if (n == 0 || n == 1){
            return 1;
        }

        // Recursive call
        return n * factorial(n - 1);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate factorial
        int result = factorial(number);

        // Display result
        System.out.println("Factorial of " + number + " is: " + result);
		
		sc.close();
    }
}
