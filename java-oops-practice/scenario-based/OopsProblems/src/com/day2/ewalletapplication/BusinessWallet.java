package com.day2.ewalletapplication;

class BusinessWallet extends Wallet {

    private static final double DAILY_LIMIT = 50000;

    BusinessWallet(double balance) {
        super(balance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        if (amount > DAILY_LIMIT) {
            System.out.println("Transfer exceeds daily business limit");
            return;
        }

        if (debit(amount)) {
            receiver.getWallet().credit(amount);
            System.out.println("BusinessWallet Transfer Successful");
        } else {
            System.out.println("Insufficient balance in BusinessWallet");
        }
    }
}
