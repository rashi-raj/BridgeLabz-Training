package day2.dealtracker;

import java.util.Scanner;

public class DealTrackerDemo {

    // 🔹 Set your default folder path here
    private static final String DEFAULT_DEAL_FOLDER = 
        "C:\\Users\\ASUS\\OneDrive\\Desktop\\Java programming workspace\\java-collections-practice\\scenario-based\\JavaCollectionsScenario\\src\\com\\day2\\dealtracker";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DealTrackerManager<Deal> manager = new DealTrackerManager<>();

        int choice = -1;

        System.out.println("🛒 Welcome to DealTracker");

        while (choice != 0) {
            System.out.println("\nSelect an option:");
            System.out.println("1️⃣ Load Deals from Default Folder");
            System.out.println("2️⃣ Display All Valid Deals");
            System.out.println("3️⃣ Display Deals Sorted by Discount");
            System.out.println("0️⃣ Exit");

            System.out.print("Enter choice: ");
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("❌ Please enter a number (0-3)!");
                continue;
            }

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input! Enter a number between 0-3");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("📁 Loading deals from default folder...");
                    manager.loadDealsFromFolder(DEFAULT_DEAL_FOLDER);
                    break;

                case 2:
                    manager.displayAllDeals();
                    break;

                case 3:
                    manager.displayDealsSortedByDiscount();
                    break;

                case 0:
                    System.out.println("👋 Exiting DealTracker. Goodbye!");
                    break;

                default:
                    System.out.println("❌ Invalid choice! Enter a number between 0-3");
            }
        }

        sc.close();
    }
}