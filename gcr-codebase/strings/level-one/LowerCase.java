import java.util.Scanner; 

// Create class LowerCase to convert the complete text to lowercase and compare the results
public class LowerCase{

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
	
	// Method to convert the string to lowercase using toLowerCase method
	public String toLowerCaseUsingMethod(String s){
		return s.toLowerCase();
	}
	
	// Method to convert the string to lowercase using charAt method
	public String toLowerCaseManually(String s){
		
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<s.length() ; i++){
			if(s.charAt(i) >=65 || s.charAt(i)<=90){
				sb.append((char)(s.charAt(i)+32));
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
		
		LowerCase obj = new LowerCase();
		
		if(obj.isStringEqual(obj.toLowerCaseUsingMethod(s),obj.toLowerCaseManually(s))){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		//Close scanner stream
		sc.close();
	}
}