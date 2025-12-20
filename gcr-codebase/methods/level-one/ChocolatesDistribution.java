import java.util.Scanner;

// Create ChocolatesDistribution class to divide N number of chocolates among M children
public class ChocolatesDistribution{

	// Method to calculate chocolates distributed
	public static int[] findChocolatesDistribution(int numberOfchocolates, int numberOfChildren){
		
		int chocolatesDistributed = numberOfchocolates / numberOfChildren;
		int remaining = numberOfchocolates % numberOfChildren;
		
		return new int[]{chocolatesDistributed, remaining};
	}
	
	public static void main(String[] args){
		// Create a scanner object
		Scanner sc = new Scanner(System.in);
		
		// Get input for number
		System.out.println("Enter numberOfchocolates and numberOfChildren: ");
		int numberOfchocolates  = sc.nextInt();
		int numberOfChildren = sc.nextInt();
		
		// Get chocolatesDistributed and remaining chocolates
		int result[] = ChocolatesDistribution.findChocolatesDistribution(numberOfchocolates, numberOfChildren);
		System.out.println("Each children will get " + result[0] + " chocolates \nRemaining chocolates : " + result[1]);
		
		// close the scanner stream
		sc.close();
	}
}