import java.util.Scanner;

// Create OddEvenArray class to find odd and even array
public class OddEvenArray{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		// Check for odd and even and assign values to respective arrays
		if(num > 0){
			int odd[] = new int[(num/2) + 1];
			int even[] = new int[(num/2) + 1];
			int i = 0;
			int j = 0;
			for(int k=1 ; k<=num ; k++){
				if(k % 2 == 0){
					even[i] = k;
					i++;
				}
				else{
					odd[j] = k;
					j++;
				}
			}
			
			System.out.print("Even Numbers: ");
			for(int m=0 ; m<i ; m++){
				System.out.print(even[m] + " ");
			}
			
			System.out.println();
			System.out.print("Odd Numbers : ");
			for(int m=0 ; m<j ; m++){
				System.out.print(odd[m] + " ");
			}
		}
		else{
			// Not a natural number, print error
			System.err.println("Error");
			System.exit(0);
		}
		
		// Close the Scanner Object
		input.close();
	}
}