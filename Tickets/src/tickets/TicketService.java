package tickets;

public interface TicketService {
    Ticket getNextTicket();
    void storeTicket(Ticket ticket);
    boolean hasMoreTickets();
}
