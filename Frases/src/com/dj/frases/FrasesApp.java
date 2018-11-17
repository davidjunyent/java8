package com.dj.frases;


import com.dj.frases.data.FileSerializableFrasePersistence;
import com.dj.frases.data.FrasesPersistence;
import com.dj.frases.menu.ExitOption;
import com.dj.frases.menu.Menu;
import com.dj.frases.menu.Option;
import com.dj.frases.menu.ShowReadedOption;
import com.dj.frases.menu.WriteNewOption;

public class FrasesApp {

	public static void main (String args[]) {
		
		FrasesPersistence frasesPersistence = new FileSerializableFrasePersistence();
		
		Menu menu = new Menu("Frases APP",
							new WriteNewOption(frasesPersistence),
							new ShowReadedOption(frasesPersistence),
							new ExitOption());
		
		
		Option option=null;
		do {
			menu.display();
			option=menu.readMenuOption();
			option.execute();
		}while(menu.isAppOn());
	}
	
}
