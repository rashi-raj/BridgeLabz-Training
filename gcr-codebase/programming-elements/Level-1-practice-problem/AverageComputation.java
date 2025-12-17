// Create AverageComputation class to calculate the average of three subjects

public class AverageComputation{
	public static void main(String args[]){
		
		String name = "Sam";
		int mathsMarks = 94;
		int physicsMarks = 95;
		int chemistryMarks = 96;
		
		// Create a variable average to indicate the average
		double average = (double)(mathsMarks + physicsMarks + chemistryMarks)/3.0;
		
		System.out.print(name + "'s average marks in PCM is " + average);
	}
}