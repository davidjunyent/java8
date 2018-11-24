package com.dj.frases.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Frase implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String frase;
	private LocalDateTime dataCreacio;
	private transient String valorNoSerializable;

	public Frase(String frase) {
		this.frase = frase;
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

	public String getValorNoSerializable() {
		return valorNoSerializable;
	}

	@Override
	public String toString() {
		return getFrase();
	}
}
