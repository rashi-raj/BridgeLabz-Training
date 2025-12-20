import java.util.Scanner;

// Create Factors class to to find the factors of a number taken as user input and do some operations on it
public class Factors{

	// Calculate factors of a number
	public static int[] findFactors(int number){
		int totalFactors = 0;
		for(int i=1 ; i<number ; i++){
			if(number%i==0){
				totalFactors++;
			}
		}
		
		// Declare the array for factors
		int factorArray[] = new int[totalFactors];
		
		int index=0;
		for(int i=1 ; i<number ; i++){
			if(number%i==0){
				factorArray[index] = i;
				index++;
			}
		}
		
		return factorArray;
	}
	
	// Method to find the sum of FactorArray
	public static int sumOfFactors(int[] factorArray){
		int sum = 0;
		for(int i=1; i<factorArray.length ; i++){
			sum += factorArray[i];
		}
		return sum;
	}
	
	// Method to find the product of FactorArray
	public static int productOfFactors(int[] factorArray){
		int product = 1;
		for(int i=1; i<factorArray.length ; i++){
			product *= factorArray[i];
		}
		return product;
	}
	
	// Method to find the sum of squares of FactorArray
	public static int sumOfSquaresOfFactors(int[] factorArray){
		int sumOfSquares = 0;
		for(int i=1; i<factorArray.length ; i++){
			sumOfSquares += factorArray[i] * factorArray[i];
		}
		return sumOfSquares;
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get number as input
		int number = sc.nextInt(); 
		
		int[] factorArray = Factors.findFactors(number);
		
		System.out.println("Sum of factors : " + Factors.sumOfFactors(factorArray));
		System.out.println("Product of factors : " + Factors.productOfFactors(factorArray));
		System.out.println("Sum of Squares of factors : " + Factors.sumOfSquaresOfFactors(factorArray));
		
		// close the scanner stream
		sc.close();
	}
}