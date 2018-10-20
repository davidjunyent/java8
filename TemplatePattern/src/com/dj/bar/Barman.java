package com.dj.bar;

import com.dj.exceptions.NoEsPotServirException;
import com.dj.exceptions.NoVaLaMaquinaException;
import com.dj.infusionstemplate.InfusionsTemplate;

public class Barman {

	public void fesInsusio(InfusionsTemplate... infusions) throws NoEsPotServirException {
		Maquina.getInstance().egenga();
		for (InfusionsTemplate insfusio : infusions) {
			try {
				insfusio.ferInfusioo();
			} catch (NoVaLaMaquinaException nvlme) {
				if(nvlme.esPotArreglar()) {
					Maquina.getInstance().arregla();
				}else {
					throw new NoEsPotServirException(insfusio, "S'ha espatllat la maquina i no es pot arreglar!!");
				}
			} catch (NoEsPotServirException nepse) {
				System.out.println("Ho sento, no es pot servir la infusió" + nepse.getInfusio() + nepse.getMessage());
				nepse.printStackTrace();
			}finally {
				Maquina.getInstance().apaga();
			}
		}
	}
}
