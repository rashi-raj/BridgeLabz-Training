import java.util.Scanner;

// Create BMIProgram class to find the BMI status
public class BMIProgram{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Input height and weight
        for (int i = 0; i < n; i++){
            System.out.println("\nEnter details of Person " + (i + 1));

            System.out.print("Height (in meters): ");
            height[i] = input.nextDouble();

            System.out.print("Weight (in kg): ");
            weight[i] = input.nextDouble();
        }

        // Calculate BMI and status
        for (int i = 0; i < n; i++){
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4)
                status[i] = "Underweight";
            else if (bmi[i] <= 24.9)
                status[i] = "Normal";
            else if (bmi[i] <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        System.out.println("\n----- BMI Report -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
        }

		// Close scanner stream
        input.close();
    }
}
