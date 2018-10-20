package com.dj.exceptions;

import com.dj.infusionstemplate.InfusionsTemplate;

public class IngredientAcabatException extends NoEsPotServirException {
	private static final long serialVersionUID = 1L;

	public String ingredient;

	public IngredientAcabatException(String ingredient, InfusionsTemplate infusio, String message, Throwable cause) {
		super(infusio, message, cause);
		this.ingredient = ingredient;
	}

	public IngredientAcabatException(String ingredient, InfusionsTemplate infusio, String message) {
		super(infusio, message);
		this.ingredient = ingredient;
	}

	public String getIngredient() {
		return ingredient;
	}

}
