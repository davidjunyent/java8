package com.dj.frases.model;

import java.time.LocalDateTime;

public class Frase {

	private Integer id;
	private String frase;
	private LocalDateTime dataCreacio;
	
	public Frase(String frase) {
		this.frase=frase;
	}
	public Integer getId() {
		return id;
	}
	public String getFrase() {
		return frase;
	}
	public LocalDateTime getDataCreacio() {
		return dataCreacio;
	}
	@Override
	public String toString() {
		return getFrase();
	}
}
