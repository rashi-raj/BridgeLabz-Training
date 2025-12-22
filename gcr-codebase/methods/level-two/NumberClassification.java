import java.util.Scanner;

// Create NumberClassification Class to take user input for 5 numbers and check whether a number is positive or negative. 
// Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less

public class NumberClassification{

	// Method to Check whether the number is positive or negative
	public static boolean isPositive(int num){
		if(num>0){
			return true;
		}
		return false;
	}
	
	// Method to check whether the number is even or odd
	public static boolean isEven(int num){
		if(num % 2==0){ 
			return true;
		}
		return false;
	}
	
	// Method to compare two numbers
	public static int compare(int num1 , int num2){
		if(num1 > num2) {
			return 1;
		}
		else if(num1 < num2){
			return -1;
		}
		else return 0;
	}
	
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Declare the Array
		int arr[] = new int[5];
		
		// Input the elements of the Array
		for(int i=0 ; i<arr.length ; i++){
			arr[i] = input.nextInt();
		}
		
		for(int i=0 ; i<arr.length ; i++){
			if(NumberClassification.isPositive(arr[i])){
				if(NumberClassification.isEven(arr[i])){
					System.out.println(arr[i] + " is an even number");
				}
				else{
					System.out.println(arr[i] + " is an odd number");
				}
			}
			else{
				System.out.println(arr[i] + " is negative number");
			}
		}
		
		if(NumberClassification.compare(arr[0] , arr[arr.length-1]) == 1){
			System.out.println("First element is greater than last element");
		}
		else if(NumberClassification.compare(arr[0] , arr[arr.length-1]) == -1){
			System.out.println("First element is smaller than last element");
		}
		else{
			System.out.println("First element is equal to last element");
		}
		
		// Close the Scanner Object
		input.close();
		
	}
}