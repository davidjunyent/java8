import java.util.Arrays;
import java.util.stream.Stream;

import tickets.TicketService;
import tickets.dependencyinjection.DIProvider;

public class MainUsingStreams2 {

	public static void main(String[] args) {

		TicketService ticketService = DIProvider.getDIProvider().geTicketService();
		
		 String result=Stream.generate(ticketService.getTicketSupplier())
		 .limit(500)
		 .flatMap(ticket -> Arrays.stream(ticket.getSummary().split("")))
		 .map( charOfSummary -> charOfSummary.toUpperCase())
		 .filter(charOfSummary ->
		 			charOfSummary.equals("A") 
				 || charOfSummary.equals("E") 
				 || charOfSummary.equals("I") 
				 || charOfSummary.equals("O") 
				 || charOfSummary.equals("U"))
		 .reduce("", (strChar1, strChar2) -> strChar1+strChar2);
		
		 System.out.println(result);

	}
}