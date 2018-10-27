package tickets.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

import tickets.Ticket;
import tickets.TicketService;
import tickets.TicketStatus;

public class MockTicketService implements TicketService {

	private static final int NUMBER_OF_TICKETS = 12;
	private int ticketNum = 0;

	
	private Ticket getNextTicket() {
		ticketNum++;

		Ticket ticket = new Ticket("T" + ticketNum,
				"Ticket " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss")));
		TicketStatus[] status = TicketStatus.values();

		ticket.setStatus(status[ticketNum % status.length]);

		return ticket;
	}

	@Override
	public void storeTicket(Ticket ticket) {
		System.out.print(ticket + " stored.");
	}

	@Override
	public boolean hasMoreTickets() {
		if (ticketNum < NUMBER_OF_TICKETS) {
			return true;
		}
		return false;
	}

	@Override
	public Supplier<Ticket> getTicketSupplier() {
		//Lambda expression
		//return  () ->  getNextTicket();

		//Method reference.
		return this::getNextTicket;
		
	}
}
