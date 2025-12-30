/*
15. Rohan’s Library Reminder App
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;

public class LibraryReminderApp{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        final int FINE_PER_DAY = 5;

        System.out.println("Rohan's Library Reminder App");

        // Loop for 5 books
        for (int i = 1; i <= 5; i++){

            System.out.println("\nBook " + i + ":");

            System.out.print("Enter due date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate){
                int lateDays = returnDate - dueDate;
                int fine = lateDays * FINE_PER_DAY;
                System.out.println("Book returned late by " + lateDays + " days");
                System.out.println("Fine to be paid: ₹" + fine);
            }else{
                System.out.println("Book returned on time. No fine!");
            }
        }

        System.out.println("\nThank you for using Library Reminder App!");
        sc.close();
    }
}
