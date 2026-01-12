package com.day8.digitalartmarketplace;

public class PrintArt extends Artwork implements IPurchasable {

    public PrintArt(String title, String artistName, double price) {
        super(title, artistName, price);
    }

    @Override
    public void purchase(boolean eligibleBalance) {
        if (eligibleBalance) {
            System.out.println("Print Art purchased successfully!");
        } else {
            System.out.println("Insufficient balance to purchase Print Art.");
        }
    }

    @Override
    public void license() {
        licenseType = "Display Only License";
        System.out.println("License Applied: " + licenseType);
        System.out.println("Allowed: Physical display only, no reproduction");
    }
}
