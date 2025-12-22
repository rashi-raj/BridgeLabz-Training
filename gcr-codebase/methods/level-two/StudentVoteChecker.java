import java.util.Scanner;

// Create StudentVoteChecker class to take user input for the age of all 10 students in a class and check whether the student 
// can vote depending on his/her age is greater or equal to 18.
public class StudentVoteChecker{

	// Method to determine the voting age of students
	public static boolean canStudentVote(int age){
	
		if(age>=18){
			return true;
		}
		
		return false;
	}

	public static void main(String args[]){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
			
		int arr[] = new int[10];
		
		// Get inputs
		for(int i=0 ; i<10 ; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<10 ; i++){
			if(StudentVoteChecker.canStudentVote(arr[i])){
				System.out.println("Student with age " + arr[i] + " can vote");
			}
			else{
				System.out.println("Student with age " + arr[i] + " cannot vote");
			}
		}
		
		// close the scanner stream
        sc.close();
	}
}