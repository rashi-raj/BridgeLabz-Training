import java.util.Scanner;

// Create VotingAge class to check whether a person can vote, depending on whether his/her age is gretaerr than or equal to 18
public class VotingAge{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for age
		int age = input.nextInt();
		
		// Check whether the person's age is greater than or equal to 18
		if(age >= 18) {
			System.out.println("The person's age is " +age+ " and can vote");
		}		
		else{
			System.out.println("The person's age is " +age+ " and cannot vote");
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}