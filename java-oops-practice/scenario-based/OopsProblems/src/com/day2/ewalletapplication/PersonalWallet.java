package com.day2.ewalletapplication;

class PersonalWallet extends Wallet {

    PersonalWallet(double balance) {
        super(balance);
    }

    PersonalWallet(double balance, double referralBonus) {
        super(balance, referralBonus);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;
        double total = amount + tax;

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            System.out.println("PersonalWallet Transfer Successful");
        } else {
            System.out.println("Insufficient balance in PersonalWallet");
        }
    }
}
