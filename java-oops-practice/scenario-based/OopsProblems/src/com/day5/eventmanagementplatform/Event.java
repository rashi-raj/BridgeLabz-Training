package com.day5.eventmanagementplatform;

import java.util.UUID;

public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final String eventId;     
    private double baseCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer, double baseCost) {

        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
        this.baseCost = baseCost;
        this.serviceCost = 0;
        this.discount = 0;
        this.eventId = UUID.randomUUID().toString();
    }

    // Constructor with services
    public Event(String eventName, String location, String date,
                 int attendees, User organizer,
                 double baseCost, double serviceCost, double discount) {

        this(eventName, location, date, attendees, organizer, baseCost);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return baseCost + serviceCost - discount;
    }

    public String getEventId() {
        return eventId;
    }
}
