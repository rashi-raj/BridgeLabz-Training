// Create ProfitLossComputation class to calculate profit and profit percentage

public class ProfitLossComputation{
	public static void main(String[] args){
		
		int costPrice = 129;
		int sellingPrice = 191;

		// Calculate the profit 
		int profit = sellingPrice - costPrice;

		// Calculate the profit percentage
		double profitPercentage = ((double) profit / costPrice) * 100;

		System.out.print("The Cost Price is INR " + costPrice + " Selling Price is INR " + sellingPrice +
		                 "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}