import java.util.Scanner;

public class CharFrequencyNested{

    // Method to find character frequency using nested loops
    public static String[] findFrequency(String text){

        // Convert string to character array
        char[] chars = text.toCharArray();
        int length = chars.length;
		
        int[] freq = new int[length];

        // Step 1: Calculate frequency using nested loops
        for (int i = 0; i < length; i++){
            freq[i] = 1;

            // Skip already counted characters
            if (chars[i] == '0'){
                continue;
            }

            for (int j = i + 1; j < length; j++){
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++){
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Store result in 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < length; i++){
            if (chars[i] != '0') {
                result[index++] = chars[i] + " = " + freq[i];
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args){
		
		// Create Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] frequency = findFrequency(input);

        System.out.println("\nCharacter Frequency:");
        for (String data : frequency){
            System.out.println(data);
        }
		
		// Close scanner stream
        sc.close();
    }
}
