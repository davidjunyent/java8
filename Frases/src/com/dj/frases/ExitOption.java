package com.dj.frases;

public class ExitOption implements MenuOption {

	@Override
	public String getOptionLabel() {
		return "Sortir";
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine("Sortint...");
		System.exit(0);
	}
}
