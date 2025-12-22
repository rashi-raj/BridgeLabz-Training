import java.util.Scanner;

// Create UpdatedNumberChecker utility class
public class NumberChecker3{

    // Method to find count of digits
    public static int countDigits(int number){

        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    // Method to store digits in an array
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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits){

        int[] reversed = new int[digits.length];

        int index = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed[index] = digits[i];
            index++;
        }

        return reversed;
    }

    // Method to compare two arrays
    public static boolean compareArrays(int[] arr1, int[] arr2){

        if (arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }

        return true;
    }

    // Method to check if number is Palindrome
    public static boolean isPalindrome(int[] digits){

        int[] reversed = reverseDigitsArray(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if number is Duck Number
    // Duck number has at least one non-zero digit
    public static boolean isDuckNumber(int[] digits){

        for (int i = 0; i < digits.length; i++){
            if (digits[i] != 0){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args){

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

        int[] reversed = reverseDigitsArray(digits);

        System.out.print("Reversed digits: ");
        for (int i = 0; i < reversed.length; i++){
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        System.out.println("Arrays equal: " + compareArrays(digits, reversed));
        System.out.println("Is Palindrome Number: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));

        // Close Scanner Stream
        sc.close();
    }
}
