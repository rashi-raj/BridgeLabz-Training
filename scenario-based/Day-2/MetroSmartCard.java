import java.util.Scanner;

// Create MetroSmartCard class
public class MetroSmartCard{
    public static void main(String[] args){
		// Create Scanner close
        Scanner sc = new Scanner(System.in);

        double balance = 200.0;

        while(balance > 0){
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (or -1 to exit): ");
            int distance = sc.nextInt();

            if(distance == -1){
                System.out.println("Thank you for using Delhi Metro.");
                break;
            }

            double fare = (distance <= 5) ? 10 : (distance <= 10) ? 20 : 30;

            if(fare > balance){
                System.out.println("Insufficient balance!");
                break;
            }

            balance -= fare;
            System.out.println("Fare deducted: ₹" + fare);
        }
		
		// Close scanner stream
        sc.close();
    }
}
