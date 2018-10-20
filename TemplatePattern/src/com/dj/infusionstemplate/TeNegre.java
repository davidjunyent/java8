package com.dj.infusionstemplate;

import com.dj.bar.Rebost;

public class TeNegre extends InfusionsTemplate{

	@Override
	protected final void posarHerbes() {
		System.out.println("Poso te negre.");
	}

	@Override
	protected void afegirConduments() {
		System.out.println("Afegeixo una mica de llet.");
		Rebost.getInstance().consumeixIngredient(10);
	}
	
	@Override
	public void servir() {
		System.out.println("Serveixo el te negre cantant.");
		Rebost.getInstance().consumeixIngredient(10);
	}

}
