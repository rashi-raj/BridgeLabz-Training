import java.util.Scanner;

// Create class CharacterType
public class CharacterType{

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    public String checkCharacter(char ch){

        // Convert uppercase to lowercase using ASCII values
        if(ch >= 'A' && ch <= 'Z'){
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if(ch >= 'a' && ch <= 'z'){

            if(ch == 'a' ||ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u'){
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to find character type for each character in the string
    public String[][] findCharacterTypes(String text){

        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++){
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacter(ch);
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public void displayTable(String[][] data) {

        System.out.println("\nCharacter\tType");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        CharacterType obj = new CharacterType();

        // Find character types
        String[][] result = obj.findCharacterTypes(input);

        obj.displayTable(result);

        // Close scanner
        sc.close();
    }
}
