package tickets;

public enum TicketStatus {
	OPEN(10, "Opened :-("), STARTED(7, "Started :-|"), COMPLETED(4, "Completed :-)"), CLOSED(0, "Closed :-D") {
		@Override
		public String getMessage() {
			return "YUJU! " + super.getMessage();
		}
	};

	private int weight;
	private String message;

	private TicketStatus(int weight, String message) {
		this.weight = weight;
		this.message = message;
	}

	public int getWeight() {
		return weight;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return message;
	}

}
