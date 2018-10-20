package com.dj.bar;

import com.dj.exceptions.IngredientOutOfStockException;

public class Rebost {

	private static Rebost rebost;
	private int stockIngredients;

	private Rebost() {
		stockIngredients = 100;
	}

	public static Rebost getInstance() {
		if (rebost == null) {
			rebost = new Rebost();
		}
		return rebost;
	}

	public void consumeixIngredient(int quantitat) {
		assert (quantitat > 0);
		stockIngredients -= quantitat;
		if(stockIngredients<0) {
			throw new IngredientOutOfStockException("No tenim stock!! Revisa el el Rebost!!");
		}
	}

	public int getStockIngredients() {
		return stockIngredients;
	}
	
	
}
