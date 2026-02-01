package com.streamapi.filterinngmovies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class FilteringMovies {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // List to store Movie objects
        List<Movie> list = new ArrayList<>();

        System.out.println("Enter the number of movies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the movie " + (i + 1));

            System.out.print("Enter the name : ");
            String name = sc.nextLine();

            System.out.print("Enter the rating: ");
            float rating = sc.nextFloat();

            System.out.print("Enter the year : ");
            int year = sc.nextInt();
            sc.nextLine(); 

            // Adding movie to list
            list.add(new Movie(name, rating, year));
        }

        list.stream()
        	.filter(m -> m.getRating() >= 7.5)
            .sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Comparator.comparing(Movie::getYear).reversed()))
            .limit(5)
            .forEach(System.out::println);

        sc.close();
    }
}
