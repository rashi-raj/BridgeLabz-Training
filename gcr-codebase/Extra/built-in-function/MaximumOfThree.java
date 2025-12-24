import java.util.Scanner;

public class MaximumOfThree{

    // Method to take three integer inputs from the user
    public static int[] takeInput(Scanner sc) {
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = sc.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = sc.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = sc.nextInt();

        return numbers;
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];

        // Compare remaining numbers with max
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        int[] numbers = takeInput(sc);

        int maxValue = findMaximum(numbers);

        System.out.println("Maximum of the three numbers is: " + maxValue);
		
		sc.close();
    }
}
