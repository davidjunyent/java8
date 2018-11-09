package com.dj.stream;
import java.util.stream.Stream;

public class Stream07 {

	/**
	 * Pinta primera lletra de tots els strings > 3 caracters ordenats per longitud de String
	 */
	
	public static void main (String args[]) {
		
		Stream<String> stream=Stream.of("hola","adeuuu","aqui","ara","despres");
		stream.filter(paraula -> paraula.length() > 3)
				.peek(System.out::println)
				.sorted((paraula1 , paraula2) -> paraula1.length()-paraula2.length())
				.peek(System.out::println)
				.map(paraula -> paraula.charAt(0))
				.forEach(System.out::println);

	}

}
