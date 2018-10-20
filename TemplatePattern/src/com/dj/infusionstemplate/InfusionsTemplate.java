package com.dj.infusionstemplate;

import com.dj.bar.Maquina;
import com.dj.exceptions.IngredientAcabatException;
import com.dj.exceptions.MaquinaEspatlladaException;
import com.dj.exceptions.NoEsPotServirException;
import com.dj.exceptions.NoVaLaMaquinaException;

public abstract class InfusionsTemplate {

	public final void ferInfusioo() throws NoEsPotServirException {
		bullirAigua();
		posarHerbes();
		afegirConduments();
		servir();
	}

	protected final void bullirAigua() throws NoVaLaMaquinaException {
		System.out.println("Posem aigua al foc.");
		try {
			Maquina.getInstance().bullir();
		} catch (MaquinaEspatlladaException mee) {
			System.out.println("OOOPS, s'ha espatllat la màquina !!");
			throw new NoVaLaMaquinaException(!mee.esPotArreglar(), this, "OOOPS, s'ha espatllat la màquina !!", mee);
		}

	}

	protected abstract void posarHerbes() throws IngredientAcabatException;

	protected abstract void afegirConduments() throws IngredientAcabatException;

	protected void servir() {
		System.out.println("El serveixo com em dona la gana.");
	}

}
