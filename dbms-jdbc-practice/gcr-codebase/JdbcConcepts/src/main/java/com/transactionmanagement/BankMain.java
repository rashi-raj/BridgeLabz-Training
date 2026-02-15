package com.transactionmanagement;

public class BankMain {

    public static void main(String[] args) {

    	TransactionManagement bank = new TransactionManagement();
        try {
            bank.createTable();

            System.out.println("Balance of 101: " + bank.checkBalance(101));

            bank.transferMoney(101, 102, 500);

            System.out.println("Balance of 101: " + bank.checkBalance(101));
            System.out.println("Balance of 102: " + bank.checkBalance(102));

            System.out.println("\nTransaction History for 101:");
            bank.transactionHistory(101);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}