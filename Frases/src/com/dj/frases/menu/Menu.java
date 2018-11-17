package com.dj.frases.menu;

import java.util.Arrays;
import java.util.List;

import com.dj.frases.io.InputOuput;
public class Menu {
	
	private String menuTitle; 
	private List<MenuOption> menuOptions;
	
	public Menu(String menuTitle,MenuOption ...menuOptions) {
		this.menuTitle=menuTitle;
		this.menuOptions=Arrays.asList(menuOptions);
		
	}
	public void start() {
		printMenu();
		
		MenuOption menuOption = readMenuOption();
		
		InputOuput.getInstance().clearScreen();
		menuOption.execute();
		InputOuput.getInstance().clearScreen();
		
		start();
	}
	
	private void printMenu() {
		InputOuput.getInstance().writeLine("--------------------------------------------------------");
		InputOuput.getInstance().writeLine(menuTitle);
		InputOuput.getInstance().writeLine("--------------------------------------------------------");
		int index=1;
		for(MenuOption menuOption:menuOptions){ 
			InputOuput.getInstance().writeLine(index+"-"+menuOption.getOptionLabel());
			index++;
		};
	}
	private MenuOption readMenuOption() {
		int opcio=-1;
		do {
			opcio=InputOuput.getInstance().readInt()-1;
		}while(opcio<0 || opcio>=menuOptions.size());
		return menuOptions.get(opcio);
	}	
}
