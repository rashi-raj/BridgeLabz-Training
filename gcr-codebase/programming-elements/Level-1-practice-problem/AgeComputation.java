// Create AgeComputation class to calculate the age 

public class AgeComputation{
	public static void main(String args[]){
	
		String name = "Harry";
		int birthYear = 2000;
		int currentYear = 2024;
		
		// Create a variable agr to calculate the age
		int age = currentYear - birthYear;
		
		System.out.print(name + "'s age in " + currentYear + " is " + age);
	}
}
