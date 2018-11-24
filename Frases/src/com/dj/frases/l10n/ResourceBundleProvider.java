package com.dj.frases.l10n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleProvider {

	private static ResourceBundle resourceBundle = null;

	private ResourceBundleProvider() {
	}

	private static void init() {
		initForLocale(Locale.getDefault());
	}

	public static void initForLocale(Locale locale) {
		resourceBundle = ResourceBundle.getBundle("com/dj/frases/i18n/literals", locale);
	}

	public static String getLiteral(String key) {
		if (resourceBundle == null) {
			init();
		}
		if (resourceBundle.containsKey(key)) {
			return resourceBundle.getString(key);
		} else {
			return "?" + key;
		}
	}
}
