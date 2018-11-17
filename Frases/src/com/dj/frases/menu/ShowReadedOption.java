package com.dj.frases.menu;

import com.dj.frases.data.FrasesPersistence;
import com.dj.frases.io.InputOuput;
import com.dj.frases.model.Frase;

public class ShowReadedOption implements Option {

	private FrasesPersistence frasesPersistence;
	
	public ShowReadedOption(FrasesPersistence frasesPersistence) {
		this.frasesPersistence=frasesPersistence;
	}
	
	@Override
	public String getOptionLabel() {
		return "Veure frases guardades";
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine("\nFrases guardades:\n");
		frasesPersistence.getAllFrases().stream()
									.map(Frase::toString)
									.forEach(InputOuput.getInstance()::writeLine);
	}

}
