import java.util.Scanner;

public class BMI{

	public static String[][] calculateBMI(double[][] person){
	
        String[][] result = new String[10][4];
		for (int i = 0; i < 10; i++) {

            double weight = person[i][0];
            double heightCm = person[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0)/100.0;

            String status;
            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;	
	}	
	
	public static void displayBMI(String[][] result){

        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\tStatus");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println( result[i][0] + "\t\t" + result[i][1] + "\t\t" + result[i][2] + "\t" + result[i][3] );
        }
    }

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double[][] person = new double[10][2]; 
		
		for(int i=0 ; i<10 ; i++){
			System.out.print("Enter person " + (i+1) + " weight(kg) : ");
			person[i][0] = sc.nextDouble();
			System.out.print("Enter person " + (i+1) + " height(cm) : ");
			person[i][1] = sc.nextDouble();		
		}
		
		String[][] result = calculateBMI(person);
        displayBMI(result);

		// Close scanner stream
        sc.close();
		
	}
}