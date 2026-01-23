package com.day9.musicapp;

public class Song {
    int trackId;
    String title;
    Song left, right;

    public Song(int trackId, String title) {
        this.trackId = trackId;
        this.title = title;
    }
}
