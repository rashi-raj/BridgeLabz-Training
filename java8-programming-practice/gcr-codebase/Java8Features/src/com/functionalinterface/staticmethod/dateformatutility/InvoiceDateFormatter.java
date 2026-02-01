package com.functionalinterface.staticmethod.dateformatutility;
import java.time.LocalDate;
import java.util.Scanner;

public class InvoiceDateFormatter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date format (dd-MM-yyyy / yyyy-MM-dd): ");
        String pattern = sc.nextLine();

        LocalDate today = LocalDate.now();

        String formattedDate = DateUtils.formatDate(today, pattern);
        System.out.println("Formatted Invoice Date: " + formattedDate);
        
        sc.close();
    }
}
