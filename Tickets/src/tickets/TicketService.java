package tickets;

import java.util.function.Supplier;

public interface TicketService {
    void storeTicket(Ticket ticket);
    boolean hasMoreTickets();
    Supplier<Ticket> getTicketSupplier();
}
