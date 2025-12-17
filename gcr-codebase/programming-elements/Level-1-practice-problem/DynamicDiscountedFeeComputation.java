// Import Scanner class to take input from the user
import java.util.Scanner;

// Create DynamicDiscountedFeeComputation class to calculate discounted fee using user input

public class DynamicDiscountedFeeComputation{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int fee = input.nextInt();
		int discountPercent = input.nextInt();

        // Calculate the discount
		int discount = fee / discountPercent;

		// Calculate the final fee after applying the discount
		int discountedFee = fee - discount;

		System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}