import java.util.Scanner; 

// Create class NumberFormatExample to demonstrate NumberFormatException. 
public class NumberFormatExample{

	// Method to demonstrate NumberFormatException
	public void generateException(String text){
		
		try{
			int num = Integer.parseInt(text);
		}
		catch(NumberFormatException e){
			System.out.println("NumberFormatException occured " + e.getMessage());
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
		
		NumberFormatExample obj = new NumberFormatExample();
		
		obj.generateException(text);
		
		// Close the scanner stream
		sc.close();

	}
}