package com.dj.frases.data;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

import com.dj.frases.model.Frase;


public class FileSerializableFrasePersistence implements FrasesPersistence{
	private String fileName="frases_object.txt";
	@Override
	public void saveFrase(Frase frase) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName,true))){
			objectOutputStream.writeObject(frase);
			objectOutputStream.flush();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}

	@Override
	public List<Frase> getAllFrases() {
		List<Frase> frases = new ArrayList<>();
		try (FileInputStream fileInputStream =new FileInputStream(fileName)) { 
			Object object=null;
			do {
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				object = objectInputStream.readObject();
				frases.add((Frase) object);
				
			}while(object!=null);
		} catch (EOFException eofException) {
		} catch (StreamCorruptedException streamCorruptedException) {
			streamCorruptedException.printStackTrace();
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}	
		return frases;
	}

}
