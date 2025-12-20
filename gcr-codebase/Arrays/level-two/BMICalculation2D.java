import java.util.Scanner;

// Create BMIProgram class to find the BMI status using 2D array
public class BMICalculation2D{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        // Multi-dimensional array to store height, weight, BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input height and weight with validation
        for (int i = 0; i < number; i++){
            System.out.println("\nEnter details for Person " + (i + 1));

            // Height input
            System.out.print("Height (in meters): ");
            personData[i][0] = input.nextDouble();
            if (personData[i][0] <= 0){
                System.out.println("Height must be positive. Re-enter.");
                i--;
                continue;
            }

            // Weight input
            System.out.print("Weight (in kg): ");
            personData[i][1] = input.nextDouble();
            if (personData[i][1] <= 0){
                System.out.println("Weight must be positive. Re-enter.");
                i--;
            }
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++){
            double height = personData[i][0];
            double weight = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display result
        System.out.println("\n----- BMI REPORT -----");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + personData[i][0] + " m");
            System.out.println("Weight: " + personData[i][1] + " kg");
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        input.close();
    }
}
