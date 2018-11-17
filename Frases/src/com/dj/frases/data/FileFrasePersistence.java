package com.dj.frases.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.dj.frases.model.Frase;


public class FileFrasePersistence implements FrasesPersistence{
	private String fileName="frases.txt";
	@Override
	public void saveFrase(Frase frase) {
		try (FileWriter fileWriter = new FileWriter(new File(fileName),true)){
			fileWriter.write(frase.getFrase());
			fileWriter.write("\n");
			fileWriter.flush();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	@Override
	public List<Frase> getAllFrases() {
		List<Frase> frases = new ArrayList<>();
		try (FileReader fileReader = new FileReader(new File(fileName));
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				) { 
			String line="";
			while ((line = bufferedReader.readLine()) != null) {
				frases.add(new Frase(line));
			}
			
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}	
		return frases;
	}

}
