package com.dj.infusionstemplate;

public abstract class InfusionsTemplate {
	
	public final void ferInfusioo() {
		bullirAigua();
		posarHerbes();
		afegirConduments();
		servir();
	}

	protected final void bullirAigua() {
		System.out.println("Posem aigua al foc.");
	}
	protected abstract void posarHerbes();
		
	protected abstract void afegirConduments();
	
	protected  void servir() {
		System.out.println("El serveixo com em dona la gana.");
	}
	
}
