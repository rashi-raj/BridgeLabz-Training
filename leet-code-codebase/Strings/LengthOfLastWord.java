import java.util.Scanner;

// Create class LengthOfLastWord to find the length of the last word in a string
class LengthOfLastWord{

	// Create method to find the length of the last word in a string
    public static int lengthOfLastWord(String s){
        String arr[] = s.split(" ");
        return arr[arr.length-1].length();
    }
	
	public static void main(String[] args){
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(LengthOfLastWord.lengthOfLastWord(s));
		
		// Close scanner stream
		sc.close();
	}
}