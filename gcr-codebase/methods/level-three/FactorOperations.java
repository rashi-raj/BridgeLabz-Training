import java.util.Scanner;

// Create FactorOperations utility class
public class FactorOperations{

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {

        // First loop: count factors
        int count = 0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                count++;
            }
        }

        // Create array of required size
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= number; i++){
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Method to find the greatest factor using factors array
    public static int findGreatestFactor(int[] factors){

        int greatest = factors[0];

        for (int i = 1; i < factors.length; i++){
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }

        return greatest;
    }

    // Method to find sum of factors using factors array
    public static int findSumOfFactors(int[] factors){

        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    // Method to find product of factors using factors array
    public static long findProductOfFactors(int[] factors) {

        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    // Method to find product of cube of factors using Math.pow()
    public static double findProductOfCubeOfFactors(int[] factors) {

        double product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }

        return product;
    }

    public static void main(String[] args) {
		// create scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println("\nGreatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

		// close scanner stream
        sc.close();
    }
}
