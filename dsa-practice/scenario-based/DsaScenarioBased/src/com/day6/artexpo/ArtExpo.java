package com.day6.artexpo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArtExpo {

    private static int timeCounter = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Artist> artists = new ArrayList<>();
        ArtistSorter sorter = new ArtistSorter();

        System.out.print("Enter number of artists: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter artist name: ");
            String name = sc.nextLine();

            Artist artist = new Artist(name, timeCounter++);
            sorter.insertArtist(artists, artist);

            System.out.println("Current registration order:");
            for (Artist a : artists) {
                System.out.println(a);
            }
            System.out.println();
        }

        sc.close();
    }
}
