// Create PenDistribution class to calculate pen distribution among students

public class PenDistribution{
	public static void main(String[] args){

		int pens = 14;
		int students = 3;

		// Calculate the number of pens that cannot be distributed
		int nonDistributedPens = pens % students;

		// Calculate the number of pens distributed to each student
		int pensDistributed = pens / students;

		System.out.print("The Pen Per Student is " + pensDistributed + " and the remaining pen not distributed is " + 
		                  nonDistributedPens);
	}
}