import java.util.Scanner;

public class CharacterFrequencyUsingUnique{

    // Method 1: Find unique characters using nested loops
    public static char[] uniqueCharacters(String text){

        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++){
            char current = text.charAt(i);
            boolean isUnique = true;

            // Check if character appeared before
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)){
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        // Create exact-sized array
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++){
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method 2: Find frequency using unique characters
    public static String[][] findFrequency(String text){

        // ASCII frequency array
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++){
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create 2D array [character, frequency]
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++){
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencyData = findFrequency(input);

        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequencyData.length; i++){
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }

        sc.close();
    }
}
