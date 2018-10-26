package tickets.dependencyinjection;

import tickets.TicketService;
import tickets.service.MockTicketService;

public interface DIProvider {
    
    TicketService geTicketService();
    
    static DIProvider getDIProvider() {
	return new DIProvider() {
	    @Override
	    public TicketService geTicketService() {
		return new MockTicketService();
	    }
	};
    }
}
