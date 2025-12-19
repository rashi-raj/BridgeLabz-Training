import java.util.Scanner;

// Create AbundantNumber class to check Abundant number
public class AbundantNumber{
    public static void main(String[] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        int sum = 0;

        // Find all divisors of the number and its sum
        for(int i=1; i < number; i++){
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check Abundant condition
        if(sum > number){
            System.out.println("Abundant Number");
        }
		else{
            System.out.println("Not an Abundant Number");
        }

        // Close scanner
        input.close();
    }
}
