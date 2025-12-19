import java.util.Scanner;

// Create FindMeanHeight class to find the mean height
public class FindMeanHeight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double heights[] = new double[11];
		
		for(int i=0 ; i<11 ; i++){
			heights[i] = input.nextDouble();
		}
		
		// Find the sum of the heights
		double sum = 0.0;
		for(int i=0 ; i<11 ; i++){
			sum += heights[i];
		}
		
		// Find the Mean Height and print it
		double meanHeight = sum/11.0;
		System.out.println("Mean Height : " + meanHeight);
		
		// Close the Scanner Object
		input.close();
	}
	
}