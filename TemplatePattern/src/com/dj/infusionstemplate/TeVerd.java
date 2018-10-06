package com.dj.infusionstemplate;

public class TeVerd extends InfusionsTemplate{

	@Override
	protected final void posarHerbes() {
		System.out.println("Poso te verd.");
	}

	@Override
	protected void afegirConduments() {
		System.out.println("Afegir sucre.");
	}
	
	@Override
	public void servir() {
		System.out.println("Serveixo el te verd amb una safata vermella.");
	}

}
