import java.util.Scanner;

// Create SmallestLargestNumber class to find the smallest and the largest of the 3 numbers
public class SmallestLargestNumber{
	
	// Method to find smallest and the largest of the 3 numbers
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		if(number1 > number2){
			if(number1 > number3){
				largest = number1; 
			}
			else{
				largest = number3;
			}
		}
		else{
			if(number2 > number3){
				largest = number2; 
			}
			else{
				largest = number3;
			}
		}
		
		if(number1 < number2){
			if(number1 < number3){
				smallest = number1; 
			}
			else{
				smallest = number3;
			}
		}
		else{
			if(number2 < number3){
				smallest = number2; 
			}
			else{
				smallest = number3;
			}
		}
		
		return new int[]{smallest,largest};
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		// Get largest and smallest number
		int[] result = SmallestLargestNumber.findSmallestAndLargest(number1, number2, number3);
		System.out.println("Smallest : " + result[0] + "  Largest : " + result[1]);
		
		// close the scanner stream
		sc.close();
	}
}