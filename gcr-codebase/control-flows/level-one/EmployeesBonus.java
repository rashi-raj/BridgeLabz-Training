import java.util.Scanner;

// Create EmployeesBonus class to find the bonus salary of an employee 
public class EmployeesBonus{
	public static void main(String args[]){
		// Create a Scanner Object
		Scanner input = new Scanner(System.in);
		
		// Get input value for salary and yearOfService 
		int salary = input.nextInt();
		int yearOfService = input.nextInt();
		
		// Compute bonus salary 
		double bonusSalary = 1.05 * salary;
		
		// Check if year of service is greter than 5
		if(yearOfService > 5){
			System.out.println("Salary including bonus is : " + bonusSalary);
		}
		else{
			System.out.println("For bonus, year of service should be greater than 5");
		}
		
		// Closing the Scanner Stream
		input.close();
	}
}