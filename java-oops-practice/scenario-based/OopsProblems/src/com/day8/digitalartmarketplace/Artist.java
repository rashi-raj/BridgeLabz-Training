package com.day8.digitalartmarketplace;

public class Artist{

    private String name;

    public Artist(String name) {
        this.name = name;
    }

    public void uploadArtwork() {
        System.out.println(name + " uploaded a new artwork successfully!");
    }
}
