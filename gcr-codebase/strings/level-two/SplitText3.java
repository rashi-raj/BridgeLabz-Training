import java.util.Scanner;

// Create class SplitText
public class SplitText3{

    // Method to find string length without using length()
    public int findStringLength(String s){
        int i = 0;
        int length = 0;
        try{
            while (true){
                s.charAt(i++);
                length++;
            }
        } catch (Exception e){
        }
        return length;
    }

    // Method to split text into words without using split()
    public String[] splitWords(String s){

        int length = findStringLength(s);
        int wordCount = 1;

        for (int i = 0; i < length; i++){
            if (s.charAt(i) == ' '){
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++){
            if (s.charAt(i) != ' '){
                word += s.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; // last word

        return words;
    }

    // Method to create 2D array of word and its length
    public String[][] createWordLengthArray(String[] words){

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++){
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findStringLength(words[i]));
        }

        return result;
    }

    // Method to find shortest and longest string lengths
    public int[] findShortestAndLongest(String[][] data){

        int shortestIndex = 0;
        int longestIndex = 0;

        int minLength = Integer.parseInt(data[0][1]);
        int maxLength = Integer.parseInt(data[0][1]);

        for (int i = 1; i < data.length; i++) {
            int length = Integer.parseInt(data[i][1]);

            if (length < minLength){
                minLength = length;
                shortestIndex = i;
            }

            if (length > maxLength){
                maxLength = length;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String args[]){

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = sc.nextLine();

        SplitText3 obj = new SplitText3();

        String[] words = obj.splitWords(text);

        String[][] wordLength = obj.createWordLengthArray(words);

        // Find shortest and longest
        int[] result = obj.findShortestAndLongest(wordLength);

        System.out.println("\nShortest Word : " +
                wordLength[result[0]][0] +
                " (Length = " + wordLength[result[0]][1] + ")");

        System.out.println("Longest Word  : " +
                wordLength[result[1]][0] +
                " (Length = " + wordLength[result[1]][1] + ")");

        // Close scanner
        sc.close();
    }
}
