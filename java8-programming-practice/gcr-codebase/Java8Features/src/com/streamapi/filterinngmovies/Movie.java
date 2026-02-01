package com.streamapi.filterinngmovies;

public class Movie {

    private String name;
    private float rating;
    private int year;

    // Constructor to initialize Movie object
    public Movie(String name, float rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    
    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    // Overriding toString() for readable output
    @Override
    public String toString() {
        return "Movie{name='" + name + "', rating=" + rating + ", year=" + year + "}";
    }
}
