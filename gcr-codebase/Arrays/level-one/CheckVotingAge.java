import java.util.Scanner;

// Create CheckVotingAge Class to check whether a person can vote with respect to their age
public class CheckVotingAge{
	public static void main(String[] args){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Declare the Array
		int ages[] = new int[10];
		
		// Input the elements of the Array
		for(int i=0 ; i<10 ; i++){
			ages[i] = input.nextInt();
		}
		
		// Check Voting age for each person
		for(int i=0 ; i<ages.length ; i++){
			// Validate the user input age, if negative state invalid and exit 
			if(ages[i] < 0){
				System.err.println("Invalid age");
			}
			else{
				if(ages[i] >= 18){
					System.out.println("The student with the age " + ages[i] + " can vote");
				}
				else{
					System.out.println("The student with the age " + ages[i] + " cannot vote");
				}
			}
		}
		
		// Close the Scanner Object
		input.close();
	}
}