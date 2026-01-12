package com.day1.tabhistorymanager;

import java.util.Scanner;

public class BrowserBuddy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Browser browser = new Browser();

        while (true) {
            System.out.println("\n--- Browser Menu ---");
            System.out.println("1. Visit Page");
            System.out.println("2. Back");
            System.out.println("3. Forward");
            System.out.println("4. Close Tab");
            System.out.println("5. Reopen Tab");
            System.out.println("6. Show Current Page");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter URL: ");
                    String url = sc.nextLine();
                    browser.activeTab.visit(url);
                    break;

                case 2:
                    browser.activeTab.back();
                    break;

                case 3:
                    browser.activeTab.forward();
                    break;

                case 4:
                    browser.closeTab();
                    break;

                case 5:
                    browser.reopenTab();
                    break;

                case 6:
                    browser.activeTab.show();
                    break;

                case 7:
                    System.out.println("Browser closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
