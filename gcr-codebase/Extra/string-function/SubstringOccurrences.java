import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String args[]){

        // Create Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        System.out.println("Enter the substring : ");
        String substr = sc.next();

        int count = 0;  

        // Loop through the main string
        for (int i = 0; i <= s.length() - substr.length(); i++) {

            int j;

            // Check character by character for substring match
            for (j = 0; j < substr.length(); j++) {

                if (s.charAt(i + j) != substr.charAt(j)) {
                    break;
                }
            }

            if (j == substr.length()) {
                count++;
            }
        }

        // Display the total count of substring occurrences
        System.out.println("Substring occurs " + count + " times.");
		
		sc.close();
    }
}
