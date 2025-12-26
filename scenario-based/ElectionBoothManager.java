import java.util.Scanner;

// Create class ElectionBoothManager
public class ElectionBoothManager{
    public static void main(String[] args){
		// Create Scanner object
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();

            if (age == -1){
                System.out.println("Voting process ended.");
                break;
            }

            if (age < 18){
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.println("Eligible to vote.");
            System.out.print("Enter vote (1, 2, or 3): ");
            int vote = sc.nextInt();

            switch (vote) {
                case 1:
                    System.out.println("Vote recorded for Candidate 1");
                    break;
                case 2:
                    System.out.println("Vote recorded for Candidate 2");
                    break;
                case 3:
                    System.out.println("Vote recorded for Candidate 3");
                    break;
                default:
                    System.out.println("Invalid vote!");
            }
        }
		
		// Close scanner stream
        sc.close();
    }
}
