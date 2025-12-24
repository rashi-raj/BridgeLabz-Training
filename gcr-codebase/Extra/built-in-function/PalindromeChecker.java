import java.util.Scanner;

public class PalindromeChecker{

    // Method to check if string is palindrome
    public static boolean isPalindrome(String s){

        int start = 0;
        int end = s.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Check palindrome
        if (isPalindrome(s)){
            System.out.println("The string is a Palindrome.");
        }else{
            System.out.println("The string is NOT a Palindrome.");
        }
		
		sc.close();
    }
}
