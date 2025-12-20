import java.util.Scanner;

// Create SumOfNaturalNumber class to find the sum of n natural numbers
public class SumOfNaturalNumber{
	
	// Method to calculate the sum of n natural numbers using formula
	public int findSumUsingFormula(int number){
		int sum = (number * (number+1))/2;
		return sum;
	}
	
	// Method to calculate the sum of n natural numbers using rescursion
	public int findSumUsingRecursion(int number){
        if(number == 1){
            return 1; 
        }else{
            return number + findSumUsingRecursion(number - 1);
        }
    }
	
	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for number
		int number = sc.nextInt();
		
		SumOfNaturalNumber obj = new SumOfNaturalNumber();
		
		int sumUsingFormula = obj.findSumUsingFormula(number);
		int sumUsingRecursion = obj.findSumUsingRecursion(number);
		
		if(sumUsingFormula == sumUsingRecursion){
			System.out.println("Sum is -> " + sumUsingFormula + " ,Both the sum are equal");
		}
		else{
			System.out.println("Error!! sum is not same");
		}
		
		// close the scanner stream
		sc.close();
	}
}