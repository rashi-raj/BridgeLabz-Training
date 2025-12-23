import java.util.Scanner;

// Create class VowelConsonant
public class VowelConsonant{

    // Method to check whether a character is Vowel, Consonant or Not a Letter
    public String checkCharacter(char ch){

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch + 32);
        }

        if (ch >= 'a' && ch <= 'z'){

            if(ch == 'a' || ch == 'e' ||ch == 'i' || ch == 'o' ||ch == 'u'){
                return "Vowel";
            }else{
                return "Consonant";
            }
        }
		
        return "Not a Letter";
    }

    // Method to find vowels and consonants in a string
    public int[] findVowelsAndConsonants(String text){

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if(result.equals("Vowel")){
                vowels++;
            } 
			else if (result.equals("Consonant")){
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args){

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        VowelConsonant obj = new VowelConsonant();

        // Get vowel and consonant count
        int[] count = obj.findVowelsAndConsonants(input);

        System.out.println("\nVowels Count      : " + count[0]);
        System.out.println("Consonants Count : " + count[1]);

        // Close scanner
        sc.close();
    }
}
