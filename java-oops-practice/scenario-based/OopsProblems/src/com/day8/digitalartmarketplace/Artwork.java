package com.day8.digitalartmarketplace;

public class Artwork {
    private String title;
    private String artistName;
    private double price;
    protected String licenseType;   
    protected String previews;

    public Artwork(String title, String artistName, double price) {
        this.title = title;
        this.artistName = artistName;
        this.price = price;
    }

    public Artwork(String title, String artistName, String previews, double price) {
        this(title, artistName, price);
        this.previews = previews;
    }

    void displayArtwork() {
        System.out.println("Art Title : " + title);
        System.out.println("Artist Name : " + artistName);
        System.out.println("Price : Rs." + price);
    }

    public double getPrice() {
        return price;
    }
}
