import java.util.Scanner;

// Create FizzBuzz class 
public class FizzBuzz{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

		// FizzBuzz operations
        if (number > 0){
            String[] results = new String[number + 1];

            for (int i = 0; i <= number; i++){
                if (i % 3 == 0 && i % 5 == 0){
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }

        }else{
            System.out.println("Please enter a positive integer.");
        }

		// Close the Scanner Object
        input.close();
    }
}
