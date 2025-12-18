import java.util.Scanner;

// Create PowerOfNumber class to find power of a number
public class PowerOfNumber{
    public static void main(String[] args){

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take inputs
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;

        // Check for positive integers
        if(number > 0 && power >= 0){

            // Calculate power using loop
            for(int i = 1; i <= power; i++){
                result = result * number;
            }

            System.out.println(result);

        }else{
            System.out.println("Enter valid positive integers");
        }

        // Close scanner
        input.close();
    }
}