package com.dj.exceptions;

public class IngredientOutOfStockException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IngredientOutOfStockException(String missatge) {
		super(missatge);
	}
}
