package com.dj.bar;

import com.dj.exceptions.MaquinaEspatlladaException;

public class Maquina {

	private static Maquina maquina;

	private boolean funciona = true;
	private boolean esPotArreglar = true;

	private Maquina() {

	}

	public static Maquina getInstance() {
		if (maquina == null) {
			maquina = new Maquina();
		}
		return maquina;
	}

	public void egenga() {
		System.out.println("Engegant maquina...");

	}

	public void arregla() {
		System.out.println("Arreglando maquina...");
		if (esPotArreglar)
			funciona = true;

	}

	public void bullir() {
		if (funciona) {
			if (Math.random() > 0.8) {
				this.funciona = false;
				this.esPotArreglar = Math.random() > 0.5;
				throw new MaquinaEspatlladaException(esPotArreglar);
			}
		}
	}

	public boolean isEspatllada() {
		return !esPotArreglar;
	}

	public void apaga() {
		System.out.println("Apagant maquina...");

	}

}
