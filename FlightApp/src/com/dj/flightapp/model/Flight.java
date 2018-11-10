package com.dj.flightapp.model;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class Flight {
	private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private final FlightLine flightLine;
	private final LocalDateTime departureDateTime;

	public Flight(FlightLine flightLine, LocalDateTime departureDateTime) {
		this.flightLine = flightLine;
		this.departureDateTime = departureDateTime;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("Fly from " + flightLine.getOrigin());
		result.append(" at " + departureDateTime.format(DATE_FORMAT));
		result.append(" arrives to " + flightLine.getDestination());
		result.append(" at " + getDestinationArrivalZoneDateTime().toLocalDateTime().format(DATE_FORMAT));
		return result.toString();
	}

	public ZonedDateTime getOriginDepartureZoneDateTime() {
		ZonedDateTime originDateTime = departureDateTime.atZone(flightLine.getOrigin().getZoneId());
		return originDateTime;
	}

	public ZonedDateTime getDestinationArrivalZoneDateTime() {
		ZonedDateTime originDateTime = departureDateTime.atZone(flightLine.getDestination().getZoneId());
		ZonedDateTime originArrivalDateTime = originDateTime.plus(flightLine.getDuration());
		return originArrivalDateTime;
	}

	public boolean isFlying(Instant when) {
		Instant sortida=getOriginDepartureZoneDateTime().toInstant();
		Instant arrivada=getDestinationArrivalZoneDateTime().toInstant();
		return when.isBefore(arrivada) && when.isAfter(sortida) ;
		
	}

}
