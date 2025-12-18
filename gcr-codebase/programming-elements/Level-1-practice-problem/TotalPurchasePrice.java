// import scanner class to take input from the user
import java.util.Scanner;

// create class TotalPurchasePrice
public class TotalPurchasePrice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double unitPrice = input.nextDouble();
		int quantity = input.nextInt();
		
		// calculate total price
		double totalPrice = unitPrice * quantity;
		
		System.out.print("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
		input.close();
	}
}