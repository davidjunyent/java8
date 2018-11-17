package com.dj.frases;



public class FrasesApp {

	public static void main (String args[]) {
		
		
		Menu main = new Menu("Frases APP",
							new WriteNewOption(),
							new ShowReadedOption(),
							new ExitOption());
		
		main.start();
	}
	
}
