import java.util.stream.Stream;

import tickets.Ticket;
import tickets.TicketService;
import tickets.TicketStatus;
import tickets.dependencyinjection.DIProvider;

public class MainUsingStreams {

	public static void main(String[] args) {

		TicketService ticketService = DIProvider.getDIProvider().geTicketService();

		Stream<Ticket> stream = Stream.generate(ticketService.getTicketSupplier()).limit(100);

		//with lambda
		long ticketsNotClosed = stream.filter(ticket -> ticket.getStatus() != TicketStatus.CLOSED).count();
		System.out.println("Tickets not closed " + ticketsNotClosed);

		//with static method reference
		stream = Stream.generate(ticketService.getTicketSupplier()).limit(100);		
		long ticketsClosed = stream.filter(Ticket::isTicketClosed).count();
		System.out.println("Tickets closed " + ticketsClosed);
		

		stream = Stream.generate(ticketService.getTicketSupplier()).limit(100);
		
		stream.filter(ticket -> ticket.getStatus()==TicketStatus.OPEN)
			 .filter(ticket -> ticket.getText().contains("2"))
			 .map(tk -> tk.getSummary())
			 .forEach(System.out::println);
 

	}
}