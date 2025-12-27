package com.constructor.level1;

public class BankAccountMain {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("SB123456", "Rashi", 5000, 4.5);

        sa.displayAccountDetails();

        sa.deposit(2000);
        sa.withdraw(1500);

        System.out.println("\nUpdated Balance: Rs" + sa.getBalance());

	}

}
