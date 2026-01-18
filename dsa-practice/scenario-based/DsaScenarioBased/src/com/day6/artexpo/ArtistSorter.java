package com.day6.artexpo;

import java.util.ArrayList;

public class ArtistSorter {

    public void insertArtist(ArrayList<Artist> list, Artist newArtist) {

        int i = list.size() - 1;

        while (i >= 0 && list.get(i).registrationTime > newArtist.registrationTime) {
            i--;
        }

        list.add(i + 1, newArtist);
    }
}