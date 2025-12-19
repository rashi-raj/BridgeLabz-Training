import java.util.Scanner;

// Create Factors class to find the factors of the number
public class Factors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
		
        int num = input.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors
        for (int i = 1; i <= num; i++){
            if (num % i == 0){

                // If array is full, resize it
                if (index == maxFactor){
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    // Copy old elements to new array
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                // Store factor
                factors[index] = i;
                index++;
            }
        }

        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

		// Close scanner stream
        input.close();
    }
}
