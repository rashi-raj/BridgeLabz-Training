import java.util.Scanner;

// Create FindMultiplesUsingWhile class
public class FindMultiplesUsingWhile{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Get input
        int number = input.nextInt();

        // Check for positive integer less than 100
        if (number > 0 && number < 100) {
            int i = number - 1;

            while (i > 1) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i--;
            }
        }else{
            System.out.println("Enter a valid number between 1 and 99");
        }
		
		// Close scanner
        input.close();
    }
}