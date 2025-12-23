import java.util.Scanner;
import java.util.Random;

// Create class VotingEligibility
public class VotingEligibility{

    // Method to generate random 2-digit ages for n students
    public int[] generateAges(int n){

        int[] ages = new int[n];
        Random rand = new Random();

        for (int i = 0; i<n; i++){
            ages[i] = rand.nextInt(90) + 10; 
        }

        return ages;
    }

    // Method to check voting eligibility
    public String[][] checkVotingEligibility(int[] ages){

        String[][] result = new String[ages.length][2];

        for (int i = 0; i <ages.length; i++){

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; 
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  
            } else {
                result[i][1] = "false"; 
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public void displayTable(String[][] data){

        System.out.println("\nAge\tCan Vote");

        for (int i = 0; i < data.length; i++){
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    public static void main(String[] args){

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = 10;

        VotingEligibility obj = new VotingEligibility();

        int[] ages = obj.generateAges(numberOfStudents);

        String[][] votingResult = obj.checkVotingEligibility(ages);

        obj.displayTable(votingResult);

        // Close scanner
        sc.close();
    }
}
