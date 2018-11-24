package com.dj.frases.menu;

import com.dj.frases.io.InputOuput;
import static com.dj.frases.l10n.ResourceBundleProvider.getLiteral;




public class ExitOption implements Option {

	@Override
	public String getOptionLabel() {
		return getLiteral("sortir");
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine(getLiteral("sortint"));
		System.exit(0);
	}
}
