import java.util.Scanner;

public class NumberGuessingGame{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Generate number between 1 and 100 
        int secretNumber = (int)(Math.random() * 100) + 1;

        int guess;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have only 5 attempts.\n");

        do{
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high!");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too low!");
            } 
            else {
                System.out.println("Congratulations! You guessed the number in "
                        + attempts + " attempts.");
                break;
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("\nGame Over! You used all 5 attempts.");
                System.out.println("The correct number was: " + secretNumber);
            }

        }while(attempts < MAX_ATTEMPTS);

        sc.close();
    }
}
