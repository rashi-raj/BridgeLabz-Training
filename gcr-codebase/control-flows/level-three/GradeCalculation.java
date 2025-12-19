import java.util.Scanner;

// Create GradeCalculation class to calculate the grade
public class GradeCalculation{
    public static void main(String[] args){

        // Create Scanner object
        Scanner input = new Scanner(System.in);
        int physics, chemistry, maths;
        double average;
        char grade;
        String remarks;

        // Get Input for marks
        physics = input.nextInt();
        chemistry = input.nextInt();
        maths = input.nextInt();

        // Calculate average
        average = (physics + chemistry + maths) / 3.0;

        // Determine grade and remarks
        if (average >= 80){
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        }
		else if (average >= 70){
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        }
		else if (average >= 60){
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        }
		else if (average >= 50){
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        }
		else if (average >= 40){
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        }
		else{
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close scanner
        input.close();
    }
}
