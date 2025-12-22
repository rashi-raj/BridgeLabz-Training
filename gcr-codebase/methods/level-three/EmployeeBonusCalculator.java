// Create EmployeeBonusCalculator utility class
public class EmployeeBonusCalculator {

    // Method to generate salary and years of service
    // salary -> 5 digit random number
    // years of service -> random between 1 and 10
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // Generate 5-digit salary (10000 to 99999)
            data[i][0] = (int)(Math.random() * 90000) + 10000;

            // Generate years of service (1 to 10)
            data[i][1] = (int)(Math.random() * 10) + 1;
        }

        return data;
    }

    // Method to calculate new salary and bonus
    // Column 0 -> new salary
    // Column 1 -> bonus amount
    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] updatedData = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            updatedData[i][0] = salary + bonus; 
            updatedData[i][1] = bonus;           
        }

        return updatedData;
    }

    // Method to calculate totals and display in tabular format
    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("\nEmp  OldSalary  Years  Bonus  NewSalary");

        for (int i = 0; i < oldData.length; i++) {

            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-4d %-10.0f %-6.0f %-7.0f %-10.0f\n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("Total Old Salary : " + totalOldSalary);
        System.out.println("Total Bonus      : " + totalBonus);
        System.out.println("Total New Salary : " + totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        // Generate salary and years of service
        double[][] employeeData = generateEmployeeData(employees);

        // Calculate bonus and new salary
        double[][] updatedData = calculateBonus(employeeData);

        // Display results
        displaySummary(employeeData, updatedData);
    }
}
