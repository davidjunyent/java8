package com.dj.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Exception01 {

	public static void main(String[] args) {
		InputStream is =null;
		try{
			System.out.println("In try");
			is = new FileInputStream("prova.txt");
			is.read();
			
		}catch(IOException ioException) {
			System.out.println("In catch IO: "+ioException.getMessage());
		}catch (ArithmeticException 
				| NullPointerException 
				| ClassCastException exception) {
			System.out.println("In catch AE. NP or CC "+exception.getMessage());	
		}finally {
			try {
				is.close();
			} catch (IOException ioException) {
				System.out.println("In catch IO: "+ioException.getMessage());
			} 
		}			
	}
}
