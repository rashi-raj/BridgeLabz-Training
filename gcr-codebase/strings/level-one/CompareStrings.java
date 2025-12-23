import java.util.Scanner; 

// Create class CompareStrings to compare two strings using the charAt() method and check the result with the built-in String equals() method
public class CompareStrings{

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
	
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two strings : ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		CompareStrings obj = new CompareStrings();
		
		if(obj.isStringEqual(s1,s2)){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		//Close scanner stream
		sc.close();
	}
}