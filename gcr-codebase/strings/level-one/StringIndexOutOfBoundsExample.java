import java.util.Scanner; 

// Create class StringIndexOutOfBoundsExample to demonstrate StringIndexOutOfBoundsException. 
public class StringIndexOutOfBoundsExample{

	// Method to demonstrate StringIndexOutOfBoundsException
	public void generateException(String text){
		
		try{
			for(int i=0 ; i<=text.length() ; i++){
				System.out.println(text.charAt(i));
			}
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException occured " + e.getMessage());
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
		
		StringIndexOutOfBoundsExample obj = new StringIndexOutOfBoundsExample();
		
		obj.generateException(text);
		
		// Close the scanner stream
		sc.close();

	}
}