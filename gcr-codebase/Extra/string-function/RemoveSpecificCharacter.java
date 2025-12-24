import java.util.Scanner;

public class RemoveSpecificCharacter{
    public static void main(String[] args){

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read the input string
        System.out.println("Enter the string:");
        String s = sc.nextLine();

        // Read the character to be removed
        System.out.println("Enter the character to remove:");
        char ch = sc.next().charAt(0);

        StringBuilder result = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ch) {
                result.append(s.charAt(i));
            }
        }

        System.out.println("Modified String: \"" + result.toString() + "\"");
		
		sc.close();
    }
}
