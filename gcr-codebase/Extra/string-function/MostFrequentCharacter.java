import java.util.Scanner;

public class MostFrequentCharacter{
    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();

        int maxCount = 0;          
        char mostFrequent = ' ';  

        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            int count = 0;

            // Count frequency of current character
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentChar;
            }
        }

        // Display the result
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
		
		sc.close();
    }
}
