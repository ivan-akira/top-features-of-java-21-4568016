package com.example;

public class TicketMachine {

    public String getDetails(Ticket ticket) {
        if (ticket instanceof AdultTicket(var price)) {
            return STR."Adult ticket has price \{ price }";
        }
        if (ticket instanceof ChildTicket childTicket) {
            return STR."Child ticket has price \{ childTicket.price() }";
        }
        return "Unknown ticket type";
    }

}
