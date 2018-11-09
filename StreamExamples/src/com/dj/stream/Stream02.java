package com.dj.stream;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream02 {

	/**
	 * Treu tots els caracters dels streams.
	 */
	
	public static void main (String args[]) {

		Stream<String> stream=Stream.of("hola","adeu","aqui","alla");
		stream.flatMap(paraula -> Arrays.stream(paraula.split("")))
				.forEach(System.out::println);;

	}
}
