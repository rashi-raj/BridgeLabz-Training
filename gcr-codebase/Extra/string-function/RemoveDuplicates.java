import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters from a string
    public static String removeDuplicates(String s) {

        StringBuilder result = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            boolean isDuplicate = false;

            // Check if the character already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result.append(currentChar);
            }
        }

        // Convert StringBuilder to String and return
        return result.toString();
    }

    public static void main(String args[]) {

        // Scanner to take input
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(RemoveDuplicates.removeDuplicates(s));
    }
}
