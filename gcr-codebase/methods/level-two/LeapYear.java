import java.util.Scanner;

// Create LeapYear class to find the leap year 
public class LeapYear{

	// Method to determine leap year
	public static boolean isLeapYear(int year){
		if(year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            return true;
        }
		return false;
	}

	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for year
		int year = sc.nextInt();
		
		if(LeapYear.isLeapYear(year)){
			System.out.println("Leap year");
		}
		else{
			System.out.println("Not a Leap year");
		}
		
		// close the scanner stream
		sc.close();
	}
}