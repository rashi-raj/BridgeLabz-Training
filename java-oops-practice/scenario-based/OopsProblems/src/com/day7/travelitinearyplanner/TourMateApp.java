package com.day7.travelitinearyplanner;

public class TourMateApp {

    public static void main(String[] args) {

        Transport transport = new Transport(15000);
        Hotel hotel = new Hotel(4000, 3);
        Activity activity = new Activity(5000);

        Trip trip1 = new DomesticTrip(
                "Goa", 4, transport, hotel, activity);

        Trip trip2 = new InternationalTrip(
                "Paris", 6, transport, hotel, activity);

        trip1.book();
        System.out.println();
        trip2.book();
    }
}
