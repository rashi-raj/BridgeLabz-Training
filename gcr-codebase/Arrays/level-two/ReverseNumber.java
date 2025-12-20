import java.util.Scanner;

// Create ReverseNumber class to find the reverse of a number
public class ReverseNumber{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		// Copy the original number
		int copy = number;
		int count=0;
		
		// Count the digit
		while(number>0){
			int digit = number%10;
			count++;
			number /= 10;
		}
		
		int arr[] = new int[count];
		int index=0;
		
		// Assign the digits 
		while(copy>0){
			int digit = copy%10;
			arr[index] = digit;
			index++;
			copy /= 10;
		}
		
		for(int i=0 ; i<count ; i++){
			System.out.print(arr[i]);
		}
		
		// Close scanner stream
        input.close();
	}
}