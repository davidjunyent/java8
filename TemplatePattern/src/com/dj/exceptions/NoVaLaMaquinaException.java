package com.dj.exceptions;

import com.dj.infusionstemplate.InfusionsTemplate;

public class NoVaLaMaquinaException extends NoEsPotServirException {
	private static final long serialVersionUID = 1L;
	private boolean trencada = false;

	public NoVaLaMaquinaException(boolean trencada, InfusionsTemplate infusio, String message, Throwable cause) {
		super(infusio, message, cause);
		this.trencada = trencada;
	}

	public NoVaLaMaquinaException(boolean trencada, InfusionsTemplate infusio, String message) {
		super(infusio, message);
		this.trencada = trencada;
	}

	public boolean esPotArreglar() {
		return !trencada;
	}

}
