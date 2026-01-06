package com.day5.eventmanagementplatform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String eventName, String location, String date,
                            int attendees, User organizer,
                            double baseCost, double serviceCost, double discount) {

        super(eventName, location, date, attendees, organizer,
              baseCost, serviceCost, discount);
    }

    @Override
    public void schedule() {
        System.out.println("📢 Conference Scheduled with formal setup on " + date);
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("📅 Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("❌ Conference cancelled.");
    }
}
