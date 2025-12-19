import java.util.Scanner;

// Create MultiplyTable class to find the multiplication table of a number entered by the user from 6 to 9 

public class MultiplyTable{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int[] multiplicationResult = new int[4];

        // Using for loop to calculate table from 6 to 9
        int index = 0;
        for(int i = 6; i <= 9; i++){
            multiplicationResult[index] = number * i;
            index++;
        }

        // Display the result from the array
        index = 0;
        for(int i = 6; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
		}
		
		// Close the Scanner Object
		input.close();
	}
}