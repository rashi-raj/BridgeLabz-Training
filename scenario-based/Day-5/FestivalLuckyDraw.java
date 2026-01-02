/*
20. Festival Lucky Draw 
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class FestivalLuckyDraw{
	public static void main(String[] args){
	    // Create Scanner object 
		Scanner sc = new Scanner(System.in);
		int visitor = 1;
		
		System.out.println("--------------------------");
        System.out.println("   Festival Lucky Draw   ");
        System.out.println("--------------------------");
		System.out.println("Visitor 1 -> ");
		
		while(true){
			System.out.println("\nDraw a number (1-1000): ");
			int num = sc.nextInt();
			
			visitor++;
			if(num<=0 || num>1000) continue;
			else{
				if(num%3 == 0 && num%5 == 0){
					System.out.println("*** Yohoooooo!!!!! You won a gift ***\n");
				}
				else System.out.println("Oops!! Better luck next time\n");
			}
			System.out.println("Is there another visitor(Yes/No) : ");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("yes")){
				System.out.println("\nVisitor " + visitor + " -> ");
			}else{
				System.out.println("Thanks");
				break;
			}
		}
		
		// Close scanner object
		sc.close();
	}
}


