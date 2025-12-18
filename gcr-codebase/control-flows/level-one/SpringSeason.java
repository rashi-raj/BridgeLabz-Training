import java.util.Scanner;

// Create SpringSeason class that prints whether it is a Spring Season or not
public class SpringSeason{
    public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get two input values for month and date
		int month = input.nextInt();
		int date = input.nextInt();
		
		// Check whether month and day lie in the range of Spring Season
		if(month == 3 && date >= 20){
			System.out.println("It's a spring season");
		}
		else if(month == 4 && date >= 1 && date <= 30 || month == 5 && date >= 1 && date <= 31) {
			System.out.println("It's a spring season");
		}
		else if(month == 6 && date <= 20){
			System.out.println("It's a spring season");
		}
		else{
			System.out.println("Not a spring season");
		}
		
		// Closing the Scanner Stream
		input.close();
	}	
}