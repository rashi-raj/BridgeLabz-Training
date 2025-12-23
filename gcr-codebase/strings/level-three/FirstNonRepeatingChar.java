import java.util.Scanner;

public class FirstNonRepeatingChar{

    // Method to find first non-repeating character
    public static char findFirstNonRepeating(String text){

        // Array to store frequency of ASCII characters
        int[] freq = new int[256];

        // Count frequency of each character
        for(int i=0; i < text.length(); i++){
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find first character with frequency = 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character found
        return '\0';
    }

    // Main method
    public static void main(String[] args) {

		// Create scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);
		
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
		
		// Close scanner stream
        sc.close();
    }
}
