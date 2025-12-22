import java.util.Scanner;

// Create NumberChecker utility class
public class NumberChecker{

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

    // Method to store digits of number in an array
    public static int[] storeDigits(int number){

        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count - 1;
        int temp = number;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index--;
        }

        return digits;
    }

    // Method to check if number is Duck Number
    public static boolean isDuckNumber(int[] digits){

        for (int i = 0; i < digits.length; i++){
            if (digits[i] != 0){
                return true;
            }
        }

        return false;
    }

    // Method to check if number is Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits){

        int power = digits.length;
        int sum = 0;

        for (int i = 0; i < digits.length; i++){
            sum += Math.pow(digits[i], power);
        }

        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++){

            if(digits[i] > largest){
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest){
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits){

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++){

            if(digits[i] < smallest){
                secondSmallest = smallest;
                smallest = digits[i];
            }
			else if (digits[i] < secondSmallest && digits[i] != smallest){
                secondSmallest = digits[i];
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args){
		// Create a Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int digitCount = countDigits(number);
        int[] digits = storeDigits(number);

        System.out.println("Count of digits: " + digitCount);

        System.out.print("Digits: ");
        for (int i = 0; i < digits.length; i++){
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number, digits));

        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);

        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);

		// Close Scanner Stream
        sc.close();
    }
}
