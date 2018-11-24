package com.dj.frases.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static com.dj.frases.l10n.ResourceBundleProvider.getLiteral;

public class InputOuput {

	private static InputOuput instance;
	
	private BufferedReader bufferedReader;
	
	private PrintWriter printWriter;
	
	private InputOuput () {
		bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		printWriter=new PrintWriter(System.out);
	}

	public static InputOuput getInstance() {
		if(instance==null) {
			instance= new InputOuput();
		}
		return instance;
	}
	
	public String readLine() {
		try {
			return bufferedReader.readLine();
		} catch (IOException ioException) {
 			ioException.printStackTrace();
 			return "";
		}
	}
	public String readLine(String prompt) {
		displayLine(prompt);
		return this.readLine();
	}
	public int readInt() {
		int option=-1;
		try {
			option=Integer.valueOf(bufferedReader.readLine());
		}catch (NumberFormatException numberFormatException) {
			displayLine(getLiteral("valorIncorrecte"));
			return readInt();
		}catch (IOException ioException) {
			ioException.printStackTrace();;
		}
		return option;
	}
	public void writeLine(String line) {
		printWriter.println(line);
		printWriter.flush();
	}
	public void clearScreen() {  
		InputOuput.getInstance().writeLine("");
	}  
	private void displayLine(String line) {
		writeLine(line);
	}
}
