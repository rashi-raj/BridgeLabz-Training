import java.util.Scanner; 

// Create class UpperCase to convert the complete text to uppercase and compare the results
public class UpperCase{

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
	
	// Method to convert the string to uppercase using toUpperCase method
	public String toUpperCaseUsingMethod(String s){
		return s.toUpperCase();
	}
	
	// Method to convert the string to uppercase using charAt method
	public String toUpperCaseManually(String s){
		
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<s.length() ; i++){
			if(s.charAt(i) >=97 || s.charAt(i)<=122){
				sb.append((char)(s.charAt(i)-32));
			}else{
				sb.append(s.charAt(i));
			}
		}
		
		String result = new String(sb);
		
		return result;
	}
	
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get the inputs
		System.out.println("Enter the string : ");
		String s = sc.nextLine();
		
		UpperCase obj = new UpperCase();
		
		if(obj.isStringEqual(obj.toUpperCaseUsingMethod(s),obj.toUpperCaseManually(s))){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		//Close scanner stream
		sc.close();
	}
}