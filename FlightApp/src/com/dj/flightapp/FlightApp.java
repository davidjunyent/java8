package com.dj.flightapp;

import java.time.LocalDateTime;
import java.time.ZoneId;

import com.dj.flightapp.model.City;
import com.dj.flightapp.model.Flight;
import com.dj.flightapp.model.FlightLine;


public class FlightApp {
		
	public static void main(String args[]) {
		
		City barcelona = new City("Barcelona", ZoneId.of("Europe/Madrid"));
		City moscow = new City("Moscow", ZoneId.of("Europe/Moscow"));
		
		FlightLine flightLine= new FlightLine(barcelona, moscow, 4, 20);
		
		Flight flight = new Flight(flightLine, LocalDateTime.of(2018,11,10,14,00));
		
		System.out.println(flight);
	}
	
}
