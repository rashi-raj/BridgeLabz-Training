import java.util.Scanner;

// Create NumberChecker utility class
public class NumberChecker2{

    // Method to find count of digits
    public static int countDigits(int number){
        int count = 0;
        int temp = number;

        while (temp != 0){
            count++;
            temp /= 10;
        }
        return count;
    }

    // Method to store digits in array
    public static int[] storeDigits(int number){
        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count - 1;
        int temp = number;

        while (temp != 0){
            digits[index] = temp % 10;
            temp /= 10;
            index--;
        }

        return digits;
    }

    // Method to find sum of digits
    public static int findSumOfDigits(int[] digits){
        int sum = 0;

        for (int i = 0; i < digits.length; i++){
            sum += digits[i];
        }

        return sum;
    }

    // Method to find sum of squares of digits
    public static double findSumOfSquares(int[] digits){
        double sum = 0;

        for (int i = 0; i < digits.length; i++){
            sum += Math.pow(digits[i], 2);
        }

        return sum;
    }

    // Method to check if number is Harshad number
    public static boolean isHarshadNumber(int number, int[] digits){
        int sum = findSumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] findDigitFrequency(int[] digits){

        int[][] frequency = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++){
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        // Count frequency
        for (int i = 0; i < digits.length; i++){
            frequency[digits[i]][1]++;
        }

        return frequency;
    }

    public static void main(String[] args){
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + countDigits(number));

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++){
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        int sumDigits = findSumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        System.out.println("Sum of squares of digits: " + findSumOfSquares(digits));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        int[][] freq = findDigitFrequency(digits);

        System.out.println("\nDigit  Frequency");
        for (int i = 0; i < freq.length; i++){
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + "      " + freq[i][1]);
            }
        }

		// Close Scanner stream
        sc.close();
    }
}
