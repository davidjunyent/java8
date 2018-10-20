package com.dj.exceptions;

public class MaquinaEspatlladaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private boolean esPotArreglar = true;

	public MaquinaEspatlladaException(boolean esPotArreglar) {
		this.esPotArreglar = esPotArreglar;
	}

	public boolean esPotArreglar() {
		return esPotArreglar;
	}
	
	
}
