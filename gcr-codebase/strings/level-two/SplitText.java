import java.util.Scanner;

// Create class SplitText
public class SplitText{

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
		int wordCount=1;
		
		for (int i = 0; i < length; i++) {
			if (s.charAt(i) == ' ') {
				wordCount++;
			}
		}
		
		String[] words = new String[wordCount];
		int index = 0;
		String word = "";
		
		for(int i=0; i<length ; i++){
			if(s.charAt(i) != ' '){
				word += s.charAt(i);
			}else{
				words[index++] = word;
				word = "";
        	}
		}
		words[index] = word;
		
		return words;
		
	}
	
	public boolean compareArrays(String[] arr1, String[] arr2){

        if (arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++){
            if (!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }

	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		SplitText obj = new SplitText();
		
        String[] manualWords = obj.splitWords(s);

        String[] builtInWords = s.split(" ");

        // Display manual split result
        System.out.println("\nManual Split Result:");
        for (String word : manualWords){
            System.out.println(word);
        }

        // Display built-in split result
        System.out.println("\nBuilt-in split() Result:");
        for (String word : builtInWords){
            System.out.println(word);
        }

        // Compare results
        boolean result = obj.compareArrays(manualWords, builtInWords);

        System.out.println("\nAre both results equal : " + result);

        // Close scanner
        sc.close();
	}
}