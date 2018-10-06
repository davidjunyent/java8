package com.dj.infusionstemplate;

public class TeNegre extends InfusionsTemplate{

	@Override
	protected final void posarHerbes() {
		System.out.println("Poso te negre.");
	}

	@Override
	protected void afegirConduments() {
		System.out.println("Afegeixo una mica de llet.");
	}
	
	@Override
	public void servir() {
		System.out.println("Serveixo el te negre cantant.");
	}

}
