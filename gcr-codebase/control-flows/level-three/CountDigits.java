import java.util.Scanner;

// Create CountDigits class to count digits in a number
public class CountDigits{
    public static void main(String[] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get input number
        int number = input.nextInt();

        int count = 0;
        if(number == 0){
            count = 1;
        }
		else{
            while(number != 0){
                number = number / 10; 
                count++;     
            }
        }

        System.out.println("Number of digits: " + count);

        // Close scanner stream
        input.close();
    }
}
