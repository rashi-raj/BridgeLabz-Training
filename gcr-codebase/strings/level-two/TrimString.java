import java.util.Scanner;

// Create class TrimString
public class TrimString{

    // Method to find start and end index after trimming spaces
    public int[] findTrimIndexes(String s) {
	
        int start = 0;
        int end = s.length()-1;

        // Trim leading spaces
        while(start <= end && s.charAt(start) == ' '){
            start++;
        }

        // Trim trailing spaces
        while(end >= start && s.charAt(end) == ' '){
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public String createSubstring(String s, int start, int end){

        String result = "";

        for (int i = start; i <= end; i++){
            result += s.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public boolean compareStrings(String s1, String s2){

        if (s1.length() != s2.length()){
            return false;
        }

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String input = sc.nextLine();

        TrimString obj = new TrimString();

        // Manual trim using charAt()
        int[] indexes = obj.findTrimIndexes(input);
        String manualTrimmed =
                obj.createSubstring(input, indexes[0], indexes[1]);

        String builtInTrimmed = input.trim();

        System.out.println("\nManual Trimmed String   : \"" + manualTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");

        boolean isEqual = obj.compareStrings(manualTrimmed, builtInTrimmed);

        System.out.println("\nAre both strings equal? : " + isEqual);

        // Close scanner
        sc.close();
    }
}
