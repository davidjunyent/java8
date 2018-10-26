import java.util.ArrayList;
import java.util.List;

import tickets.Ticket;
import tickets.TicketService;
import tickets.TicketStatus;
import tickets.dependencyinjection.DIProvider;

public class Main {

	public static void main(String[] args) {

		List<Ticket> tickets = new ArrayList<>(); 
		TicketService ticketService = DIProvider.getDIProvider().geTicketService();
		int totalWeight = 0;
		int totalClosed = 0;
		int totalOpened = 0;

		System.out.println("------------------------");
		
		while (ticketService.hasMoreTickets()) {

			Ticket ticket=ticketService.getNextTicket();
			
			TicketStatus ticketStatus = ticket.getStatus();
			
			System.out.println("Ticket status: " + ticketStatus);
			totalWeight = totalWeight + ticketStatus.getWeight();

			switch (ticketStatus) {
			case OPEN:
				totalOpened++;
				break;
			case CLOSED:
				totalClosed++;
				break;
			default:
				break;
			}
			
			tickets.add(ticket);
		}
		
		System.out.println("------------------------");

		System.out.println("Num tickets " + tickets.size());
		tickets.removeIf(ticket ->ticket.getStatus().equals(TicketStatus.CLOSED));
		System.out.println("Non closed Tickets " + tickets.size());
		
		
		System.out.println("Total weight " + totalWeight);
		System.out.println("Opened Tickets " + totalOpened);
		System.out.println("Closed Tickets " + totalClosed);
	}
}
