package com.dj.frases.menu;
import com.dj.frases.data.FrasesPersistence;
import com.dj.frases.io.InputOuput;
import com.dj.frases.model.Frase;

public class WriteNewOption implements MenuOption {
	private FrasesPersistence frasesPersistence;
	
	public WriteNewOption(FrasesPersistence frasesPersistence) {
		this.frasesPersistence=frasesPersistence;
	}
	
	@Override
	public String getOptionLabel() {
		return "Introduir nova frase";
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine("Introduir nova frase:");
		frasesPersistence.saveFrase(new Frase(InputOuput.getInstance().readLine()));
	}

}
