package com.dj.stream;
import java.util.stream.Stream;

public class Stream08 {

	/**
	 * Conta Strings que comencen per a
	 */
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeuuu","aqui","alla","ara","despres");
		
		long result= stream.filter(paraula->paraula.startsWith("a")).count();
		
		System.out.println(result);

	}
}
