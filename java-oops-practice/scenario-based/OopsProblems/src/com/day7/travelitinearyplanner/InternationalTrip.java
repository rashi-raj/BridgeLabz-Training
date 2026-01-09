package com.day7.travelitinearyplanner;

class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Booking International Trip to " + destination);
        System.out.println("Total Budget: Rs" + budget);
        System.out.println("Passport and visa verification required.");
    }
}
