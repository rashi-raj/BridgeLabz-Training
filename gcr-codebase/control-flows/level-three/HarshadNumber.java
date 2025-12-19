import java.util.Scanner;

// Create HarshadNumber class to check Harshad number
public class HarshadNumber{
    public static void main(String[] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        int copy = number;
        int sum = 0;

        // Use while loop to find sum of digits
        while(number > 0){
            int remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }

        // Check Harshad condition
        if(sum != 0 && copy % sum == 0){
            System.out.println("Harshad Number");
        }else{
            System.out.println("Not a Harshad Number");
        }

        // Close scanner
        input.close();
    }
}
