import java.util.Scanner;

// Create StoreDigits class to store the digits of the number in an array and find the largest and second largest element of the array.
public class StoreDigits{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int maxDigit = 10;
		int array[] = new int[maxDigit];
		int index=0;
		
		// Store each digit into array
		while(number>0){
			int digit = number%10;
			array[index] = digit;
			index++;
			if(index == maxDigit){
				break;
			}
			number = number/10;
		}
		
		int largestDigit = Integer.MIN_VALUE;
		int smallestDigit = Integer.MAX_VALUE; 
		
		// Find the largest and smallest element
		for(int i=0 ; i<index ; i++){
			if(largestDigit < array[i]){
				largestDigit = array[i];
			}
			if(smallestDigit > array[i]){
				smallestDigit = array[i];
			}
		}
		
		System.out.println("Largest digit : " +largestDigit + "\nSmallest digit : " + smallestDigit);
		
		// Close scanner stream
        input.close();
	}
}