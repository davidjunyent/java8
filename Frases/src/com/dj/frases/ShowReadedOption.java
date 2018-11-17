package com.dj.frases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ShowReadedOption implements MenuOption {

	@Override
	public String getOptionLabel() {
		return "Veure frases guardades";
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine("Frases guardades");
				
		try (FileReader fileReader = new FileReader(new File("prova.txt"));
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				) { 
			String line="";
			while ((line = bufferedReader.readLine()) != null) {
				InputOuput.getInstance().writeLine(line);
			}
			
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}	
	}

}
