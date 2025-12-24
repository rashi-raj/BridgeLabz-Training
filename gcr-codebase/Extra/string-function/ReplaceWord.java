import java.util.Scanner;

public class ReplaceWord{

    // Custom method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord){

        String result = "";   
        int i = 0;

        while(i < sentence.length()){

            // Check if oldWord matches starting at position i
            if (i + oldWord.length() <= sentence.length() &&
                sentence.substring(i, i + oldWord.length()).equals(oldWord)) {

                // Append newWord instead of oldWord
                result += newWord;

                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();
        System.out.println("Enter the word to replace:");
        String oldWord = sc.next();
        System.out.println("Enter the new word:");
        String newWord = sc.next();

        // Call replaceWord method
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Print result
        System.out.println("Modified Sentence:");
        System.out.println(modifiedSentence);
		
		sc.close();
    }
}
