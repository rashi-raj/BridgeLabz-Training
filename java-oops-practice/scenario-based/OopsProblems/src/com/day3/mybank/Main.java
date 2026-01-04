package com.day3.mybank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();

        System.out.print("Enter Account Number: ");
        String accNo = sc.next();

        System.out.print("Enter Opening Balance: ");
        double balance = sc.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(accNo, balance);
        Transaction transaction;

        if (choice == 1){
        	transaction = savingsAccount;
        } else {
        	CurrentAccount currentAccount = new CurrentAccount(accNo, balance);
        	transaction = currentAccount;
        }


        while(true){
            System.out.println("\nChoose Operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");

            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    transaction.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    transaction.withdraw(sc.nextDouble());
                    break;

                case 3:
                    transaction.checkBalance();
                    break;

                case 4:
                	if(choice == 1) System.out.println("Interest: " + savingsAccount.calculateInterest());
                    break;

                case 5:
                    System.out.println("Thank You for Banking!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
