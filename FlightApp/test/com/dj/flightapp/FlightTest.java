package com.dj.flightapp;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

import com.dj.flightapp.model.City;
import com.dj.flightapp.model.Flight;
import com.dj.flightapp.model.FlightLine;

class FlightTest {

	@Test
	void testGetOriginDepartureZoneDateTime() {
		ZonedDateTime expResult = ZonedDateTime.now();
		
		Flight flight = new Flight(
				new FlightLine(new City("Aqui",expResult.getZone()),
						new City("Alla",ZoneId.of("America/New_York"))
						, 10,0)
				, expResult.toLocalDateTime());
				
		ZonedDateTime result = flight.getOriginDepartureZoneDateTime();
		assertEquals(expResult, result);
	}

	@Test
	void testGetDestinationArrivalZoneDateTime() {
		Duration durada=Duration.ofHours(10).plusMinutes(30);
		ZonedDateTime expResult = ZonedDateTime.now();
		LocalDateTime horaSortida=expResult.
				withZoneSameInstant(ZoneId.of("America/New_York")).
				minus(durada).toLocalDateTime();
		
		
		Flight flight = new Flight(
				new FlightLine(new City("Aqui",expResult.getZone()),
						new City("Alla",ZoneId.of("America/New_York"))
						, 10,0)
				, horaSortida);
				
		ZonedDateTime result = flight.getDestinationArrivalZoneDateTime();
		assertEquals(expResult, result);
	}

	@Test
	void testIsFlyingDurant() {
		
		Instant when = Instant.now();
		LocalDateTime horaSortida= when.atZone(ZoneId.of("America/New_York")).minusHours(3).toLocalDateTime();
				
		Flight flight = new Flight(
				new FlightLine(new City("Alla",ZoneId.of("America/New_York")),
						new City("Aqui", ZoneId.systemDefault())
						, 5,0)
				, horaSortida);
		
		boolean result= flight.isFlying(when);
		assertEquals(true, result);
	}
	@Test
	void testIsFlyingDespres() {
		
		Instant when = Instant.now();
		LocalDateTime horaSortida= when.atZone(ZoneId.of("America/New_York")).plusHours(8).toLocalDateTime();
		Flight flight = new Flight(
				new FlightLine(new City("Alla",ZoneId.of("America/New_York")),
						new City("Aqui", ZoneId.systemDefault())
						, 5,0)
				, horaSortida);
		
		boolean result= flight.isFlying(when);
		assertEquals(false, result);
	}
	@Test
	void testIsFlyingAbans() {
		Instant when = Instant.now();
		LocalDateTime horaSortida= when.atZone(ZoneId.of("America/New_York")).plusHours(2).toLocalDateTime();
				
		Flight flight = new Flight(
				new FlightLine(new City("Alla",ZoneId.of("America/New_York")),
						new City("Aqui", ZoneId.systemDefault())
						, 5,0)
				, horaSortida);
		
		boolean result= flight.isFlying(when);
		assertEquals(false, result);
	}


}
