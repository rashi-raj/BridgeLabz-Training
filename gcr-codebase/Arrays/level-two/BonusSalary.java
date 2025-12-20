import java.util.Scanner;

// Create BonusSalary class to find the bonus salary of employees
public class BonusSalary{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Arrays for 10 employees
        double salary[] = new double[10];
        int yearOfService[] = new int[10];
        double newSalary[] = new double[10];
        double bonus[] = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        System.out.println("Enter salary and years of service for 10 employees:");

        // Input loop with validation
        for (int i = 0; i < 10; i++){
            System.out.println("Employee " + (i + 1) + ":");

            double sal = input.nextDouble();
            int years = input.nextInt();

            if (sal <= 0 || years < 0){
                System.out.println("Invalid input! Salary must be positive and years cannot be negative.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearOfService[i] = years;
        }

        // Bonus calculation loop
        for (int i = 0; i < 10; i++){
		
            if (yearOfService[i] > 5){
                bonus[i] = salary[i] * 0.05; 
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Salary Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Paid: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

		// Close Scanner stream
        input.close();
    }
}
