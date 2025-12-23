import java.util.Scanner; 

// Create class NullPointerExceptionExample to demonstrate NullPointerException. 
public class NullPointerExceptionExample{

	// Method to demonstrate NullPointerException
	public void generateException(String text){
		
		try{
			text.charAt(0);
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException occured " + e.getMessage());
		}
		catch(Exception e){
			System.out.println("Exception occured " + e.getMessage());
		}
		
	}
	
	public static void main(String args[]){
		// Define the variable text and initialize it to null
		String text = null;
		
		NullPointerExceptionExample obj = new NullPointerExceptionExample();
		
		obj.generateException(text);

	}
}