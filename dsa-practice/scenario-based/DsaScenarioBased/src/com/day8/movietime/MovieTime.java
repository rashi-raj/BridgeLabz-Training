package com.day8.movietime;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTime {
	public static void main(String[] args) throws ClassNotFoundException{
		Scanner sc = new Scanner(System.in);
		List<Movie> shows = new ArrayList<>();
		System.out.println("Welcome to Movie Hall");
		while(true) {
			System.out.println("\n1. Add show");
			System.out.println("2. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice==2) { 
				System.out.println("Thank you!!");
				break;
			}
			
			if(choice==1) {
				System.out.println("Enter the movie name : ");
				String name = sc.nextLine();
				System.out.println("Enter time :");
				String time = sc.nextLine();
				LocalTime showTime = LocalTime.parse(time);
				shows.add(new Movie(name,showTime));
				Sort.sort(shows);
			}else System.out.println("Invalid choice");
			
		}
		sc.close();
	}
}
