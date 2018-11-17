package com.dj.frases.menu;

import com.dj.frases.io.InputOuput;

public class ExitOption implements Option {

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
