package com.day7.travelitinearyplanner;

class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println(" Booking Domestic Trip to " + destination);
        System.out.println("Total Budget: Rs" + budget);
        System.out.println("No passport required.");
    }
}
