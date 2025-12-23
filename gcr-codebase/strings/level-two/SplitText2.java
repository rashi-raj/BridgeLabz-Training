import java.util.Scanner;

// Create class SplitText
public class SplitText2{

    // Method to find string length without using length()
    public int findStringLength(String s){
	
        int i=0;
		int length=0;
		try{
			while(true){
				s.charAt(i++);
				length++;
			}
		}
		catch(Exception e){
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
            }else{
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; 

        return words;
    }

    // Method to create 2D array of word and its length
    public String[][] wordLength2DArray(String[] words){

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++){
            result[i][0] = words[i]; 
            result[i][1] = String.valueOf(findStringLength(words[i])); 
        }

        return result;
    }

    public static void main(String args[]){

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter the text:");
        String text = sc.nextLine();

        SplitText2 obj = new SplitText2();

        String[] words = obj.splitWords(text);

        String[][] wordLength = obj.wordLength2DArray(words);

        // Display result in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < wordLength.length; i++){
            String word = wordLength[i][0];
            int length = Integer.parseInt(wordLength[i][1]); 
            System.out.println(word + "\t" + length);
        }

        // Close scanner
        sc.close();
    }
}
