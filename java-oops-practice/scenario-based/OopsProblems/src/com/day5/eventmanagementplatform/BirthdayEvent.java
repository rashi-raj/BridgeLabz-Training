package com.day5.eventmanagementplatform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String eventName, String location, String date,
                         int attendees, User organizer,
                         double baseCost, double serviceCost, double discount) {

        super(eventName, location, date, attendees, organizer,
              baseCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event Scheduled for " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}