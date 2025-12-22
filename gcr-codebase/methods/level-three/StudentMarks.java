import java.util.Random;
import java.util.Scanner;

public class StudentMarks{

    // Generate random marks for n students in 3 subjects
    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = 50 + rand.nextInt(51); // Physics 50-100
            marks[i][1] = 50 + rand.nextInt(51); // Chemistry 50-100
            marks[i][2] = 50 + rand.nextInt(51); // Math 50-100
        }
        return marks;
    }

    // Calculate total, average, percentage for each student
    public static double[][] calculateTotals(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3]; 
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 300.0 * 100) * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Display scorecard
    public static void displayScorecard(int[][] marks, double[][] result) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] result = calculateTotals(marks);
        displayScorecard(marks, result);
		
		sc.close();
    }
}
