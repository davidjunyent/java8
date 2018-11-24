package com.dj.frases.menu;

import static com.dj.frases.l10n.ResourceBundleProvider.getLiteral;

import java.util.Locale;

import com.dj.frases.io.InputOuput;
import com.dj.frases.l10n.ResourceBundleProvider;

public class ChangeLanguageOption implements Option {
	
	public ChangeLanguageOption() {
	}
	
	@Override
	public String getOptionLabel() {
		return getLiteral("changeLocale");
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine(getLiteral("introIdioma")+": [EN, FR, DEFAULT ]");
		String tagLocale=InputOuput.getInstance().readLine();
		ResourceBundleProvider.initForLocale(Locale.forLanguageTag(tagLocale));
	}

}
