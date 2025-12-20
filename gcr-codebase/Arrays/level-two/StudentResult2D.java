import java.util.Scanner;

// Create StudentResult2D to calculate grade in 2D array
public class StudentResult2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // 2D array to store marks of Physics, Chemistry, Maths
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        String[] subjects = {"Physics", "Chemistry", "Maths"};

        // Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = input.nextDouble();

                if (marks[i][j] < 0) {
                    System.out.println("Marks must be positive. Re-enter.");
                    j--;
                }
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }

            percentage[i] = sum / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        System.out.println("\n----- Student Results -----");
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
        }
		
		// Close the scanner stream
        input.close();
    }
}
