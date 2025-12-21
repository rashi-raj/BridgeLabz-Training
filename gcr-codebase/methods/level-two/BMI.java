import java.util.Scanner;

// Create BMI class to calculate BMI of 10 persons
public class BMI{

    // Method to calculate BMI and populate 3rd column
    public static void calculateBMI(double[][] data){

        for (int i = 0; i < data.length; i++){

            double weight = data[i][0];        
            double heightCm = data[i][1];      
            double heightMeter = heightCm / 100;

            double bmi = weight / (heightMeter * heightMeter);
            data[i][2] = bmi;                 
        }
    }

    // Method to determine BMI status
    public static String[] findBMIStatus(double[][] data){

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++){

            double bmi = data[i][2];

            if (bmi <= 18.4){
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9){
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9){
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        // Take input
        for (int i = 0; i < 10; i++){
            System.out.println("Enter weight (kg) of person " + (i + 1) + ":");
            data[i][0] = sc.nextDouble();

            System.out.println("Enter height (cm) of person " + (i + 1) + ":");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Get BMI Status
        String[] status = findBMIStatus(data);

        System.out.println("\nWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(
                data[i][0] + "\t" +
                data[i][1] + "\t" +
                String.format("%.2f", data[i][2]) + "\t" +
                status[i]
            );
        }

		// Close Scanner Stream
        sc.close();
    }
}
