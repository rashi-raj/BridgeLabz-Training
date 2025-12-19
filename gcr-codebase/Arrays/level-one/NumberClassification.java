import java.util.Scanner;

// Create NumberClassification Class to check whether a number is positive, negative, or zero. 
// Further for positive numbers check if the number is even or odd. 
// Finally compare the first and last elements of the array and display if they equal, greater or less

public class NumberClassification{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Declare the Array
		int arr[] = new int[5];
		
		// Input the elements of the Array
		for(int i=0 ; i<5 ; i++){
			arr[i] = input.nextInt();
		}
		
		// check whether a number is positive, negative, or zero and for positive numbers check if the number is even or odd. 
		for(int i=0 ; i<arr.length ; i++){
			if(arr[i] > 0){
				if(arr[i] % 2 == 0){
					System.out.println(arr[i] + " is an even number");
				}
				else{
					System.out.println(arr[i] + " is an odd number");
				}
			}
			else if(arr[i] < 0){
				System.out.println(arr[i] + " is a negative number");
			}
			else{
				System.out.println("Number is zero");
			}
		}
		
		// Comparing the first and last element of the array and displaying the result
		if(arr[0] > arr[arr.length-1]){
			System.out.println("First element is greater than the last element");
		}
		else if(arr[0] < arr[arr.length-1]){
			System.out.println("First element is smaller than the last element");
		}
		else{
			System.out.println("First element and last element are equal");
		}
		
		// Close the Scanner Object
		input.close();
		
	}
}