package com.dj.frases.menu;
import static com.dj.frases.l10n.ResourceBundleProvider.getLiteral;

import java.time.LocalDateTime;

import com.dj.frases.data.FrasesPersistence;
import com.dj.frases.io.InputOuput;
import com.dj.frases.model.Frase;

public class WriteNewOption implements Option {
	private FrasesPersistence frasesPersistence;
	
	public WriteNewOption(FrasesPersistence frasesPersistence) {
		this.frasesPersistence=frasesPersistence;
	}
	
	@Override
	public String getOptionLabel() {
		return getLiteral("novaFrase");
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine("\n"+getLiteral("novaFrase")+"\n");
		Frase frase = new Frase(InputOuput.getInstance().readLine());
		frase.setDataCreacio(LocalDateTime.now());
		frasesPersistence.saveFrase(frase);
	}

}
