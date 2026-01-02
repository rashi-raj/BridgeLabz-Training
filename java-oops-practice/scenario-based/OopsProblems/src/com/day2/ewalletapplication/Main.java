package com.day2.ewalletapplication;

public class Main {
    public static void main(String[] args) {

        Wallet pw = new PersonalWallet(5000, 500); 
        Wallet bw = new BusinessWallet(100000);

        User u1 = new User(101, "Rashi", pw);
        User u2 = new User(102, "Gautam", bw);

        System.out.println(u1.getUserInfo());
        System.out.println("Balance: Rs" + u1.getWallet().getBalance());

        pw.transferTo(u2, 2000);   

        System.out.println("Rashi Balance: Rs" + u1.getWallet().getBalance());
        System.out.println("Gautam Balance: Rs" + u2.getWallet().getBalance());
    }
}
