// Create DiscountedFeeComputation class to calculate discounted fee

public class DiscountedFeeComputation{
	public static void main(String[] args){

		int fee = 125000;
		int discountPercent = 10;

		// Calculate the discount amount
		int discount = fee / discountPercent;

		// Calculate the final discounted fee
		int discountedFee = fee - discount;

		System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}