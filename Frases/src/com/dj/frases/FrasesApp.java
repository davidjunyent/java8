package com.dj.frases;

import com.dj.frases.data.FileFrasePersistence;
import com.dj.frases.data.FrasesPersistence;
import com.dj.frases.menu.ExitOption;
import com.dj.frases.menu.Menu;
import com.dj.frases.menu.ShowReadedOption;
import com.dj.frases.menu.WriteNewOption;

public class FrasesApp {

	public static void main (String args[]) {
		
		FrasesPersistence frasesPersistence = new FileFrasePersistence();
		
		Menu main = new Menu("Frases APP",
							new WriteNewOption(frasesPersistence),
							new ShowReadedOption(frasesPersistence),
							new ExitOption());
		
		main.start();
	}
	
}
