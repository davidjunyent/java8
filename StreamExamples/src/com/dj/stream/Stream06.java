package com.dj.stream;
import java.util.stream.Stream;

public class Stream06 {

	/**
	 * Pinta primera lletra de tots els strings > 3 caracters ordenats alfabeticament
	 */
	
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeuuu","aqui","ara","despres");
		stream.filter(paraula -> paraula.length() > 3)
				.map(paraula -> paraula.charAt(0))
				.sorted()
				.forEach(System.out::println);

	}
}
