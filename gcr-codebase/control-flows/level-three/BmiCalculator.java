import java.util.Scanner;

// Create BmiCalculator class to find BMI and weight status
public class BmiCalculator{
    public static void main(String[] args){
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        double weight = input.nextDouble();   
        double heightCm = input.nextDouble();
		
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        String status;

        // Determine weight status using BMI table
        if(bmi <= 18.4){
            status = "Underweight";
        }
		else if(bmi >= 18.5 && bmi <= 24.9){
            status = "Normal";
        }
		else if(bmi >= 25.0 && bmi <= 39.9){
            status = "Overweight";
        }
		else{
            status = "Obese";
        }

        System.out.println("BMI: " + bmi);
        System.out.println("Weight Status: " + status);

        // Close scanner
        input.close();
    }
}
