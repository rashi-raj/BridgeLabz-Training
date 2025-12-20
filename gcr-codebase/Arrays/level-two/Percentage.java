import java.util.Scanner;

// Create percentage class  to find the percentage marks of the students
public class Percentage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] subject = {"Physics", "Chemistry", "Maths"};
        double[] marks = new double[3];

		// Input marks for each subjects
        for (int i = 0; i < 3; i++){
            System.out.print("Enter marks in " + subject[i] + ": ");
            marks[i] = input.nextDouble();

            if (marks[i] < 0){
                System.out.println("Enter positive marks only");
                i--;
            }
        }

		// Find the percentage
        double sum = 0;
        for (int i = 0; i < 3; i++){
            sum += marks[i];
        }
		double percentage = sum / 3.0;
		
        char grade;
        String remarks;

		// Determine grade and remarks based on percentage
        if (percentage >= 80){
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70){
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60){
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50){
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40){
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else{
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("\nPercentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

		// Close scanner stream
        input.close();
    }
}
