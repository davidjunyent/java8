package com.dj.frases.menu;

import java.util.Arrays;
import java.util.List;

import com.dj.frases.io.InputOuput;
public class Menu {
	
	private String menuTitle; 
	private List<Option> menuOptions;
	
	public Menu(String menuTitle,Option ...menuOptions) {
		this.menuTitle=menuTitle;
		this.menuOptions=Arrays.asList(menuOptions);
		
	}
	public void display() {
		InputOuput.getInstance().writeLine("--------------------------------------------------------");
		InputOuput.getInstance().writeLine(menuTitle);
		InputOuput.getInstance().writeLine("--------------------------------------------------------");
		int index=1;
		for(Option menuOption:menuOptions){ 
			InputOuput.getInstance().writeLine(index+"-"+menuOption.getOptionLabel());
			index++;
		};
	}
	public Option readMenuOption() {
		int opcio=-1;
		do {
			opcio=InputOuput.getInstance().readInt()-1;
		}while(opcio<0 || opcio>=menuOptions.size());
		return menuOptions.get(opcio);
	}
	public boolean isAppOn() {
		return true;
	}
}
