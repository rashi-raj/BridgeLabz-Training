import java.util.Scanner;

public class CharacterFrequency{

    // Method to find character frequencies and return 2D array
    public static String[][] findFrequency(String text){

        // Frequency array for all ASCII characters
        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                uniqueCount++;
                freq[ch] = -freq[ch]; 
            }
        }

        // Step 3: Create 2D array for character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Reset frequency array
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 4: Store characters and frequencies
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0; 
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] frequencyData = findFrequency(input);

        System.out.println("\nCharacter\tFrequency");
        for (int i = 0; i < frequencyData.length; i++) {
            System.out.println(frequencyData[i][0] + "\t\t" + frequencyData[i][1]);
        }

        sc.close();
    }
}
