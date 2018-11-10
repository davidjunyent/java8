package com.dj.flightapp.model;

import java.time.ZoneId;

public final class City {
	private final String name;
	private final ZoneId zoneId;
	
	public City(String name, ZoneId zoneId) {
		super();
		this.name = name;
		this.zoneId = zoneId;
	}

	public String getName() {
		return name;
	}

	public ZoneId getZoneId() {
		return zoneId;
	}

	@Override
	public String toString() {
		return getName();
	}
}
