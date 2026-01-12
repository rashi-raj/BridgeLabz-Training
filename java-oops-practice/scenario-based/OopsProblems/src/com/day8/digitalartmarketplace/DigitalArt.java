package com.day8.digitalartmarketplace;

public class DigitalArt extends Artwork implements IPurchasable {

    public DigitalArt(String title, String artistName, String previews, double price) {
        super(title, artistName, previews, price);
    }

    @Override
    public void purchase(boolean eligibleBalance) {
        if (eligibleBalance) {
            System.out.println("Digital Art purchased successfully!");
        } else {
            System.out.println("Insufficient balance to purchase Digital Art.");
        }
    }

    @Override
    public void license() {
        licenseType = "Personal Use License";
        System.out.println("License Applied: " + licenseType);
        System.out.println("Allowed: View, download, personal display only");
    }
}
