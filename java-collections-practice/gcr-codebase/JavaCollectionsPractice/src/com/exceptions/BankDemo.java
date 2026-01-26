package com.exceptions;

/*
10. Bank Transaction System
Dynamic withdrawal.
*/
import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0)
            throw new IllegalArgumentException("Invalid amount!");
        if (amount > balance)
            throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        try {
            System.out.print("Enter withdrawal amount: ");
            acc.withdraw(sc.nextDouble());
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
