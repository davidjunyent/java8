package tickets.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import tickets.Ticket;
import tickets.TicketService;
import tickets.TicketStatus;

public class MockTicketService implements TicketService {

    private static final int NUMBER_OF_TICKETS=100;
    private int ticketNum=0;
    @Override
    public Ticket getNextTicket() {
	ticketNum++;
	
	Ticket ticket= new Ticket("T"+toString(),
		"Ticket " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss")));
	TicketStatus[] status=TicketStatus.values();
	
	ticket.setStatus(status[ticketNum%status.length]);
	
	return ticket;
    }

    @Override
    public void storeTicket(Ticket ticket) {
	System.out.print(ticket+" stored.");
    }

    @Override
    public boolean hasMoreTickets() {
	if(ticketNum<=NUMBER_OF_TICKETS) {
	    return true;    
	}
	return false;
    }

}
