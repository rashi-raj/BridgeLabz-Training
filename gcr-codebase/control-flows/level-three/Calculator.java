import java.util.Scanner;

// Create Calculator class
public class Calculator{
    public static void main(String[] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        double first, second, result;
        String op;

        // Get inputs
        first = input.nextDouble();
        second = input.nextDouble();
        op = input.next();

        // Perform calculation using switch-case
        switch(op){
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if(second != 0){
                    result = first / second;
                    System.out.println("Result: " + result);
                }
				else{
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }

        // Close scanner
        input.close();
    }
}
