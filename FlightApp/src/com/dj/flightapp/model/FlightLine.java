package com.dj.flightapp.model;

import java.time.Duration;

public final class FlightLine {
	private final City origin;
	private final City destination;
	private final Duration duration;
	
	public FlightLine(City origin, City destination, Duration duration) {
		if(origin==null || destination==null) {
			throw new IllegalArgumentException("Origin and destination cannot be null");
		}
		if(duration==null || duration.isZero() || duration.isNegative()) {
			throw new IllegalArgumentException("Invalid duration parameter");
		}	
		this.origin = origin;
		this.destination = destination;
		this.duration = duration;
	}
	
	public FlightLine(City origin, City destination, int hours, int minutes) {
		this(origin,destination,Duration.ofHours(hours).plusMinutes(minutes));
	}
	
	public City getOrigin() {
		return origin;
	}
	public City getDestination() {
		return destination;
	}
	public Duration getDuration() {
		return duration;
	}
	
}
