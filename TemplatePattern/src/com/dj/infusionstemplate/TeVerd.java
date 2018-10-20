package com.dj.infusionstemplate;

import com.dj.bar.Rebost;

public class TeVerd extends InfusionsTemplate{

	@Override
	protected final void posarHerbes() {
		System.out.println("Poso te verd.");
		Rebost.getInstance().consumeixIngredient(10);
	}

	@Override
	protected void afegirConduments() {
		System.out.println("Afegir sucre.");
		Rebost.getInstance().consumeixIngredient(10);
	}
	
	@Override
	public void servir() {
		System.out.println("Serveixo el te verd amb una safata vermella.");
	}

}
