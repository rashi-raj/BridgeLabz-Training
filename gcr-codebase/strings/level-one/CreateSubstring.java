import java.util.Scanner; 

// Create class CreateSubstring to compare two strings using the charAt() method and check the result with the built-in String equals() method
public class CreateSubstring{

	// Method to compare strings
	public boolean isStringEqual(String s1, String s2){
	
		if(s1.length()!=s2.length()) return false;
		for(int i=0 ; i<s1.length() ; i++){
			if(s1.charAt(i) != s2.charAt(i)){
				return false;
			}
		}
		return true;
		
	}
	
	// Method to create substrings
	public String createSubstring(int start, int end, String s){
		return s.substring(start,end);
	}
	
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get the inputs
		System.out.println("Enter the string : ");
		String s = sc.next();
		System.out.println("Enter the start and end index of the substring");
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		CreateSubstring obj = new CreateSubstring();
		
		if(obj.isStringEqual(s,obj.createSubstring(start, end, s))){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		//Close scanner stream
		sc.close();
	}
}