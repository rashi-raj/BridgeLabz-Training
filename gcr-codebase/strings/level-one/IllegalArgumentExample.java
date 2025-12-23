import java.util.Scanner; 

// Create class IllegalArgumentExample to demonstrate IllegalArgumentException. 
public class IllegalArgumentExample{

	// Method to demonstrate IllegalArgumentException
	public void generateException(String text){
		
		try{
			String substr = text.substring(text.length(),0);
		}
		catch(IllegalArgumentException e){
			System.out.println("IllegalArgumentException occured " + e.getMessage());
		}
		catch(Exception e){
			System.out.println("Exception occured " + e.getMessage());
		}
		
	}
	
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string : ");
		String text = sc.next();
		
		IllegalArgumentExample obj = new IllegalArgumentExample();
		
		obj.generateException(text);
		
		// Close the scanner stream
		sc.close();

	}
}