import java.util.Scanner;

public class BMIFitnessTracker{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your height in meters: ");
        double heightInMeters = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weightInKg = scanner.nextDouble();

        // Calculating BMI
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Display BMI value
        System.out.println("\nYour BMI is: " + bmi);

        // Determining BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("BMI Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("BMI Category: Normal");
        } else {
            System.out.println("BMI Category: Overweight");
        }

        scanner.close();
    }
}
