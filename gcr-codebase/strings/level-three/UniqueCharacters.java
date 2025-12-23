import java.util.Scanner;

public class UniqueCharacters{

    // Find length without using length()
    public static int findLength(String text){
        int count = 0;
        try{
            while (true){
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Find unique characters using charAt()
    public static char[] findUniqueCharacters(String text){

        int length = findLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i=0; i < length; i++){
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop to compare with previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique){
                temp[uniqueCount++] = current;
            }
        }

        // Create array for unique characters
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++){
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Main method
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueCharacters = findUniqueCharacters(input);

        System.out.println("\nUnique Characters:");
        for (char ch : uniqueCharacters){
            System.out.print(ch + " ");
        }

        sc.close();
    }
}
