package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketCircularList {

    private TicketNode head = null;
    private TicketNode tail = null;

    /* Add ticket at end */
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode = new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head;
    }

    /* Remove ticket by Ticket ID */
    public void removeTicket(int ticketId) {

        if (head == null) {
            System.out.println("No tickets to remove");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == ticketId) {

                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket " + ticketId + " removed");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Ticket not found");
    }

    /* Display all tickets */
    public void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        TicketNode temp = head;
        do {
            System.out.println(
                "Ticket ID: " + temp.ticketId +
                ", Customer: " + temp.customerName +
                ", Movie: " + temp.movieName +
                ", Seat: " + temp.seatNumber +
                ", Time: " + temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    /* Search by Customer Name or Movie Name */
    public void searchTicket(String key) {

        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {

                System.out.println(
                    "Found → Ticket ID: " + temp.ticketId +
                    ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName +
                    ", Seat: " + temp.seatNumber
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching ticket found");
    }

    /* Count total tickets */
    public int countTickets() {

        if (head == null)
            return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}
