package com.dj.frases;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteNewOption implements MenuOption {

	@Override
	public String getOptionLabel() {
		return "Introduir nova frase";
	}

	@Override
	public void execute() {
		InputOuput.getInstance().writeLine("Introduir nova frase:");
		
		try (FileWriter fileWriter = new FileWriter(new File("prova.txt"),true)){
			String frase=InputOuput.getInstance().readLine();
			fileWriter.write(frase);
			fileWriter.write("\n");
			fileWriter.flush();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}			
	}

}
