package tickets;

public class Ticket {
	private String summary;
	private String text;
	private TicketStatus status;
	private Priority priority;
	
	public enum Priority{
		LOW, MEDIUM, HIGHT;
	}
	
	public Ticket(String summary, String text) {
		this.summary = summary;
		this.text = text;
		this.status = TicketStatus.OPEN;
		this.priority=Priority.MEDIUM;
	}
	
	public static boolean isTicketClosed(Ticket ticket) {
		return ticket.getStatus()==TicketStatus.CLOSED;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TicketStatus getStatus() {
		return status;
	}

	public void setStatus(TicketStatus status) {
		this.status = status;
	}
	public Priority getPriority() {
		return priority;
	}

}
