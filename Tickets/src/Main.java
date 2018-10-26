import tickets.TicketService;
import tickets.TicketStatus;
import tickets.dependencyinjection.DIProvider;

public class Main {

	public static void main(String[] args) {

		TicketService ticketService = DIProvider.getDIProvider().geTicketService();
		int totalWeight = 0;
		int totalClosed = 0;
		int totalOpened = 0;

		System.out.println("------------------------");
		
		while (ticketService.hasMoreTickets()) {

			TicketStatus ticketStatus = ticketService.getNextTicket().getStatus();
			System.out.println("Ticket status: " + ticketStatus);
			totalWeight = totalWeight + ticketStatus.getWeight();

			switch (ticketStatus) {
			case OPEN:
				totalOpened++;
				break;
			case CLOSED:
				totalOpened++;
				break;
			default:
				break;
			}
		}
		
		System.out.println("------------------------");

		System.out.println("Total weight " + totalWeight);
		System.out.println("Opened Tickets" + totalOpened);
		System.out.println("Closed Tickets" + totalClosed);

	}
}
