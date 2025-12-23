import java.util.Scanner; 

// Create class FindLength to convert the complete text to lowercase and compare the results
public class FindLength{

	// Method to find string length using method
	public int stringLengthUsingMethod(String s){
		return s.length();
		
	}
	
	// Method to find string length 
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
	
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get the inputs
		System.out.println("Enter the string : ");
		String s = sc.next();
		
		FindLength obj = new FindLength();
		
		System.out.println("String length using function : " + obj.stringLengthUsingMethod(s));
		System.out.println("Manually calculated string length : " + obj.findStringLength(s));
		
		//Close scanner stream
		sc.close();
	}
}