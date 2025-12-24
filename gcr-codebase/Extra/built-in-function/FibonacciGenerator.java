import java.util.Scanner;

public class FibonacciGenerator{

    // Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms){

        int a = 0, b = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Input number of terms
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        // Generate Fibonacci sequence
        generateFibonacci(terms);
		
		sc.close();
    }
}
