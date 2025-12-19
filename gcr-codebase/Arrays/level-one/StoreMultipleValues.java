import java.util.Scanner;

// Create StoreMultipleValues class to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number
public class StoreMultipleValues{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double arr[] = new double[10];
		double sum = 0.0;
		
		
		int i=0;
		while(true){
			int temp = input.nextInt();
			if(temp <= 0){
				break;
			}
			else{
				if(i>=10){
					break;
				}
				arr[i] = temp;
				i++;
			}
		}
		
	    // for loop to get the values of each element and add it to the total
		for(int j=0 ; j<10 ; j++){
			sum += arr[j];
		}
		
		System.out.println("Total sum : " + sum);
		
		// Close the Scanner Object
		input.close();
	}
}