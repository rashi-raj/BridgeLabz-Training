import java.util.Scanner;

// Create ResultGenerator class
public class ResultGenerator{
    public static void main(String[] args){
		// Create scanner object
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        for (int i = 0; i < marks.length; i++){
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / 5.0;
        char grade;

        switch ((int) average / 10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

		// Close scanner stream
        sc.close();
    }
}
