package com.dj.exceptions;

import com.dj.infusionstemplate.InfusionsTemplate;

public class NoEsPotServirException extends Exception {

	private static final long serialVersionUID = 1L;
	private InfusionsTemplate infusio;

	public NoEsPotServirException(InfusionsTemplate infusio, String message, Throwable cause) {
		super(message, cause);
		this.infusio = infusio;
	}

	public NoEsPotServirException(InfusionsTemplate infusio, String message) {
		super(message);
		this.infusio = infusio;
	}

	public InfusionsTemplate getInfusio() {
		return infusio;
	}
}
