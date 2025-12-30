import java.util.Scanner;

/* 
Shopkeeper’s Discount Dashboard 
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

public class ShopkeeperDiscountDashboard{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to RMart Discount Dashboard");
		System.out.println("-----------------------------------");
		System.out.print("Enter the number of items : ");
		int n = sc.nextInt();
		
		double prices[] = new double[n];
		
		double sum = 0;
		
		for(int i=0 ; i<n ; i++){
			System.out.print("\nEnter item " + (i+1) + " price : ");
			prices[i] = sc.nextDouble();
			if(prices[i] <= 0){
				System.out.println("Enter a valid price");
				i--;
			}
		}
		
		for(int i=0 ; i<n ; i++){
			sum += prices[i];
		}
		
		System.out.println("Total amount : " + sum);
		
		if(sum>0){
			if(sum<1500){
				System.out.println("No discount applicable\nTotal Amount is Rs " + sum);
			}
			else if(sum>=1500 && sum<=3000){
				System.out.print("---------------------------------------");
				System.out.println("\nHurrahh! You have unlocked 5% discount");
				System.out.println("---------------------------------------");
				System.out.println("Discount on the purchased items will be : " +(sum * 0.05)+ "\nTotal Amount after discount is Rs " + sum * (1-0.05));
			
			}
			else if(sum>3000 && sum<=5000){
				System.out.print("---------------------------------------");
				System.out.println("\nHurrahh! You have unlocked 15% discount");
				System.out.println("---------------------------------------");
				System.out.println("Discount on the purchased items will be : " +(sum * 0.15)+ "\nTotal Amount after discount is Rs " + sum * (1-0.15));
			
			}
			else if(sum>5000 && sum<=10000){
				System.out.print("---------------------------------------");
				System.out.println("\nHurrahh! You have unlocked 30% discount");
				System.out.println("---------------------------------------");
				System.out.println("Discount on the purchased items will be : " +(sum * 0.3)+ "\nTotal Amount after discount is Rs " + sum * (1-0.3));
			}
			else{
				System.out.print("---------------------------------------");
				System.out.println("\nHurrahh! You have unlocked 50% discount");
				System.out.println("---------------------------------------");
				System.out.println("Discount on the purchased items will be : " +(sum * 0.5)+ "\nTotal Amount after discount is Rs " + sum * (1-0.5));
			}
		}else{
			System.out.println("Invalid total ");
		}
	}
}