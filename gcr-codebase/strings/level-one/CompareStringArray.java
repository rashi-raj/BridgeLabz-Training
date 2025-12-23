import java.util.Scanner; 

// Create class CompareStringArray to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
public class CompareStringArray{

	public char[] createArray(String s){
		char charArray[] = new char[s.length()];
		
		for(int i=0 ; i<s.length() ; i++){
			charArray[i] = s.charAt(i);
		}
		
		return charArray;
	}
	
	public char[] createArrayUsingFunction(String s){
		return s.toCharArray();
	}

	// Method to compare strings
	public boolean isStringEqual(char s1[], char s2[]){
	
		if(s1.length!=s2.length) return false;
		for(int i=0 ; i<s1.length ; i++){
			if(s1[i] != s2[i]){
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		CompareStringArray obj = new CompareStringArray();
		
		if(obj.isStringEqual(obj.createArray(s),obj.createArrayUsingFunction(s))){
			System.out.println("Both the char arrays are equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		//Close scanner stream
		sc.close();
	}
}