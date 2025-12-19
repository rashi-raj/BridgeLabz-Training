import java.util.Scanner;

// Create Array2D class to copy the 2D array to 1D array
public class Array2D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int cols = input.nextInt();
		
		int[][] array2D = new int[rows][cols];
		
		// Take input in 2D array
		for(int i=0 ; i<rows ; i++){
			for(int j=0 ; j<cols ; j++){
				array2D[i][j] = input.nextInt();
			}
		}
		
		int[] array = new int[rows * cols];
		int index=0;
		
		// Copy the @D array to !D array
		for(int i=0 ; i<rows ; i++){
			for(int j=0 ; j<cols ; j++){
				array[index] = array2D[i][j];
				index++;
			}
		}
		
		System.out.println("Successfully copied to 1D array");
		
		// Close the Scanner Object
		input.close();

	}
}