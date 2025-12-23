import java.util.Scanner;

// Create PalindromeCheck class to determine pallindrome
public class PalindromeCheck{

    // Iterative method using start and end index
    public static boolean isPalindromeIterative(String text){

        int start = 0;
        int end = text.length() - 1;

        while (start < end){
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end){

        if (start >= end){
            return true;
        }

        if (text.charAt(start) != text.charAt(end)){
            return false;
        }

        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static char[] reverseString(String text){

        int length = text.length();
        char[] reverse = new char[length];
        int index = 0;

        for (int i = length - 1; i >= 0; i--){
            reverse[index++] = text.charAt(i);
        }

        return reverse;
    }

    // Palindrome check using character arrays
    public static boolean isPalindromeUsingArray(String text){

        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

		// Create Scanner object
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the text: ");
        String input = sc.nextLine();

        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeUsingArray(input);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative)   : " + result1);
        System.out.println("Logic 2 (Recursive)  : " + result2);
        System.out.println("Logic 3 (Array)      : " + result3);

		// Close Scanner Stream
        sc.close();
    }
}
