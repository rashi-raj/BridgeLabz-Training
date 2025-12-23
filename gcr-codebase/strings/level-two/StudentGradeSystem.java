import java.util.Scanner;

public class StudentGradeSystem{

    // Method to generate random 2-digit PCM scores (10–99)
    public static int[][] generatePCMScores(int students){
        int[][] pcm = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                pcm[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return pcm;
    }

    // Method to calculate total, average and percentage
    public static double[][] calculateResults(int[][] pcm){
        double[][] result = new double[pcm.length][3]; 

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return result;
    }

    // Method to calculate grade based on percentage
    public static char[] calculateGrade(double[][] result){
        char[] grade = new char[result.length];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 80) grade[i] = 'A';
            else if (percent >= 70) grade[i] = 'B';
            else if (percent >= 60) grade[i] = 'C';
            else if (percent >= 50) grade[i] = 'D';
            else if (percent >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        return grade;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] pcm,double[][] result,char[] grade){
        System.out.println("\nStudent Scorecard");
        System.out.println("Std\tPhysics\tChemistry\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < pcm.length; i++){
            System.out.println((i + 1) + "\t" + pcm[i][0] + "\t\t" + pcm[i][1] + "\t\t" + pcm[i][2] + "\t" +(int)result[i][0] + "\t" +result[i][1] + "\t" +result[i][2] + "\t" +grade[i]);
        }
    }

    public static void main(String[] args){
		// Create Scanner object
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] pcm = generatePCMScores(students);
        double[][] result = calculateResults(pcm);
        char[] grade = calculateGrade(result);

        displayScoreCard(pcm, result, grade);

		// Close Scanner stream
        sc.close();
    }
}
