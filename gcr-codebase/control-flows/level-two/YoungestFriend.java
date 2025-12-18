import java.util.Scanner;

// Create YoungestFriend class to find the youngest friends among 3 based on their ages and the tallest among the friends based on their heights
public class YoungestFriend{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get the input for ages and heights
		int amarAge = input.nextInt();
		int akbarAge = input.nextInt();
		int anthonyAge = input.nextInt();
		double amarHeight = input.nextDouble();
		double akbarHeight = input.nextDouble();
		double anthonyHeight = input.nextDouble();
		
		// Find the youngest one
		if(amarAge < akbarAge){
			if(amarAge < anthonyAge){
				System.out.println("Amar is the youngest one");
			}
			else{
				if(akbarAge < anthonyAge){
					System.out.println("Akbar is the youngest one");
				}
				else{
					System.out.println("Anthony is the youngest one");
				}
			}
		}
		else{
			if(akbarAge < anthonyAge){
				System.out.println("Akbar is the youngest one");
			}
			else{
				if(anthonyAge < amarAge){
					System.out.println("Anthony is the youngest one");
				}
				else{
					System.out.println("Amar is the youngest one");
				}
			}
		}
		
		// Find the tallest one
		if(amarHeight > akbarHeight){
			if(amarHeight > anthonyHeight){
				System.out.println("Amar is the tallest one");
			}
			else{
				if(akbarHeight > anthonyHeight){
					System.out.println("Akbar is the tallest one");
				}
				else{
					System.out.println("Anthony is the tallest one");
				}
			}
		}
		else{
			if(akbarHeight > anthonyHeight){
				System.out.println("Akbar is the tallest one");
			}
			else{
				if(anthonyHeight > amarHeight){
					System.out.println("Anthony is the tallest one");
				}
				else{
					System.out.println("Amar is the tallest one");
				}
			}
		}
		
		// Closing the Scanner Stream
		input.close();
		
	}
}