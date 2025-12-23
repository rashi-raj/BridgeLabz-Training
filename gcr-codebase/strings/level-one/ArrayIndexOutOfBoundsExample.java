import java.util.Scanner; 

// Create class ArrayIndexOutOfBoundsExample to demonstrate ArrayIndexOutOfBoundsException. 
public class ArrayIndexOutOfBoundsExample{

	// Method to demonstrate ArrayIndexOutOfBoundsException
	public void generateException(String names[]){
		
		try{
			for(int i=0 ; i<=5 ; i++){
				System.out.println(names[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException occured " + e.getMessage());
		}
		catch(Exception e){
			System.out.println("Exception occured " + e.getMessage());
		}
		
	}
	
	public static void main(String args[]){
		// Create Scanner object
		Scanner sc = new Scanner(System.in);
		
		String names[] = new String[5];
		
		for(int i=0 ; i<5 ; i++){
			names[i] = sc.next();
		}
		
		ArrayIndexOutOfBoundsExample obj = new ArrayIndexOutOfBoundsExample();
		
		obj.generateException(names);
		
		// Close the scanner stream
		sc.close();
		
	}
}