import java.util.Scanner;

// Create PowerOfNumberUsingWhile class
public class PowerOfNumberUsingWhile{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Get inputs
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize result and counter
        int result = 1;
        int i = 0;

        // Check for valid inputs anf find power
        if(number > 0 && power >= 0){
            while (i < power) {
                result = result * number;
                i++;
            }

            System.out.println(result);
        }else{
            System.out.println("Enter valid positive integers");
        }

		// Close scanner
        input.close();
    }
}