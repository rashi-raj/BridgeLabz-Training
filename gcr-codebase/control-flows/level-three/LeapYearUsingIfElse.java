import java.util.Scanner;

// Create LeapYearUsingIfElse class to find year is a leap year or not
public class LeapYearUsingIfElse {
    public static void main(String[] args) {
		// Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get input for year
        int year = input.nextInt();

        // Check Gregorian calendar validity
        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
        }
        else if (year % 400 == 0) {
            System.out.println("Leap Year");
        }
        else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        }
        else if (year % 4 == 0) {
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }

        // Closing the Scanner Stream
		input.close();
    }
}
