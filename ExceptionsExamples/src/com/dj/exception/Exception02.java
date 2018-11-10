package com.dj.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
/**
 * Exception01 with try with resources
 * (class implements java.lang.Autocloseable (java7))
 */
public class Exception02 {

	public static void main(String[] args) {
		try (
				InputStream is = new FileInputStream("prova.txt");
				//... Un altre classe java.lang.Autocloseable
			){
			System.out.println("In try");
			is.read();
		}catch(IOException ioException) {
			System.out.println("In catch IO: "+ioException.getMessage());
		}catch (ArithmeticException 
				| NullPointerException 
				| ClassCastException exception) {
			System.out.println("In catch AE. NP or CC "+exception.getMessage());	
		}		
	}
}
