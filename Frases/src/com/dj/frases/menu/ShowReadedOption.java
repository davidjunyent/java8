package com.dj.frases.menu;

import static com.dj.frases.l10n.ResourceBundleProvider.getLiteral;

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
		return getLiteral("veureFrases");
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine("\n"+getLiteral("veureFrases")+"\n");
		frasesPersistence.getAllFrases().stream()
									.map(Frase::toString)
									.forEach(InputOuput.getInstance()::writeLine);
	}

}
