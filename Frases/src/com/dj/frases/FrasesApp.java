package com.dj.frases;


import com.dj.frases.data.FrasesPersistence;
import com.dj.frases.data.JDBCFrasesPersistence;
import com.dj.frases.menu.ChangeLanguageOption;
import com.dj.frases.menu.ExitOption;
import com.dj.frases.menu.Menu;
import com.dj.frases.menu.Option;
import com.dj.frases.menu.ShowReadedOption;
import com.dj.frases.menu.WriteNewOption;
import static com.dj.frases.l10n.ResourceBundleProvider.getLiteral;


public class FrasesApp {

	public static void main (String args[]) {
		
		FrasesPersistence frasesPersistence = new JDBCFrasesPersistence();
		
		Menu menu = new Menu(getLiteral("frasesAPP"),
							new WriteNewOption(frasesPersistence),
							new ShowReadedOption(frasesPersistence),
							new ChangeLanguageOption(),
							new ExitOption());
		
		
		Option option=null;
		do {
			menu.display();
			option=menu.readMenuOption();
			option.execute();
		}while(menu.isAppOn());
	}
	
}
