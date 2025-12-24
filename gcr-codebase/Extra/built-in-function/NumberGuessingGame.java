import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{

    // Method to generate a random guess between given range
    public static int generateGuess(int low, int high){
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    // Method to get feedback from the user
    public static String getFeedback(Scanner sc){
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next().toLowerCase();
    }

    // Method to update the guessing range based on feedback
    public static void updateRange(String feedback, int guess, int[] range){
        if (feedback.equals("high")){
            range[1] = guess - 1;   // decrease upper limit
        } else if (feedback.equals("low")) {
            range[0] = guess + 1;   // increase lower limit
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        int guessCount = 0;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while(true){

            // Generate computer's guess
            int guess = generateGuess(low, high);
            guessCount++;

            System.out.println("My guess is: " + guess);

            // Get feedback from user
            String feedback = getFeedback(sc);

            // If guess is correct, end the game
            if (feedback.equals("correct")){
                System.out.println("Yay! I guessed your number in " + guessCount + " attempts.");
                break;
            }

            // Update range using an array to simulate pass-by-reference
            int[] range = { low, high };
            updateRange(feedback, guess, range);

            low = range[0];
            high = range[1];
        }
		sc.close();
    }
}
